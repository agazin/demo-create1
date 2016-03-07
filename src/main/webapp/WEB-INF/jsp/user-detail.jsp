<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<h1>${user.name }</h1>

<c:forEach items="${user.blogs }" var="blog">
	<h2>${blog.name } - ${blog.url }</h2>

	<table class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>Title</th>
			<th>Link</th>
		</tr>
	</thead>
		<tbody>
			<c:forEach items="${blog.items }" var="item">
			<tr>
				<td>${item.title }</td>
				<td>${item.link }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</c:forEach>

<h1></h1>
