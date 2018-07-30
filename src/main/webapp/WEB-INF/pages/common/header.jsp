<%--
  Created by IntelliJ IDEA.
  User: newli
  Date: 2018/7/27
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
    request.setAttribute("basePath", basePath);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
