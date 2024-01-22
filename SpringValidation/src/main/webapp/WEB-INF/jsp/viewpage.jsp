<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<style>
.error{color:red}
</style>
</head>
<body>
<form:form action="helloagain" modelAttribute="emp">
Username: <form:input path="name"/>
<form:errors path="name" cssClass="error"/><br><br>
Password: <form:password path="pass"/>   
<form:errors path="pass" cssClass="error"/><br><br>
Salary: <form:input path="salary"/>  
<form:errors path="salary" cssClass="error"/><br><br>
Date: <form:input type="date" path="date"/>  
<form:errors path="date" cssClass="error" value="12-10-2022"/><br><br>
<input type="submit" value="submit">
</form:form>
</body>
</html>