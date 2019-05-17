<%--
  Created by IntelliJ IDEA.
  User: aleks
  Date: 04.03.2019
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//Dli HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Welcome to Spring Web MVC project</title>
  <style type="text/css">
    .navigation {
      list-style: none; /* Отключение отображения маркеров. */
    }
    .navigation li {
      float: left; /* Выстраивание элементов списка в один ряд. */
      margin-right: 1px; /* создание отступов для того, чтобы не сливались пункты меню. */
      font-family: Verdana, Arial, Helvetica, sans-serif; /* Указание типа шрифта. */
      font-size: 14px; /* Размер текста в ссылках. */
    }
    .navigation li a {
      display: block; /* Изменение отображения на блочное для того чтобы иметь возможность задать внутренние отступы. */
      padding: 15px 20px;  /* Внутри блочные отступы. */
      background: #0db5b5; /* Цвет блоков меню. */
      color: #3f3f3f; /* Цвет текста в блоках меню. */
      text-decoration: none; /* Устранение подчёркивания ссылок. */
      position: relative; /* Это необходимо при использовании Internet Explorer 6 для того, чтобы ссылка по всей своей площади была «кликабельной». */
    }
    .navigation li a:hover {
      background: #92d3d3; /* Цвет блока при наведении курсора. */
      color: #6b6b6b;  /* Цвет текста при наведении курсора. */
    }
  </style>
</head>

<body>
<div style="background-color:lightgray; height: 400px;width: 800px">
  <h2> Физико-математический факультет СМОЛГУ</h2>
  <p>${my_hello}</p>
  <ul class="navigation">
    <li ><a href="news.htm"> Новости </a></li>
    <li ><a href="about.htm"> Обо__мне </a></li>
    <li><a href="carList.htm"> Машинки </a></li>
    <li><a href="bank.htm"> Банк </a></li>
    <li><a href="bankxml.htm"> БанкXML </a></li>
    <li><a href="calc.htm"> Расчеты </a></li>
  </ul>
</div>
</body>
</html>


