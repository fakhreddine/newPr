<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Categorie Page</title>
<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
	border-color: #ccc;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #fff;
}

.tg th {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #f0f0f0;
}

.tg .tg-4eph {
	background-color: #f9f9f9
}
</style>
</head>
<body>
	<h1>Reservation test</h1>

	<c:url var="addAction" value="/reservation/add"></c:url>
	<form:form action="${addAction}" commandName="reservation"
		method="post">
		<table>
			<c:if test="${reservation.idReservation!=0}">
				<tr>
					<td><form:label path="idReservation">
							<spring:message text="ID" />
						</form:label></td>
					<td><form:input path="idReservation" readonly="true" size="8"
							disabled="true" /> <form:hidden path="idReservation" /></td>
				</tr>
			</c:if>
			<tr>
				<td><form:label path="nbPersonne">
						<spring:message text="nembre de personne" />
					</form:label></td>
				<td><form:input path="nbPersonne" /></td>
			</tr>
			<tr>
				<td colspan="2"><c:if test="${reservation.idReservation!=''}">
						<input type="submit"
							value="<spring:message text="Edit Reservation"/>" />
					</c:if> <c:if test="${reservation.idReservation==''}">
						<input type="submit"
							value="<spring:message text="Add Reservation"/>" />
					</c:if></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
