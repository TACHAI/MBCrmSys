package com.mbcrmsys.service;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Serve;
import com.mbcrmsys.vo.SimServe;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/11 21:09
 *
 * @Email 1206966083@qq.com
 */
public interface IServeService {
    ServerResponse<String> serviceCreate(Serve serve);
    ServerResponse<List<Serve>> selectlist(Serve serve);
    ServerResponse<Serve> selectById(Long serId);
    ServerResponse<String> deleteById(Long serId);
    ServerResponse<String> assignSaleOpp(SimServe simServe);
    ServerResponse<String> processedit(Serve serve);
    ServerResponse<String> feedback(Serve serve);
}
