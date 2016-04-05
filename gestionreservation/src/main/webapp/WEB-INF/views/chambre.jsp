<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="true" %>
<html>
<head>
	<title>Chambre Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a Chambre
</h1>

<c:url var="addAction" value="/chambre/add" ></c:url>

<form:form action="${addAction}" commandName="chambre">
<table>
	<c:if test="${chambre.numChambre!=''}">
	<tr>
		<td>
			<form:label path="idChambre">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="idChambre" readonly="true" size="8"  disabled="true" />
			<form:hidden path="idChambre" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="numChambre">
				<spring:message text="numChambre"/>
			</form:label>
		</td>
		<td>
			<form:input path="numChambre" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="tel_chambre">
				<spring:message text="tel_chambre"/>
			</form:label>
		</td>
		<td>
			<form:input path="tel_chambre" />
		</td> 
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${chambre.numChambre!=''}">
				<input type="submit"
					value="<spring:message text="Edit Chambre"/>" />
			</c:if>
			<c:if test="${chambre.numChambre==''}">
				<input type="submit"
					value="<spring:message text="Add Chambre"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Chambres List</h3>
<c:if test="${!empty listChambres}">
	<table class="tg">
	<tr>
		<th width="80">Chambre ID</th>
		<th width="120">Chambre Num</th>
		<th width="120">Chambre tel</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listChambres}" var="chambre">
		<tr>
			<td>${chambre.idChambre}</td>
			<td>${chambre.numChambre}</td>
			<td>${chambre.tel_chambre}</td>
			<td><a href="<c:url value='/chambre/${chambre.idChambre}/edit' />" >Edit</a></td>
			<td><a href="<c:url value='/chambre/${chambre.idChambre}/remove' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
