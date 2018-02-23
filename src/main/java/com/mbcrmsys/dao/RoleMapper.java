package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer rolId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer rolId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}