package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.Consumer;
import org.apache.ibatis.annotations.Param;

public interface ConsumerMapper {
    int deleteByPrimaryKey(Integer conId);

    int insert(Consumer record);

    int insertSelective(Consumer record);

    Consumer selectByPrimaryKey(Integer conId);

    int updateByPrimaryKeySelective(Consumer record);

    int updateByPrimaryKey(Consumer record);

    Consumer selectByUser(@Param("name") String name, @Param("password") String password);
    int selectByUserName(String name);
}