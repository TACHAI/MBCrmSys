package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.CustomerRank;

import java.util.List;

public interface CustomerRankMapper {
    int deleteByPrimaryKey(Integer ckId);

    int insert(CustomerRank record);

    int insertSelective(CustomerRank record);

    CustomerRank selectByPrimaryKey(Integer ckId);

    int updateByPrimaryKeySelective(CustomerRank record);

    int updateByPrimaryKey(CustomerRank record);
//    List<CustomerRank> selectByCusId(Integer cusId);
}