<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Categorie Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a Categorie
</h1>

<c:url var="addAction" value="/categorie/add" ></c:url>

<form:form action="${addAction}" commandName="categorie" method="post">
<table>
	<c:if test="${categorie.idCategorie!=0}">
	<tr>
		<td>
			<form:label path="idCategorie">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="idCategorie" readonly="true" size="8"  disabled="true" />
			<form:hidden path="idCategorie" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="descriptionCatgorie">
				<spring:message text="Description"/>
			</form:label>
		</td>
		<td>
			<form:input path="descriptionCatgorie" />
		</td> 
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${categorie.idCategorie!=0}">
				<input type="submit"
					value="<spring:message text="Edit Categorie"/>" />
			</c:if>
			<c:if test="${categorie.idCategorie==0}">
				<input type="submit"
					value="<spring:message text="Add Categorie"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Categories List</h3>
<c:if test="${!empty listCategories}">
	<table class="tg">
	<tr>
		<th width="80">Categorie ID</th>
		<th width="120">Categorie Designation</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listCategories}" var="categorie">
		<tr>
			<td>${categorie.idCategorie}</td>
			<td>${categorie.descriptionCatgorie}</td>
			<td><a href="<c:url value='/categorie/${categorie.idCategorie}/edit' />" >Edit</a></td>
			<td><a href="<c:url value='/categorie/${categorie.idCategorie}/remove' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
