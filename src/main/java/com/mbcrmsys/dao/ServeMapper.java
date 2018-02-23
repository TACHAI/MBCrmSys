package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.Serve;

public interface ServeMapper {
    int deleteByPrimaryKey(Long serId);

    int insert(Serve record);

    int insertSelective(Serve record);

    Serve selectByPrimaryKey(Long serId);

    int updateByPrimaryKeySelective(Serve record);

    int updateByPrimaryKey(Serve record);
}