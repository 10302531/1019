<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新用户 - 智游客户关系管理系统</title>
<link rel="stylesheet" href="<c:url value="/lib/font-awesome/css/font-awesome.css" />">
<link rel="stylesheet" href="<c:url value="/css/main.css" />">
</head>
<body>
	<div class="box">
		<h3>用户信息</h3>
		<form action="#" method="post">
			<table class="form-table">
				<tr>
					<td>用户名</td>
					<td class="control">
						${ user.u_name }
					</td>
					<td>密码</td>
					<td class="control">
						******
					</td>
				</tr>
				<tr>
					<td>部门</td>
					<td class="control">
						${ user.departmentName }
					</td>
					<td>角色</td>
					<td class="control">
						${ user.roleName }
					</td>
				</tr>
				<tr>
					<td>性别</td>
					<td class="control">
						${ user.u_sex eq "male" ? "男" : "女" }
					</td>
					<td>手机号</td>
					<td class="control">
						${ user.u_phone }
					</td>
				</tr>
				<tr>
					<td>地址</td>
					<td class="control">
						${ user.u_address }
					</td>
					<td>年龄</td>
					<td class="control">
						${ user.u_age }
					</td>
				</tr>
				<tr>
					<td>固定电话</td>
					<td class="control">
						${ user.u_telphone }
					</td>
					<td>身份证号</td>
					<td class="control">
						${ user.u_idcard }
					</td>
				</tr>
				<tr>
					<td>电子邮箱</td>
					<td class="control">
						${ user.u_mail }
					</td>
					<td>QQ号</td>
					<td class="control">
						${ user.u_qq }
					</td>
				</tr>
				<tr>
					<td>爱好</td>
					<td class="control">
						${ user.u_hobby }
					</td>
					<td>学历</td>
					<td class="control">
						<c:choose>
						    <c:when test="${ user.u_edu==1 }">小学</c:when>
						    <c:when test="${ user.u_edu==2 }">初中</c:when>
						    <c:when test="${ user.u_edu==3 }">高中</c:when>
						    <c:when test="${ user.u_edu==4 }">专科</c:when>
						    <c:when test="${ user.u_edu==5 }">本科</c:when>
						    <c:otherwise>其它</c:otherwise>
						</c:choose>
					</td>
				</tr>
				<tr>
					<td>工资卡号</td>
					<td class="control">
						${ user.u_salarycard }
					</td>
					<td>民族</td>
					<td class="control">
						${ user.u_nation }
					</td>
				</tr>
				<tr>
					<td>婚姻状况</td>
					<td class="control">
						<c:choose>
						    <c:when test="${ user.u_marry==1 }">已婚</c:when>
						    <c:when test="${ user.u_marry==0 }">未婚</c:when>
						    <c:when test="${ user.u_marry==-1 }">离异</c:when>
						    <c:otherwise>其它</c:otherwise>
						</c:choose>
					</td>
					<td></td>
					<td class="control">
						
					</td>
				</tr>
				<tr>
					<td>备注</td>
					<td colspan="3" class="control">
						${ user.u_remark }
					</td>
				</tr>
			</table>
			<div class="buttons">
				<a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
			</div>
		</form>
	</div>
</body>
</html>