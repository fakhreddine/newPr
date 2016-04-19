<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Personne Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a Personne
</h1>

<c:url var="addAction" value="/personne/add" ></c:url>

<form:form action="${addAction}" commandName="personne">
<table>
	<c:if test="${personne.idPersonne!='0'}">
	<tr>
		<td>
			<form:label path="idPersonne">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="idPersonne" readonly="true" size="8"  disabled="true" />
			<form:hidden path="idPersonne" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="adressePers">
				<spring:message text="Adresse"/>
			</form:label>
		</td>
		<td>
			<form:input path="adressePers" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="codePostalPers">
				<spring:message text="codePostal"/>
			</form:label>
		</td>
		<td>
			<form:input path="codePostalPers" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="emailPers">
				<spring:message text="Email"/>
			</form:label>
		</td>
		<td>
			<form:input path="emailPers" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="nomPers">
				<spring:message text="Nom"/>
			</form:label>
		</td>
		<td>
			<form:input path="nomPers" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="numTelPers">
				<spring:message text="Telephone"/>
			</form:label>
		</td>
		<td>
			<form:input path="numTelPers" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="prenomPers">
				<spring:message text="Prenom"/>
			</form:label>
		</td>
		<td>
			<form:input path="prenomPers" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="villePers">
				<spring:message text="Ville"/>
			</form:label>
		</td>
		<td>
			<form:input path="villePers" />
		</td> 
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${personne.idPersonne!='0'}">
				<input type="submit"
					value="<spring:message text="Edit Personne"/>" />
			</c:if>
			<c:if test="${personne.idPersonne=='0'}">
				<input type="submit"
					value="<spring:message text="Add Personne"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Personnes List</h3>
<c:if test="${!empty listPersonnes}">
	<table class="tg">
	<tr>
		<th width="80">Personne ID</th>
		<th width="120">prenomPers</th>
		<th width="120">nomPers</th>
		<th width="120">adressePers</th>
		<th width="80">civilitePers</th>
		<th width="120">codePostalPers</th>
		<th width="80">emailPers</th>	
		<th width="80">numTelPers</th>	
		<th width="120">villePers</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listPersonnes}" var="personne">
		<tr>
			<td>${personne.idPersonne}</td>
			<td>${personne.prenomPers}</td>
			<td>${personne.nomPers}</td>
			<td>${personne.adressePers}</td>
			<td>${personne.civilitePers}</td>
			<td>${personne.codePostalPers}</td>
			<td>${personne.emailPers}</td>
			<td>${personne.numTelPers}</td>
			<td>${personne.villePers}</td>
			<td><a href="<c:url value='/personne/${personne.idPersonne}/edit' />" >Edit</a></td>
			<td><a href="<c:url value='/personne/${personne.idPersonne}/remove' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
