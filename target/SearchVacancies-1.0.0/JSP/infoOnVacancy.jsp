
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="service.model.Vacancies" %>
<%@ page import="service.service.VacanciesLocalServiceUtil" %>


<%
    long id = ParamUtil.getLong(request, "id");
    Vacancies vacances = VacanciesLocalServiceUtil.getVacancies(id);
    request.setAttribute("vacances", vacances);
    String redirect = ParamUtil.getString(request, "backURL");
%>

<h1>ИНФОРМАЦИЯ О ВАКАНСИИ</h1>
<h3>ID Вакансии :<%=vacances.getIdVacancies()%></h3>
<h3>Наименование вакансии :<%=vacances.getNameVacancy()%></h3>
<h3>Заработная плата :<%=vacances.getSalary()%></h3>
<h3>Наименование работодателя :<%=vacances.getEmployer()%></h3>
<h3>Дата публикации :<%=vacances.getPublished_at()%></h3>
<br>
<br>

<a href="<%=redirect%>">Вернуться назад</a><br/>
