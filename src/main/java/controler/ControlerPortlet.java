package controler;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import service.model.Vacancies;
import service.service.VacanciesLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ProcessAction;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

/**
 * @author Korotkov Sergey
 */
public class ControlerPortlet extends MVCPortlet {

    private String nameVacancy;
    private String nameCity;


    @ProcessAction(name = "getRequest")
    public void getRequest(ActionRequest actionRequest, ActionResponse actionResponse) {

        UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
        nameVacancy = uploadRequest.getParameter("nameVacancy");
        nameCity = uploadRequest.getParameter("nameCity");

        String incomingJson = sendHTTPSrequest(nameVacancy, nameCity);
        saveVacancies(incomingJson);
    }

    private String sendHTTPSrequest(String nameVacancy, String nameCity) {

        String strUrl = "https://api.hh.ru/vacancies?area=" + nameCity + "&specialization=" + nameVacancy + "&page=1&per_page=50";
        StringBuilder content = new StringBuilder();
        final URL url;

        try {
            url = new URL(strUrl);
            final HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();

        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (ProtocolException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return content.toString();
    }

    private void saveVacancies(String incomingJson) {

        try {

            JSONObject jsonObjectMain = new JSONObject(incomingJson);
            JSONArray jsonArray = jsonObjectMain.getJSONArray("items");

            if (jsonArray.length() != 0) {
                for (int i = 0; i < jsonArray.length(); i++) {
                    long id = CounterLocalServiceUtil.increment();
                    Vacancies vacances = VacanciesLocalServiceUtil.createVacancies(id);
                    JSONObject vacanseFromJson = jsonArray.getJSONObject(i);

                    vacances.setIdVacancies(id);

                    if (checNullObject(vacanseFromJson.get("name"))) {
                        vacances.setNameVacancy(vacanseFromJson.getString("name"));
                    } else {
                        vacances.setNameVacancy("");
                    }

                    StringBuilder fillSalary = new StringBuilder();
                    if (checNullObject(vacanseFromJson.get("salary")) && checNullObject(vacanseFromJson.getJSONObject("salary").get("from"))) {
                        fillSalary.append("от " + vacanseFromJson.getJSONObject("salary").getInt("from"));
                    }

                    if (checNullObject(vacanseFromJson.get("salary")) && checNullObject(vacanseFromJson.getJSONObject("salary").get("to"))) {
                        fillSalary.append(" до " + vacanseFromJson.getJSONObject("salary").getInt("to"));
                    }

                    if (checNullObject(vacanseFromJson.get("salary"))) {
                        fillSalary.append(" " + vacanseFromJson.getJSONObject("salary").getString("currency"));
                    }
                    vacances.setSalary(fillSalary.toString());

                    if (checNullObject(vacanseFromJson.getJSONObject("employer").get("name"))) {
                        vacances.setEmployer(vacanseFromJson.getJSONObject("employer").getString("name"));
                    } else {
                        vacances.setEmployer("");
                    }
                    vacances.setPublished_at(vacanseFromJson.getString("published_at"));
                    vacances.setNumberVacancy(vacanseFromJson.getString("id"));
                    vacances = VacanciesLocalServiceUtil.addVacancies(vacances);
                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        } catch (SystemException e) {
            e.printStackTrace();
        }

    }

    @ProcessAction(name = "deletAllVacanse")
    public static void deletAllVacanse(ActionRequest actionRequest, ActionResponse actionResponse) throws SystemException, PortalException {
        List<Vacancies> vacance = VacanciesLocalServiceUtil.getVacancieses(0, VacanciesLocalServiceUtil.getVacanciesesCount());
        for (Vacancies empVacanse : vacance) {
            VacanciesLocalServiceUtil.deleteVacancies(empVacanse.getIdVacancies());
        }
    }

    public static boolean checNullObject(Object jsonObject) {
        if (jsonObject.getClass().getName().equals("org.json.JSONObject$Null")) {
            return false;
        } else return true;
    }

}