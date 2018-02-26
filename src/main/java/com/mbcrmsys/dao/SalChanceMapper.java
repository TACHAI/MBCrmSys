package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.SalChance;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SalChanceMapper {
    int deleteByPrimaryKey(Long chcId);

    int insert(SalChance record);

    int insertSelective(SalChance record);

    SalChance selectByPrimaryKey(Long chcId);

    int updateByPrimaryKeySelective(SalChance record);

    int updateByPrimaryKey(SalChance record);

    List<SalChance> selectByCondition(@Param("chc_cust_name")String chc_cust_name, @Param("chc_title")String chc_title, @Param("chc_linkman")String chc_linkman);
}