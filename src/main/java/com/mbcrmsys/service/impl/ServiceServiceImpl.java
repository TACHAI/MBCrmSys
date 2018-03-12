package com.mbcrmsys.service.impl;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.dao.ServeMapper;
import com.mbcrmsys.pojo.Serve;
import com.mbcrmsys.service.IServcieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by @Author tachai
 * date 2018/3/11 21:10
 *
 * @Email 1206966083@qq.com
 */
@Service("iServcieService")
public class ServiceServiceImpl implements IServcieService{
    @Autowired
    private ServeMapper serveMapper;
    @Override
    public ServerResponse<String> serviceCreate(Serve serve) {
        int result=serveMapper.insert(serve);
        if(result>0){
            return ServerResponse.createBySuccessMessage("新建服务成功");
        }else {
            return ServerResponse.createByErrorMessage("新建服务失败");
        }

    }
}
