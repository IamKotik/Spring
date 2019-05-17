<%--
  Created by IntelliJ IDEA.
  User: aleks
  Date: 05.03.2019
  Time: 0:49
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<div style="background-color: yellow;height: 400px;width: 800px">
    <p>${message}</p>
    <h3>Сведения обо мне</h3>
    <p>Имя: ${personObject.name}</p>
    <p>Возраст: ${personObject.age}</p>
    <p>Группа: ${personObject.group}</p>
    <a href="/"> На главную </a>
</div>
</body>
</html>

