<%@ page import="java.util.List" %>
<%@ page import="com.zp.pojo.Student" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 45824
  Date: 2020/2/14
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%--有这个指令才会被编译成java文件--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>students</title>
    <style>
        table{

            border:solid 1px black;
            border-collapse: collapse;
        }
        tr td,tr th{
            border: solid 1px black;
        }
    </style>
</head>
<body>

<a href="addStudent">添加</a>
<%--<%=--%>
<%--    request.getAttribute("students")--%>
<%--%>--%>
<table>
    <thead>
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>性别</th>
            <th>所在系</th>
            <th>操作</th>
        </tr>
   </thead>
    <tbody>
    <%--java片段，el表达式--%>
    <c:forEach items="${students}" var="stu">
        <tr>
            <td>${stu.sno}</td>
            <td>${stu.sname}</td>
            <td>${stu.sage}</td>
            <td>${stu.ssex}</td>
            <td>${stu.dept }</td>
            <td><a href="delete?sno=${stu.sno}">删除</a><a href="update?sno=${stu.sno}">修改</a> </td>
        </tr>
    </c:forEach>





<%--    <%List<Student> students=(List<Student>)request.getAttribute("students");%>--%>
<%--    <%for(Student s:students){%>--%>
<%--        <tr>--%>
<%--&lt;%&ndash;            el表达式，.sno相当于调用了get方法&ndash;%&gt;--%>
<%--            <td><%=s.getSno()%></td>--%>
<%--            <td><%=s.getSname()%></td>--%>
<%--            <td><%=s.getSage()%></td>--%>
<%--            <td><%=s.getSsex()%></td>--%>
<%--            <td><%=s.getDept()%></td>--%>
<%--        </tr>--%>
<%--            <%} %>--%>
        <tr></tr>
    </tbody>
</table>

</body>
</html>
