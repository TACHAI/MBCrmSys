package com.mbcrmsys.dao;

import com.mbcrmsys.pojo.Linkman;

public interface LinkmanMapper {
    int deleteByPrimaryKey(Integer linId);

    int insert(Linkman record);

    int insertSelective(Linkman record);

    Linkman selectByPrimaryKey(Integer linId);

    int updateByPrimaryKeySelective(Linkman record);

    int updateByPrimaryKey(Linkman record);
}