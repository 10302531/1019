<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录 - 智游客户关系管理系统</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/index.css">
</head>
<body>
	<div class="login">
        <img src="${pageContext.request.contextPath }/image/logo.png" alt="智游">
        <p>智游客户关系管理系统</p>
        <form action="<c:url value="/user/login.action"/>" method="post">
            <div>
                <input type="text"id="username" name="username"  placeholder="请输入用户名" value="admin">
            </div>
            <div>
                <input type="password" id="password" name="password" placeholder="请输入密码" value="admin">
            </div>
         		<p style="color: red; font-size: 15px;">${errorMessage }</p>
            <div>
                <input type="submit" value="登录"> 
            </div>
            <input type="checkbox" name="remember">是否记住密码
        </form>
    </div>
</body>
</html>