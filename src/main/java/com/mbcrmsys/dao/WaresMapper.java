package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.Wares;

public interface WaresMapper {
    int deleteByPrimaryKey(Integer warId);

    int insert(Wares record);

    int insertSelective(Wares record);

    Wares selectByPrimaryKey(Integer warId);

    int updateByPrimaryKeySelective(Wares record);

    int updateByPrimaryKey(Wares record);
}