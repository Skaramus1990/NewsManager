<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>News management</title>
<style>
<%@ include file='css-news-managment.css'%>
</style>
</head>
<body>
	<div id="newsHeader">
		<h2>${managment}</h2>
		<div align="right">
		<a href="languageEn">English</a> &nbsp &nbsp
		<a href="languageRu">Русский</a> &nbsp &nbsp
		</div>
	</div>
	
	<div id="block1" style="display: inline-block;">
		<div id="block1a">${managmentNews}</div>
		<div id="block1b">
			<ul id="ul1">
				<li id="str1"><a href="news">${listNews}</a></li>
				<li id="str2"><a href="news/add">${addNews}</a></li>
			</ul>
		</div>
	</div>

	<div id="newscontainer">
		<form>
			<c:forEach items="${news}" var="tempNews">
				<table id="string">
					<c:url var="viewLink" value="view">
						<c:param name="id" value="${tempNews.id}" />
					</c:url>

					<c:url var="updateLink" value="news/edit">
						<c:param name="id" value="${tempNews.id}" />
					</c:url>

					<tr >
						<td ><label id="title"><b>${tempNews.title}</b></label></td>
						<td align="right"><label>${tempNews.date_news}</label></td>
					</tr>
					<tr>
						<td><label>${tempNews.breaf}</label></td>
					</tr>
				</table>
						<div align="right">
							<a href="${viewLink}" >${viewNews }</a> &nbsp &nbsp &nbsp 
							<a href="${updateLink}">${editNews }</a> &nbsp &nbsp &nbsp 
							<input type="checkbox" name="deleteNewsParam" value=${tempNews.id } />
						</div>
				<br/>

			</c:forEach>
			<br /> 
			<div align="right">
			<input formaction="delete" type="submit" name="id" value="${deleteNews }" align="right"
				onclick="if (!(confirm('Are you sure you want to delete this user?'))) return false" >
			</div>
		</form>
		
	</div>

</body>
</html>