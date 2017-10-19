package com.zhiyou100.ssm.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.zhiyou100.ssm.model.Role;
import com.zhiyou100.ssm.model.RoleVO;
import com.zhiyou100.ssm.service.RoleService;
import com.zhiyou100.ssm.util.Page;


@Controller
@RequestMapping("/role")
public class RoleController {
	@Autowired
	RoleService rs;
	@RequestMapping("/roleList.action")
	public ModelAndView roleList(RoleVO rv){
		String sousuo = rv.getSousuo();
		String ziduan = rv.getZiduan();
		if(sousuo == null || ziduan == null){
			sousuo = "";
			ziduan = "r_name";
		}
		int currentPage = rv.getPage()==0? 1:rv.getPage();
		rv.setSousuo(sousuo);
		rv.setZiduan(ziduan);
		rv.setPage(currentPage);
		Page page =rs.loadPage(rv);
		ModelAndView mv = new ModelAndView();		
		mv.addObject("sousuo",sousuo);
		mv.addObject("ziduan",ziduan);
		mv.addObject("page",page);
		mv.setViewName("/role/roleList");
		return mv;
	}
	@RequestMapping("/updateRole.action")
	public ModelAndView updateRole(@RequestParam(value="id",required=true,defaultValue="1")Integer id){
		Role r = rs.updateRole(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("role",r);
		mv.setViewName("role/updateRole");
		return mv;
	}
	@RequestMapping(value="/updateRole.action",method=RequestMethod.POST)
	public String updateRole(Role r,MultipartFile pic) throws Exception{
		String str = UUID.randomUUID().toString().replaceAll("-","");
		String ext = FilenameUtils.getExtension(pic.getOriginalFilename());
		String fileName =str+"."+ext;
		r.setrPic(fileName);
		String path = "D:\\upload";
		pic.transferTo(new File(path+"\\"+fileName));	
		rs.submitUpdateRole(r);
		return"redirect:/role/roleList.action";
	}
	@RequestMapping(value="/addRole.action",method=RequestMethod.GET)
	public ModelAndView addRole(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("role/addRole");
		return mv;
	}
	@RequestMapping(value="/addRole.action",method=RequestMethod.POST)
	public String addRole(Role r){
		rs.addRole(r);
		return "redirect:/role/roleList.action";
	}
	@RequestMapping("/editRole.action")
	public ModelAndView editRole(RoleVO rv){
		System.out.println(rv);
		//rs.addRole(rV);	
		return null;
	}
	@RequestMapping("/editAllRole.action")
	public ModelAndView editAllRole(RoleVO rv){
		System.out.println(rv);
		System.out.println(rv.getR());
		//rs.addRole(rV);	
		return null;
	}
	@RequestMapping("/deleteRole.action")
	public String deleteRole(Integer id){
		rs.deleteRoleById(id); 		
		return "redirect:/role/roleList.action";
	}
/*	@RequestMapping("/seek.action")
	public ModelAndView seekRole(RoleVO rv){
		String sousuo = rv.getSuosou();
		String ziduan = rv.getZiduan();
		if(sousuo == null || ziduan == null){
			sousuo = "";
			ziduan = "r_name";
		}
		int currentPage = rv.getPage()==0? 1:rv.getPage();
		rv.setPage(currentPage);
		Page page =rs.loadPage(rv);
		ModelAndView mv = new ModelAndView();		
		mv.addObject("sousuo",sousuo);
		mv.addObject("ziduan",ziduan);
		mv.addObject("page",page);
		mv.setViewName("/role/roleList");
		return mv;
		
	}*/
	
}	

