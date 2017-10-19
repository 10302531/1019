<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="zpd" uri="http://zhiyou100.com/common/" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>角色管理 - 智游客户关系管理系统</title>
<link rel="stylesheet" href="<c:url value="/lib/font-awesome/css/font-awesome.css" />">
<link rel="stylesheet" href="<c:url value="/css/main.css" />">
</head>
<body>
	<div class="box">
		<h3>角色管理</h3>
		<div class="actions">
			<div>
			<form action="${pageContext.request.contextPath }/role/roleList.action">
			搜索内容：<input type="text" name="sousuo" placeholder="请输入搜索关键词" value="${sousuo}">
			搜索字段：<select name="ziduan" size="1">
				<option value="r_name" ${ziduan eq "r_name" ? "selected":""}>角色名</option>
				<option value="r_id" ${ziduan eq "r_id" ? "selected":""}>Id</option>
			</select>
			<input type="submit" value="搜索">
			</form>
			</div>	
			<div>
				<a class="btn btn-primary" href="<c:url value="/role/addRole.action" />">添加角色</a>
			</div>
		</div>
		<form action="${pageContext.request.contextPath}/role/editAllRole.action" method="post">
		<table class="list">
            <tr>
                <th>序号</th>
                <th>角色名称</th>
                <th>角色描述</th>
                <th>更新时间</th>
              	<th>头像</th>
                <th>操作</th>
            </tr>
            <c:forEach var="role" items="${page.rows}" varStatus="status">
            <tr>
                <td>${ status.count }</td>
                <td><input type="text" name="page.rows[${status.index}].rName" value="${ role.rName }"></td>
                <td><input type="text" name="page.rows[${status.index}].rDesc" value=" ${ role.rDesc }"></td>
                <td>
                <input type="datetime-local" name="page.rows[${status.index}].rUpdatetime" value="<fmt:formatDate value="${role.rUpdatetime}" type="both" pattern="yyyy-MM-dd'T'HH:mm:ss"/>">	
                </td>
             	 <td>
               <img alt="" src="/pic/${ role.rPic }" width="100px" height="80px">我是陈小春是兄弟就来贪玩雷霆把
                </td>
                <td>
                	<a class="fa fa-pencil" title="编辑" href="<c:url value="/role/updateRole.action?id=${role.rId}" />"></a>
                	&nbsp;&nbsp;
                	<a class="fa fa-remove" title="删除" href="<c:url value="/role/deleteRole.action?id=${role.rId}" />"></a>
                </td>
            </tr>
            </c:forEach>
        </table>
        <input type="submit">
        </form>
     	<zpd:page url="${pageContext.request.contextPath}/role/roleList.action"></zpd:page>
	</div>
</body>
</html>