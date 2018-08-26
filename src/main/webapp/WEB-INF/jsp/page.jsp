<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h3>Welcome </h3><br>

<h3>Add advertiser :</h3>
<form:form name="submitForm" modelAttribute="newAdvertiser" method="POST" action="/add">
    Name:
    <form:input path="name"/>
    <br/>
    Contact Name:
    <form:input path="contactName"/>
    Credit limit:
    <form:input path="creditLimit"/>
    <br/>
    <input type="submit" value="Add"/>
</form:form>


<h3>Available advertiser :</h3>
<c:forEach var="advertiser" items="${advertiser}">
    <h4>id : <c:out value="${advertiser.id}"></c:out>
        <br/>
        Name : <c:out value="${advertiser.name}"></c:out>
        <br/>
        Contact Name : <c:out value="${advertiser.contactName}"></c:out></h4>
    <br/>
</c:forEach>

<h3>Insert number delete advertiser:</h3>
<form:form name="deleteForm" modelAttribute="deleteAdvertiser" method="POST" action="/delete">
    <form:input path="id"/>
    <input type="submit" value="Delete"/>
</form:form>


</body>
</html>
