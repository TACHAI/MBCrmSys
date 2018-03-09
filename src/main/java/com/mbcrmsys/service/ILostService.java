package com.mbcrmsys.service;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Lost;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/9 9:38
 *
 * @Email 1206966083@qq.com
 */
public interface ILostService {
    ServerResponse<List<Lost>> selectList(String losCustomer,String losManager,Long losState);
    ServerResponse<Lost> selectById(Integer losId);
    ServerResponse<String> update(Lost lost);
    ServerResponse<String> insert(Lost lost);
}
