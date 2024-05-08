<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Task Management</title>
</head>
<body>
    <h1>Task List</h1>
    <ul>
        <c:forEach var="task" items="${tasks}">
            <li>${task.description} <a href="?action=delete&id=${task.id}">Delete</a></li>
        </c:forEach>
    </ul>
    <h2>Add New Task</h2>
    <form action="?action=add" method="post">
        <input type="text" name="description" required>
        <button type="submit">Add Task</button>
    </form>
</body>
</html>
