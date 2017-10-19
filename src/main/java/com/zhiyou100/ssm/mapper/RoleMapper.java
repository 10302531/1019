package com.zhiyou100.ssm.mapper;

import com.zhiyou100.ssm.model.Role;
import com.zhiyou100.ssm.model.RoleExample;
import com.zhiyou100.ssm.model.RoleVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    int countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

	int findAllRoleCount(RoleVO rv);

	List<Role> findAllRole(RoleVO rv);
}