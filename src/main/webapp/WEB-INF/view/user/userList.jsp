<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户列表 - 智游客户关系管理系统</title>
<link rel="stylesheet" href="<c:url value="/lib/font-awesome/css/font-awesome.css" />">
<link rel="stylesheet" href="<c:url value="/css/main.css" />">
</head>
<body>
	<div class="box">
		<h3>用户列表</h3>
		<div class="actions">
			<form id="searchForm" action="<c:url value="/userList" />" method="post">
				<span>搜索内容：</span>
				<input type="text" name="userKeyWord" value="${userKeyWord}" placeholder="请输入搜索关键词">
				&nbsp;&nbsp;&nbsp;
				<span>搜索字段：</span>
				<select name="userSearchField">
					<option value="u_name" ${userSearchField eq "u_name" ? "selected":""}>用户名</option>
					<option value="u_phone" ${userSearchField eq "u_phone" ? "selected":""}>手机号</option>
					<option value="u_address" ${userSearchField eq "u_address" ? "selected":""}>地址</option>
					<option value="d_name" ${userSearchField eq "d_name" ? "selected":""}>部门</option>
					<option value="r_name" ${userSearchField eq "r_name" ? "selected":""}>角色</option>
				</select>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="submit" class="btn btn-default" value="搜索">
			</form>
			<div>
				<a class="btn btn-primary" href="<c:url value="/addUser" />">添加用户</a>
			</div>
		</div>
		<table class="list">
            <tr>
                <th>序号</th>
                <th>用户名</th>
                <th>部门</th>
                <th>角色</th>
                <th>手机号</th>
                <th>邮箱</th>
                <th>更新时间</th>
                <th>操作</th>
            </tr>
            <c:forEach var="user" items="${list }" varStatus="status">
            <tr>
                <td>${status.count }</td>
                <td>
	                <a title="查看详情" href="<c:url value="/userInfo?id=${user.u_id }" />" >${user.u_name }</a>
                </td>
                <td>${user.departmentName }</td>
                <td>${user.roleName }</td>
                <td>${user.u_phone }</td>
                <td>${user.u_mail }</td>
                <td>
                	<fmt:formatDate value="${user.u_updatetime }" type="both" pattern="MM-dd HH:mm"/>
                </td>
                <td>
                	<a class="fa fa-pencil" title="编辑"   href="<c:url value="/updateUser?id=${user.u_id }"/>"></a>
                	&nbsp;&nbsp;
                	<a class="fa fa-remove" title="删除" href="<c:url value="/deleteUser?id=${user.u_id }"/>"></a>
                </td>
            </tr>
            </c:forEach>
        </table>
 <%--       <%@ include file="/WEB-INF/page/page.jsp" %> --%>
	</div>
</body>
</html>