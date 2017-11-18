<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>JSP Page</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="row">
    <div class="col-md-8">
        <div class="container">
            <h3>Spring Boot Views:</h3>
            <div class="well">
                <a href="jsp" class="btn btn-primary">JSP View</a>
                <br>
                <a href="thymeleaf" class="btn btn-info">Thymeleaf</a>
                <br>
                <a href="freemarker" class="btn btn-success">Freemarker</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>