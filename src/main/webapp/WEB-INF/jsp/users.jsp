<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table  class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>user-id</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${users }" var="user">
			<tr>
				<td>${user.name }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>