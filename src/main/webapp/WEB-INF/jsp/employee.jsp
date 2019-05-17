<%--
  Created by IntelliJ IDEA.
  User: aleks
  Date: 05.03.2019
  Time: 13:51
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
<div style="background-color:yellow; height: 400px;width: 800px">
    <h1>Должники банка</h1>
    <table class="activity">
        <tr>
            <th>Id</th>
            <th>Person</th>
            <th>Dolg</th>
            <th>Platit</th>
            <th>Phone</th>
        </tr>

        <c:forEach var="e" items="${employee}">
            <tr>
                <td>${e.id}</td>
                <td>${e.person}</td>
                <td>${e.dolg}</td>
                <td>${e.platit}</td>
                <td>${e.phone}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>

