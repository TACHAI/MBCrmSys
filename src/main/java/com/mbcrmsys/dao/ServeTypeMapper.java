package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.ServeType;

public interface ServeTypeMapper {
    int deleteByPrimaryKey(Integer seId);

    int insert(ServeType record);

    int insertSelective(ServeType record);

    ServeType selectByPrimaryKey(Integer seId);

    int updateByPrimaryKeySelective(ServeType record);

    int updateByPrimaryKey(ServeType record);
}