package com.mbcrmsys.service.impl;

import com.mbcrmsys.dao.AreaMapper;
import com.mbcrmsys.pojo.Area;
import com.mbcrmsys.service.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/6 21:24
 *
 * @Email 1206966083@qq.com
 */
@Service("iAreaService")
public class AreaServiceImpl implements IAreaService {
    @Autowired
    private AreaMapper areaMapper;
    @Override
    public Area selectById(Integer id) {
        Area area= areaMapper.selectByPrimaryKey(id);
        return area;
    }

    @Cacheable(cacheNames = "Area",key = "003")
    @Override
    public List<Area> selectArea() {
        List<Area> list= areaMapper.selectArea();
        return list;
    }

}
