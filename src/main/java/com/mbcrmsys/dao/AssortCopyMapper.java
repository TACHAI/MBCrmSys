package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.AssortCopy;

public interface AssortCopyMapper {
    int deleteByPrimaryKey(Integer assId);

    int insert(AssortCopy record);

    int insertSelective(AssortCopy record);

    AssortCopy selectByPrimaryKey(Integer assId);

    int updateByPrimaryKeySelective(AssortCopy record);

    int updateByPrimaryKey(AssortCopy record);
}