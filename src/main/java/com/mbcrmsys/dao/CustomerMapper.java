package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer cusId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer cusId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
    List<Customer> selectByCondition(@Param("cusName") String cusName, @Param("cusManager") String cusManager, @Param("cusState") Long cusState);
}