package com.mbcrmsys.service;

import com.mbcrmsys.pojo.Area;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/6 21:10
 *
 * @Email 1206966083@qq.com
 */
public interface IAreaService {
    Area selectById(Integer id);
    List<Area> selectArea();
}
