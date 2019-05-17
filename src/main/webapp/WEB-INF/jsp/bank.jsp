<%--
  Created by IntelliJ IDEA.
  User: aleks
  Date: 05.03.2019
  Time: 12:46
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
<div style="background-color:limegreen; height: 600px;width: 800px">
    <h3>Выполнить фильтрацию</h3>
    <form>
        Долг>=
        <input type="text" name="x" value = "${x}"/>
        <input type="submit" value="Фильтровать"/>
    </form>
    <h1>Должники банка</h1>
    <table class="activity">
        <tr>
            <th>Id</th>
            <th>Person</th>
            <th>Dolg</th>
            <th>Platit</th>
            <th>Phone</th>
        </tr>

        <c:forEach var="p" items="${bank}">
            <tr>
                <td>${p.id}</td>
                <td>${p.person}</td>
                <td>${p.dolg}</td>
                <td>${p.platit}</td>
                <td>${p.phone}</td>
            </tr>
        </c:forEach>

    </table>
</div>

</body>
</html>

