<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页 - 智游客户关系管理系统</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/admin.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/lib/font-awesome/css/font-awesome.css">
</head>
<body>
	<div class="header">
	    <h1><a href="${pageContext.request.contextPath }/admin.jsp">智游客户关系管理系统</a></h1>
	    <div class="nav">
	    	<a target="" href="#">工作台</a>
            <a target="" href="#">报表</a>
            <a target="" href="#">客户信息</a>
            <a target="" href="#">员工信息</a>
            <a target="" href="#">公告信息</a>
            <a target="" href="#">发件箱</a>
	    </div>
	    <div class="user">
	        <a href="#">${user.u_name }</a>
	        <a href="<c:url value="loginout" />">退出</a>
	    </div>
    </div>
    <div class="main">
	    <ul class="left-side">
	    	<li class="menu-title">
	    		<a href="#">
	    			<i class=" fa fa-users"></i>&nbsp;&nbsp;客户管理
	    		</a>
	    	</li>
	    	<li class="sub-menu">
			   	<ul>
		            <li>
		            	<a href="#">
		            		<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;客户信息
		            	</a>
		            </li>
		            <li>
		            	<a href="#">
		            		<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;客户分配
		            	</a>
		            </li>
		            <li>
		            	<a href="#">
		            		<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;客户关怀
		            	</a>
		            </li>
		            <li>
		            	<a target="" href="#">
		            		<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;客户分类
		            	</a>
		            </li>
		            <li>
		            	<a target="" href="#">
		            		<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;客户状态
		            	</a>
		            </li>
		            <li>
		            	<a target="" href="#">
		            		<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;客户来源
		            	</a>
		            </li>
		        </ul>
	        </li>
	        <li class="menu-title">
	        	<a href="#">
	    			<i class=" fa fa-file-text"></i>&nbsp;&nbsp;内部信息
	    		</a>
	    	</li>
	        <li class="sub-menu">
		        <ul>
		        	<li>
		        		<a target="pageBox" href="http://www.baidu.com">
		            		<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;通知公告
		            	</a>
		        	</li>
		            <li>
		            	<a target="" href="#">
		            		<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;员工信息
		            	</a>
		            </li>
		            <li>
		            	<a target="" href="#">
		            		<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;部门信息
		            	</a>
		            </li>
		        </ul>
	        </li>
	        <li class="menu-title">
	        	<a href="#">
	    			<i class=" fa fa-envelope"></i>&nbsp;&nbsp;站内邮件
	    		</a>
	        </li>
	        <li class="sub-menu">
		        <ul>
		            <li>
		            	<a target="pageBox" href="<c:url value="/writeMail" />">
		            		<i class=" fa fa-circle-thin " name="mail"></i>&nbsp;&nbsp;写邮件
		            	</a>
		           	</li>
		            <li>
		            	<a target="pageBox" href="<c:url value="/receiveMail" />">
		            		<i class=" fa fa-circle-thin "  name="mail"></i>&nbsp;&nbsp;收件箱
		            	</a>
		           	</li>
		            <li>
		            	<a target="pageBox" href="<c:url value="/sendMail" />">
		            		<i class=" fa fa-circle-thin "  name="mail" id="sendMail"></i>&nbsp;&nbsp;发件箱
		            	</a>
		            </li>
		            <li>
		            	<a target="pageBox" href=<c:url value="/draftMail" />>
		            		<i class=" fa fa-circle-thin "  name="mail"></i>&nbsp;&nbsp;草稿箱
		            	</a>
		            </li>
		             <li>
		            	<a target="pageBox" href="<c:url value="/trashMail" />">
		            		<i class=" fa fa-circle-thin "  name="mail"></i>&nbsp;&nbsp;垃圾箱
		            	</a>
		            </li>
		        </ul>
	        </li>
	        <li class="menu-title active">
	        	<a href="#">
	    			<i class=" fa fa-sitemap"></i>&nbsp;&nbsp;管理员
	    		</a>
	        </li>
	        <li class="sub-menu">
		        <ul class="menu">
		        	<li>
		        		<a target="pageBox" href="<c:url value="/noticeList" />">
		            		<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;公告管理
		            	</a>
		        	</li>
		            <li>
		            	<a target="pageBox" href="<c:url value="/departmentList" />">
		            		<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;部门管理
		            	</a>
		            </li>
		            <li>
		            	<a target="pageBox" href="<c:url value="/roleList" />">
		            		<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;角色管理
		            	</a>
		            </li>
		            <li>
		            	<a target="pageBox" href="<c:url value="/userList" />">
		            		<i class=" fa fa-circle"></i>&nbsp;&nbsp;用户管理
		            	</a>
		            </li>
		        </ul> 
	        </li>
	    </ul>
	    <div class="right-side">
	    		<iframe name="pageBox" src="<c:url value="/userList" />"></iframe>
		    <div class="footer">
		    	智游教育 ©2017 河南智游臻龙教育科技有限公司
		    </div>
	    </div>    
    </div>
    <script src="${pageContext.request.contextPath }/lib/jquery/jquery.js"></script>
    <script src="${pageContext.request.contextPath }/js/admin.js"></script>
</body>
</html>