<%--
  Created by IntelliJ IDEA.
  User: guoke
  Date: 2020/2/13
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%--指令--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--html 提示 通过jsp进行页面显示--%>
<html>

<%
/*
作用域
pageContext 当前页面 转换页面后失效
request     一次请求    二次请求失效
 session       一次会话  重启服务器、中断会话后失效
  application   一次服务器启动，重新部署后失效
 */
pageContext.setAttribute("test","pagecontext");
request.setAttribute("test","request");
session.setAttribute("test","session");
<a

request.getRequestDispatcher("myjsp2.jsp").forward(request,response);

response.sendRedirect("myjsp2.jsp");

%>
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
   <%=
      request.getAttribute("test")
   %>
    <div style="width: 100px;height: 100px;background: linear-gradient(90deg,#fff,#000)">这是我自己新创建的jsp页面</div>
</body>
</html>
