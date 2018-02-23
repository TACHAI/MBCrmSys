package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.OrdersDetail;

public interface OrdersDetailMapper {
    int deleteByPrimaryKey(Integer olId);

    int insert(OrdersDetail record);

    int insertSelective(OrdersDetail record);

    OrdersDetail selectByPrimaryKey(Integer olId);

    int updateByPrimaryKeySelective(OrdersDetail record);

    int updateByPrimaryKeyWithBLOBs(OrdersDetail record);

    int updateByPrimaryKey(OrdersDetail record);
}