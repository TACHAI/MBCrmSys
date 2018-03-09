package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.Lost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LostMapper {
    int deleteByPrimaryKey(Integer losId);

    int insert(Lost record);

    int insertSelective(Lost record);

    Lost selectByPrimaryKey(Integer losId);

    int updateByPrimaryKeySelective(Lost record);

    int updateByPrimaryKey(Lost record);

    List<Lost> selectList(@Param("losCustomer") String losCustomer, @Param("losManager") String losManager,@Param("losState") Long losState);
}