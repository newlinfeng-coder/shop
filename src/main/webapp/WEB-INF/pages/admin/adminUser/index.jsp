<%--
  Created by IntelliJ IDEA.
  User: newli
  Date: 2018/7/25
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>编号</td>
            <td>用户名</td>
            <td>密码</td>
            <c:forEach var="m" items="${list}">
                <tr>${m.id}</tr>
                <tr>${m.username}</tr>
                <tr>${m.password}</tr>
            </c:forEach>
        </tr>
    </table>
</body>
</html>
