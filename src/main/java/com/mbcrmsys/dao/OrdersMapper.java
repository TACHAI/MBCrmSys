package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.Orders;

import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer ordId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer ordId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
    List<Orders> selectList(Integer cusId);
}