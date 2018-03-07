package com.mbcrmsys.service;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Orders;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/7 11:12
 *
 * @Email 1206966083@qq.com
 */
public interface IOrdersService {
    ServerResponse<List<Orders>> selectList(Integer cusId);
}
