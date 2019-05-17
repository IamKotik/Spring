<%--
  Created by IntelliJ IDEA.
  User: aleks
  Date: 05.03.2019
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<div style="background-color:lightcoral ;height: 400px;width: 800px">
    <h1>Передача данных на сервер от Делова</h1>
    Результаты возвращаются клиенту
    <h3> Введите два числа:</h3>
    <form>
        <input type="text" name="x" value = "${x}"/>
        <input type="text" name="y" value = "${y}"/>
        <br/>
        <p>Ваш рeзультат:
            ${sum}
            <br/>
            <input type="submit" value="Сложить"/>
    </form>
</div>
</body>
</html>

