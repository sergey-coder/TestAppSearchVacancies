<%@ taglib prefix="liferay-theme" uri="http://java.sun.com/portlet_2_0" %>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet" %>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="service.service.VacanciesLocalServiceUtil" %>

<liferay-theme:defineObjects/>

<%
    String currentURL = PortalUtil.getCurrentURL(request);
%>

<portlet:renderURL var="homeURL"/>
<a href="<%=homeURL%>">Вернуться назад</a>
<br>
<liferay-portlet:renderURL varImpl="iteratorURL"> <portlet:param name="mvcPath" value="/JSP/listVacancies.jsp"/>
</liferay-portlet:renderURL>

<liferay-ui:search-container iteratorURL="<%=iteratorURL%>" delta="25" deltaConfigurable="trau">
    <liferay-ui:search-container-results
            results="<%=VacanciesLocalServiceUtil.getVacancieses(searchContainer.getStart(),searchContainer.getEnd())%>"
            total="<%= VacanciesLocalServiceUtil.getVacanciesesCount()%>"/>

    <liferay-ui:search-container-row
            className="service.model.Vacancies"
            modelVar="Entry"
    >
        <portlet:renderURL var="rowURL">
            <portlet:param name="id" value="<%= String.valueOf(Entry.getPrimaryKey()) %>"/>
            <portlet:param name="backURL" value="<%=currentURL%>"/>
            <portlet:param name="mvcPath" value="/JSP/infoOnVacancy.jsp"/>
        </portlet:renderURL>

        <liferay-ui:search-container-column-text property="idVacancies" name="Номер вакансии"/>
        <liferay-ui:search-container-column-text property="nameVacancy" name="Наименование вакансии"/>
        <liferay-ui:search-container-column-text property="salary" name="Заработная плата"/>
        <liferay-ui:search-container-column-text property="employer" name="Наименование работодателя"/>
        <liferay-ui:search-container-column-text property="published_at" name="Дата публикации"/>
        <liferay-ui:search-container-column-text href="<%=rowURL%>" value="нажмите для просмотра"
                                                 name="Просмотр вакансии"/>

    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

