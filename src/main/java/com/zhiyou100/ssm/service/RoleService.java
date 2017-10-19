package com.zhiyou100.ssm.service;

import java.util.List;

import com.zhiyou100.ssm.model.Role;
import com.zhiyou100.ssm.model.RoleVO;
import com.zhiyou100.ssm.util.Page;

public interface RoleService {
	List<Role> findAllRole();

 Role updateRole(Integer id);

void addRole(Role r);

void submitUpdateRole(Role r);

void deleteRoleById(Integer id);
Page<Role> loadPage(RoleVO rv);	
}
