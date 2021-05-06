<%@ page import='edu.mum.cs.Question2' %><%--
  Created by IntelliJ IDEA.
  User: Anteneh
  Date: 5/6/2021
  Time: 10:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType='text/html;charset=UTF-8' language='java' %>

<html>
<head>
    <title>Calculator</title>
    <link href='css/style.css' type='text/css' rel='stylesheet'/>
</head>
<body>
<h1> Question 2: Calculator Advanced</h1>
<form action='question2' method='post'>
    <div>
        <input name='firstInput' type='number' required/> +
        <input name='secondInput' type='number' required/> =
        <input name='multiplicationResult' type='number'/>
    </div>
    <div>
        <input name='thirdInput' type='number'/> *
        <input name='fourthInput' type='number'/> =
        <input name='multiplicationResult' type='number'/>
    </div>
    <input type='submit' value='Submit'/>
</form>
</body>
</html>
