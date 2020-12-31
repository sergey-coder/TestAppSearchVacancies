<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet" %>
<%@page language="java" contentType="text/html; charset=utf-8" %>
<portlet:defineObjects/>

<%String currentURL = PortalUtil.getCurrentURL(request);%>

<h4>Приложение для запроса вакансий с сайта HH.ru</h4>
<br/>

<form id="form"
      name="form"
      method="post"
        <portlet:actionURL name="getRequest" var="getRequestURL"/>
      enctype="multipart/form-data" action="<%=getRequestURL%>">

    <p class="aui-field"
       style="width: 100px">
        <aui:select label="Выберете специализацию:"
                    id="nameVacancy"
                    name="nameVacancy"
                    required="true"
                    changesContext="true">
        <aui:option value="1">Информационные технологии, интернет, телеком</aui:option>
        <aui:option value="20">Строительство, недвижимость</aui:option>
        <aui:option value="5.42">Бухгалтер</aui:option>
        <aui:option value="15.146">Медицина, Фармацевтика</aui:option>
        <aui:option value="15.363">Юристы</aui:option>
        <aui:option value="9.168">Наука, Образование</aui:option>
        </aui:select>

        <aui:select label="Выберете город:"
                    id="nameCity"
                    name="nameCity"
                    required="true">
        <aui:option value="2">Санкт-Петербург</aui:option>
        <aui:option value="4">Новосибирск</aui:option>
        <aui:option value="1">Москва</aui:option>
        <aui:option value="3">Екатеринбург</aui:option>
        <aui:option value="14">Архангельск</aui:option>
        <aui:option value="22">Владивосток</aui:option>
        <aui:option value="35">Иркутск</aui:option>
        </aui:select>

        <aui:button type="submit" onClick="<%=getRequestURL%>" value="Поиск по выбранным параметрам"/>
</form>

<aui:button-row>
    <portlet:renderURL var="openURL">
        <portlet:param name="jspPage" value="/JSP/listVacancies.jsp"/>
        <portlet:param name="backURL" value="<%=currentURL%>"/>
    </portlet:renderURL>
    <aui:button type="submit" onClick="<%=openURL%>" value="Просмотр найленных вакансий"/>
</aui:button-row>

<aui:button-row>
    <portlet:actionURL name="deletAllVacanse" var="delDataBase"/>
    <aui:button type="submit" onClick="<%=delDataBase %>" value="Удалить найденные вакансии"/>
</aui:button-row>