package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.Assort;

public interface AssortMapper {
    int deleteByPrimaryKey(Integer assId);

    int insert(Assort record);

    int insertSelective(Assort record);

    Assort selectByPrimaryKey(Integer assId);

    int updateByPrimaryKeySelective(Assort record);

    int updateByPrimaryKey(Assort record);
}