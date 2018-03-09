package com.mbcrmsys.service;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Linkman;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/7 11:02
 *
 * @Email 1206966083@qq.com
 */
public interface ILinkmanService {
    ServerResponse<List<Linkman>> selectList(Integer cusId);
    ServerResponse<Linkman> selectById(Integer linId);
    ServerResponse<String> insertLinkMan(Linkman linkman);
    ServerResponse<String> updateLinkMan(Linkman linkman);
    ServerResponse<String> deleteById(Integer linId);
}
