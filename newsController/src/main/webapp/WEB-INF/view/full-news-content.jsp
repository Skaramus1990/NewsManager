<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Full News Page</title>
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
		<form>
			<table>
					<tr>
						<td  style="width: 100px;" valign="top"><label>${newsTitle}</label></td>
						<td style="padding-bottom:10px;"><label>${news.title }</label><br></td>
					</tr>
					<tr>
						<td valign="top"><label>${newsDate}</label></td>
						<td style="padding-bottom:10px;"><label>${news.date_news }</label></td>
					</tr>
					<tr>
						<td valign="top" ><label>${newsBreaf}</label></td>
						<td style="padding-bottom:20px;">${news.breaf }</td>
					</tr>
					<tr>
						<td valign="top"><label>${newsContent}</label></td>
						<td>${news.content }</td>
					</tr>
				</table>
				<br />
			<div align="right">
				<input formaction="news" type="submit" value=${Back } class="exit" />
				<button formaction="deleteSingle" type="submit" name="Delete" value="${news.id }" align="right"
				onclick="if (!(confirm('Are you sure you want to delete this user?'))) return false"> ${deleteNews }</button>
			</div>
		</form>
	</div>

</body>
</html>