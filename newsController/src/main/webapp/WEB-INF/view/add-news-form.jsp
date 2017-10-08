<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Add News Form</title>
<style>
<%@ include file='css-news-managment.css'%>
</style>
</head>
<body>
	<div id="newsHeader">
		<h2>${managment }</h2>
		<div align="right">
		<a href="/newsController/languageEn">English</a> &nbsp &nbsp
		<a href="/newsController/languageRu">Русский</a> &nbsp &nbsp
		</div>
	</div>

	<div id="block1" style="display: inline-block;">
		<div id="block1a">${managmentNews }</div>
		<div id="block1b">
			<ul id="ul1">
				<li id="str1"><a href="/newsController/news">${listNews}</a></li>
				<li id="str2"><a href="/newsController/news/add">${addNews}</a></li>
			</ul>
		</div>
	</div>

	<div id="newscontainer">
			<form:form action="/newsController/save" modelAttribute="news" method="POST">
			<form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td valign="top"><label>${newsTitle}</label></td>
						<td><form:input style="width:500px;" path="title"/></td>
						<td><form:errors path="title" cssClass="error" /></td>
					</tr>

					<tr>
						<td valign="top"><label>${newsDate}</label></td>
						<td><form:input path="date_news"/></td>
						<td><form:errors path="date_news" cssClass="error" /></td>
					</tr>

					<tr>
						<td valign="top"><label>${newsBreaf}</label></td>
						<td><form:textarea style="width:500px; height:100px;" path="breaf"/></td>
						<td><form:errors path="breaf" cssClass="error" /></td>
					</tr>
						<tr>
						<td valign="top"><label>${newsContent}</label></td>
						<td><form:textarea style="width:500px; height:150px;" path="content"/></td>
						<td><form:errors path="content" cssClass="error" /></td>
					</tr>
				</tbody>
			</table>


			<br /> 
			<div align="center">
			<input type="submit" value=${saveNews} class="save" />
			<input formaction="/newsController/news" type="submit" value=${newsCancel} class="news" />
			</div>
		</form:form>
	</div>

</body>
</html>