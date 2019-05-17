<%--
  Created by IntelliJ IDEA.
  User: aleks
  Date: 05.03.2019
  Time: 0:58
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<div style="background-color:powderblue; height: 400px;width: 800px">
    <h1>Автомобили от Делова: выбери любой бесплатно!</h1>
    <table class="activity">
        <tr>
            <th>Марка</th>
            <th>Модель</th>
            <th>Цена</th>
        </tr>
        <c:forEach items = "${carList}" var="car">
            <tr>
                <td>${car.brand}</td>
                <td>${car.model}</td>
                <td>${car.price}</td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>

