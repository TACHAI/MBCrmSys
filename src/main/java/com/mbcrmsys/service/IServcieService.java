package com.mbcrmsys.service;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Serve;

/**
 * Created by @Author tachai
 * date 2018/3/11 21:09
 *
 * @Email 1206966083@qq.com
 */
public interface IServcieService {
    ServerResponse<String> serviceCreate(Serve serve);
}
