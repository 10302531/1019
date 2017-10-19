package com.zhiyou100.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.ssm.mapper.RoleMapper;
import com.zhiyou100.ssm.model.Role;
import com.zhiyou100.ssm.model.RoleVO;
import com.zhiyou100.ssm.service.RoleService;
import com.zhiyou100.ssm.util.Page;
@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleMapper rm;

	@Override
	public List<Role> findAllRole() {
		return rm.selectByExample(null);
	}
	@Override
	public Role updateRole(Integer id) {
		
	return rm.selectByPrimaryKey(id);
	}
	@Override
	public void addRole(Role r) {
		rm.insertSelective(r);
	}
	@Override
	public void submitUpdateRole(Role r) {
		rm.updateByPrimaryKeySelective(r);
	}
	@Override
	public void deleteRoleById(Integer id) {
			rm.deleteByPrimaryKey(id);
	}
	@Override
	public Page loadPage(RoleVO rv) {
		Page<Role> page = new Page<>();
		page.setPage(rv.getPage());
		page.setTotal(rm.findAllRoleCount(rv));
		page.setSize(10);
		rv.setPage((rv.getPage()-1)*10);
		page.setRows(rm.findAllRole(rv));
		return page;
	}
	
	
	
}
