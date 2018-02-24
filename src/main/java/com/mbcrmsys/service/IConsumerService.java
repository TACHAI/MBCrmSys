package com.mbcrmsys.service;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Consumer;

/**
 * Created by @Author tachai
 * date 2018/2/24 9:58
 *
 * @Email 1206966083@qq.com
 */
public interface IConsumerService {
    ServerResponse<Consumer> login(String name,String password);
}
