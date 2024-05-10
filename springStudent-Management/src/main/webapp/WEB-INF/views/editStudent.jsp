<!-- editStudent.jsp -->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>update student</title>
</head>
<body>
<h2>update Student</h2>
<form action="<c:url value='/editStudent/' />${student.id}" method="post">
    <label for="name">Name:</label><br>
    <input type="text" id="name" name="name" value="${student.name}"><br>

    <label for="studentId">Student ID:</label><br>
    <input type="text" id="registrationNumber" name="registrationNumber" value="${student.registrationNumber}"><br>

    <label for="email">Email:</label><br>
    <input type="email" id="email" name="email" value="${student.email}"><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>
