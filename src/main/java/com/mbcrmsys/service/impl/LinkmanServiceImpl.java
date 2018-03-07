package com.mbcrmsys.service.impl;

import com.mbcrmsys.common.ResponseCode;
import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.dao.LinkmanMapper;
import com.mbcrmsys.pojo.Linkman;
import com.mbcrmsys.service.IAssortService;
import com.mbcrmsys.service.ILinkmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/7 11:03
 *
 * @Email 1206966083@qq.com
 */
@Service("iLinkmanService")
public class LinkmanServiceImpl implements ILinkmanService {
    @Autowired
    private LinkmanMapper linkmanMapper;

    @Override
    public ServerResponse<List<Linkman>> selectList(Integer cusId) {
        List<Linkman> list= linkmanMapper.selectList(cusId);
        if(list!=null){
            return ServerResponse.createBySuccess(list, ResponseCode.SUCCESS.getDesc());
        }else {
            return ServerResponse.createByErrorMessage(ResponseCode.ERROR.getDesc());
        }
    }
}
