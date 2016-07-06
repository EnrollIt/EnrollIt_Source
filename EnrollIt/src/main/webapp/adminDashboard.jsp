<%@ page language="java" contentType="text/html charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="com.enrollIt.models.School"%>
<%@ page import="com.enrollIt.models.SchoolFacility" %>

<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div width=100%>
<form:form action="addSchool" method="post" modelAttribute="school"></form:form>
<table >
<tr>
<td>
<form:input path="school.schoolName" />
</td>
</tr>
<tr>
<td>
<form:input path="school.rating" />
</td>
</tr>
<tr>
<td>
<form:input path="school.review" />
</td>
</tr>
<td>
<form:input path="school.address.city" />
</td>
</tr>
<td>
<form:input path="school.address.state" />
</td>
</tr>
</tr>
<td>
<form:input path="school.fees" />
</td>
</tr>
</tr>
<td>
<div padding=3%>


 <c:forEach items="${school.facilities}" var="facility" varStatus="facilityLoop">

<form:checkbox path="school.facilities[${facilityLoop.index}].facilityName"/>

</c:forEach>
</div>
<form:input path="school" />
</td>
</tr>

</table>
</div>
</body>
</html>