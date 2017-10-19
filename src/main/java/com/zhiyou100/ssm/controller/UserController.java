package com.zhiyou100.ssm.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zhiyou100.ssm.model.RoleVO;
import com.zhiyou100.ssm.model.User;
import com.zhiyou100.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
		@Autowired
		UserService us;
		@RequestMapping("/login.action")
		public String login(RoleVO rv,HttpServletRequest req,HttpServletResponse res) throws Exception{
			User ur = us.login(rv);		
			if(ur == null){
				req.setAttribute("errorMessage", "用户名密码不匹配");
			return	"forward:/index.jsp";
			}else {
				req.getSession().setAttribute("user", ur);
			return	"forward:/admin.jsp";
			}		
		}
	}

