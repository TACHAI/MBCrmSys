package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.Stock;

public interface StockMapper {
    int deleteByPrimaryKey(Integer stoId);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(Integer stoId);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
}