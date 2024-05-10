<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Student Management</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <h2>Liste of students</h2>
 <form action="${pageContext.request.contextPath}/search" method="get" class="mb-4">
        <div class="form-group">
            <input type="text" name="query" class="form-control" placeholder="Rechercher par nom...">
        </div>
        <button type="submit" class="btn btn-primary">Rechercher</button>
    </form>
    <div class="row">
        <c:forEach var="student" items="${students}">
            <div class="col-md-4">
                <div class="card mb-4">
                    <div class="card-body">
                        <h5 class="card-title">ID: ${student.id}</h5>
                        <p class="card-text">Nom: ${student.name}</p>
                        <p class="card-text">Numéro d'Étudiant: ${student.registrationNumber}</p>
                        <p class="card-text">Email: ${student.email}</p>
                        <a href="${pageContext.request.contextPath}/editStudent/${student.id}" class="btn btn-primary">update</a>
                        <a href="${pageContext.request.contextPath}/deleteStudent/${student.id}" class="btn btn-danger" onclick="return confirm('Êtes-vous sûr de vouloir supprimer cet étudiant ?')">delete</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>

    <h2>add student</h2>
    <a href="${pageContext.request.contextPath}/addStudent/" class="btn btn-success">add</a>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
