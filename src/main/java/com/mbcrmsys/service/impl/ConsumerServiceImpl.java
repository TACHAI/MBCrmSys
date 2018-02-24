package com.mbcrmsys.service.impl;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.dao.ConsumerMapper;
import com.mbcrmsys.pojo.Consumer;
import com.mbcrmsys.service.IConsumerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by @Author tachai
 * date 2018/2/24 10:01
 *
 * @Email 1206966083@qq.com
 */
@Service("iConsumerService")
public class ConsumerServiceImpl implements IConsumerService {
    @Autowired
    private ConsumerMapper consumerMapper;
    @Override
    public ServerResponse<Consumer> login(String name, String password) {
        int resultCount = consumerMapper.selectByUserName(name);
        if(resultCount==0){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }
        Consumer consumer=consumerMapper.selectByUser(name,password);
        if(consumer==null){
            return ServerResponse.createByErrorMessage("密码错误");
        }
        consumer.setConPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess(consumer,"登陆成功");
    }
}
