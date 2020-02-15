<%--
  Created by IntelliJ IDEA.
  User: 45824
  Date: 2020/2/13
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>网站主页</title>
    <style>
        div{

        }
    </style>
</head>
<body>
<%--公用一个request response 对象--%>
<%--java片段--%>
<%--java 表达式  if(a>b){}--%>
<%----%>

<%
pageContext.getAttribute("test");
request.getAttribute("test");
session.getAttribute("test");
%>

<%
    String result = (String)request.getAttribute("test");
    System.out.println(result);

%>

<div style="width: 100px;height: 100px;background: linear-gradient(90deg,#fff,#000)">这是我自己新创建的jsp页面</div>
</body>
</html>
