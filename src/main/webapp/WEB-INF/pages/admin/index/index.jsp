<%--
  Created by IntelliJ IDEA.
  User: newli
  Date: 2018/7/27
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../common/header.jsp"%>
<script type="text/javascript">

</script>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="${basePath}/css/adminindex.css">
    <link rel="stylesheet" type="text/css" href="${basePath}/css/font-awesome/font-awesome.min.css">
</head>
<body>
<div class="header-top">
    <div class="logo">
        SourcePower
    </div>
    <div class="right">
        <img src="${basePath}/images/exit.png">&nbsp;<a href="${basePath}/common/public/index">退出</a>
    </div>
</div>
<div class="menus-left">
    <div class="menus-top">
        <img src="${basePath}/images/panghu.jpg" class="img-re">
        <p class="xttong-admin">admin</p>
        <p class="xitong-p">系统管理员</p>
    </div>
    <div class="menus-main">
        <ul>
            <li>
                <a href="${basePath}/admin/work/index" target="targetmain"> <i class="iconfont dicon  icon-home"></i>首页<i class="iconfont icon-angle-right right-jiantou"></i></a>
            </li>
            <li>
                <a href="user/index.html" target="targetmain"> <i class="iconfont dicon icon-table"></i>产品管理<i class="iconfont icon-angle-right right-jiantou"></i></a>
            </li>
            <li>
                <a href="http://www.baidu.com" target="targetmain"> <i class="iconfont dicon  icon-th-large"></i>产品分类<i class="iconfont icon-angle-right right-jiantou"></i></a>
            </li>
            <li>
                <a href="#" target="targetmain"><i class="iconfont  dicon icon-book"></i>新闻资讯<i class="iconfont icon-angle-right right-jiantou"></i></a>
            </li>
            <li>
                <a href="#" target="targetmain"><i class="iconfont  dicon icon-bolt"></i>新闻分类<i class="iconfont icon-angle-right right-jiantou"></i></a>
            </li>
            <li>
                <a href="#" target="targetmain"> <i class="iconfont  dicon  icon-truck"></i>订单管理<i class="iconfont icon-angle-right right-jiantou"></i></a>
            </li>
            <li>
                <a href="#" target="targetmain"><i class="iconfont  dicon   icon-user"></i>会员管理<i class="iconfont icon-angle-right right-jiantou"></i></a>
            </li>
            <li>
                <a href="#" target="targetmain">   <i class="iconfont  icon-money dicon"></i>充值记录<i class="iconfont icon-angle-right right-jiantou"></i></a>
            </li>
            <li>
                <a href="${basePath}/admin/adminUser/index" target="targetmain"> <i class="iconfont  dicon  icon-user-md"></i>系统用户<i class="iconfont icon-angle-right right-jiantou"></i></a>
            </li>
            <li>
                <a href="" target="targetmain"> <i class="iconfont  dicon  icon-sign-blank"></i>退出<i class="iconfont icon-angle-right right-jiantou"></i></a>
            </li>
        </ul>
    </div>
</div>

<div class="conter-main">
    <iframe name="targetmain" class="iframe" src="${basePath}/admin/work/index" scrolling="yes"></iframe>
</div>
</body>
</html>