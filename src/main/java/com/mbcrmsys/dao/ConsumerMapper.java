package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.Consumer;

public interface ConsumerMapper {
    int deleteByPrimaryKey(Integer conId);

    int insert(Consumer record);

    int insertSelective(Consumer record);

    Consumer selectByPrimaryKey(Integer conId);

    int updateByPrimaryKeySelective(Consumer record);

    int updateByPrimaryKey(Consumer record);
}