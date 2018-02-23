package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.Lost;

public interface LostMapper {
    int deleteByPrimaryKey(Integer losId);

    int insert(Lost record);

    int insertSelective(Lost record);

    Lost selectByPrimaryKey(Integer losId);

    int updateByPrimaryKeySelective(Lost record);

    int updateByPrimaryKey(Lost record);
}