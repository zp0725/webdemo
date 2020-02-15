<%--
  Created by IntelliJ IDEA.
  User: 45824
  Date: 2020/2/14
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<form action="doUpdate">
    sno:<input type="text" name="sno" value="${student.sno}"><br>
    sname:<input type="text" name="sname" value="${student.sname}"><br>
    sage:<input type="text" name="sage" value="${student.sage}"><br>
    ssex:<input type="text" name="ssex" value="${student.ssex}"><br>
    dept:<input type="text" name="dept" value="${student.dept}"><br>
    <input type="submit" value="修改">
</form>
</body>
</html>
