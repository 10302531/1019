<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增用户 - 智游客户关系管理系统</title>
<link rel="stylesheet" href="<c:url value="/lib/font-awesome/css/font-awesome.css" />">
<link rel="stylesheet" href="<c:url value="/css/main.css" />">
</head>
<body>
	<div class="box">
		<h3>新增用户</h3>
		<form action="<c:url value="/addUser" />" method="post">
			<table class="form-table">
				<tr>
					<td>用户名</td>
					<td class="control">
						<input type="text" name="u_name" placeholder="请填写用户名">
					</td>
					<td>密码</td>
					<td class="control">
						<input type="password" name="u_pwd" value="123456" placeholder="选填写密码">
					</td>
				</tr>
				<tr>
					<td>部门</td>
					<td class="control">
						<select name="u_departmentid">
						<c:forEach var="department" items="${ departments }">
							<option value="${ department.d_id }">${ department.d_name }</option>
						</c:forEach>
						</select>
					</td>
					<td>角色</td>
					<td class="control">
						<select name="u_roleid">
						<c:forEach var="role" items="${ roles }">
							<option value="${ role.r_id }">${ role.r_name }</option>
						</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>性别</td>
					<td class="control">
						<input type="radio" name="u_sex" id="male" value="male" checked><label for="male">男</label>
						<input type="radio" name="u_sex" id="female" value="female"><label for="female">女</label>
					</td>
					<td>手机号</td>
					<td class="control">
						<input type="text" name="u_phone" placeholder="请填写手机号">
					</td>
				</tr>
				<tr>
					<td>地址</td>
					<td class="control">
						<input type="text" class="p100" name="u_address" placeholder="请填写地址">
					</td>
					<td>年龄</td>
					<td class="control">
						<input type="text" name="u_age" placeholder="请填写年龄">
					</td>
				</tr>
				<tr>
					<td>固定电话</td>
					<td class="control">
						<input type="text" name="u_telphone" placeholder="请填写固定电话">
					</td>
					<td>身份证号</td>
					<td class="control">
						<input type="text" name="u_idcard" class="p80" placeholder="请填写身份证号">
					</td>
				</tr>
				<tr>
					<td>电子邮箱</td>
					<td class="control">
						<input type="text" name="u_mail" class="p80" placeholder="请填写电子邮箱">
					</td>
					<td>QQ号</td>
					<td class="control">
						<input type="text" name="u_qq" placeholder="请填写QQ号">
					</td>
				</tr>
				<tr>
					<td>爱好</td>
					<td class="control">
						<input type="text" name="u_hobby" placeholder="请填写爱好">
					</td>
					<td>学历</td>
					<td class="control">
						<select name="u_edu">
							<option value="1">小学</option>
							<option value="2">初中</option>
							<option value="3">高中</option>
							<option value="4">专科</option>
							<option value="4">本科</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>工资卡号</td>
					<td class="control">
						<input type="text" name="u_salarycard" placeholder="请填写工资卡号">
					</td>
					<td>民族</td>
					<td class="control">
						<input type="text" name="u_nation" placeholder="请填写民族">
					</td>
				</tr>
				<tr>
					<td>婚姻状况</td>
					<td class="control">
						<select name="u_marry">
							<option value="-1">离异</option>
							<option value="0">未婚</option>
							<option value="1">已婚</option>
						</select>
					</td>
					<td></td>
					<td class="control">
						
					</td>
				</tr>
				<tr>
					<td>备注</td>
					<td colspan="3" class="control">
						<textarea class="p100" style="height:150px;" name="u_remark" placeholder="请填写备注"></textarea>
					</td>
				</tr>
			</table>
			<div class="buttons">
				<input class="btn btn-primary va-bottom" type="submit" value="保存">&nbsp;&nbsp;
				<a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
			</div>
		</form>
	</div>
</body>
</html>