<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Student Management</title>
</head>
<body>
<h2>Add student</h2>

<form action="<c:url value='/addStudent'/>" method="post">
    <label for="name">Nom:</label>
    <input type="text" id="name" name="name" required><br>
    <label for="studentId">Numéro d'Étudiant:</label>
    <input type="text" id="registrationNumber" name="registrationNumber" required><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required><br>
    <button type="submit">add student</button>
</form>

</body>
</html>