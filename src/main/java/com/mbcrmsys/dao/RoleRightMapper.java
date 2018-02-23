package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.RoleRight;

public interface RoleRightMapper {
    int deleteByPrimaryKey(Integer rtId);

    int insert(RoleRight record);

    int insertSelective(RoleRight record);

    RoleRight selectByPrimaryKey(Integer rtId);

    int updateByPrimaryKeySelective(RoleRight record);

    int updateByPrimaryKey(RoleRight record);
}