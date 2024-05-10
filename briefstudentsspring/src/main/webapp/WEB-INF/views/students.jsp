<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.model.Student" %>

<html>
<head>
    <title>Liste des étudiants</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
   <div class="container">
    <h1>Liste des étudiants</h1>
    <div class="row">
        <c:forEach var="student" items="${students}">
            <div class="col-md-4">
                <div class="card mb-4 shadow-sm">
                    <div class="card-body">
                        <h5 class="card-title">${student.name}</h5>
                        <p class="card-text">Numéro d'inscription : ${student.registrationNumber}</p>
                        <p class="card-text">Email : ${student.email}</p>
                        <div class="d-flex justify-content-between align-items-center">
                            <div class="btn-group">
                                <!-- Boutons pour la mise à jour et la suppression de l'étudiant -->
                                <a href="/update/${student.id}" class="btn btn-sm btn-outline-secondary">Modifier</a>
                                <a href="/delete/${student.id}" class="btn btn-sm btn-outline-secondary">Supprimer</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
   
</body>
</html>
