<%--
  Created by IntelliJ IDEA.
  User: newli
  Date: 2018/7/27
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../header.jsp"%>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="${basePath}/css/adminlogin.css">
    <script language='javascript' src='${basePath}/js/PCASClass.js'></script>
    <script type="text/javascript">
        //表单验证
        function loginsubmit(){
            var username=document.getElementById("username");
            var password=document.getElementById("password");
            var code=document.getElementById("code");
            if(username.value==""){
                alert("请输入用户名");
                username.focus();
                return false;
            }

            if(password.value==""){
                alert("请输入密码");
                password.focus();
                return false;
            }

            if(code.value==""){
                alert("请输入验证码");
                code.focus();
                return false;
            }

            return true;
        }
        //获取验证码


        function refCode(){
            var date=new Date();
            var imgcode=document.getElementById("imgcode");
            imgcode.src="${basePath}/common/public/random?s="+date.getTime();
        }
    </script>
</head>
<body>
<form action="${basePath}/common/public/submitLogin" method="post" enctype="application/x-www-form-urlencoded" onsubmit="return loginsubmit()">
    <div class="login-main">
        <div class="login-header">
            登录
        </div>
        <div class="item-box">
            <img src="${basePath}/images/login-user.png" class="img">
            <input type="text" name="username"  id="username" placeholder="用户名">
        </div>
        <div class="item-box">
            <img src="${basePath}/images/login-pass.png" class="img">
            <input type="text" name="password" id="password" placeholder="密码">
        </div>
        <div class="item-code-box">
            <div class="item-box1">
                <img src="${basePath}/images/login-pass.png" class="img">
                <input type="text" name="code" id="code" placeholder="验证码">
            </div>
            <img src="${basePath}/common/public/random" class="code" id="imgcode" onclick="refCode()" title="点击我重新获取">
        </div>
        <div class="item-box" style="border: 0px;margin-top: 15px;">
            <input  type="submit" value="登录" class="btn" style="border: 0px;"/>
        </div>
        <div class="item-box" style="border: 0px;margin-top: 15px;">
            <a href="${basePath}/index.html" class="btn" style="background: #2aef6c;">返回首页</a>
        </div>
    </div>
</form>
</body>
</html>