package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.Plan;

public interface PlanMapper {
    int deleteByPrimaryKey(Integer plaId);

    int insert(Plan record);

    int insertSelective(Plan record);

    Plan selectByPrimaryKey(Integer plaId);

    int updateByPrimaryKeySelective(Plan record);

    int updateByPrimaryKey(Plan record);
}