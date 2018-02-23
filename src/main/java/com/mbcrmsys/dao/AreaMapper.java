package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.Area;

public interface AreaMapper {
    int deleteByPrimaryKey(Integer areId);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer areId);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}