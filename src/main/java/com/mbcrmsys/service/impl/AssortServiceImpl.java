package com.mbcrmsys.service.impl;

import com.mbcrmsys.common.ResponseCode;
import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.dao.AssortMapper;
import com.mbcrmsys.pojo.Assort;
import com.mbcrmsys.service.IAssortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/7 10:40
 *
 * @Email 1206966083@qq.com
 */
@Service("iAssortService")
public class AssortServiceImpl implements IAssortService {
    @Autowired
    private AssortMapper assortMapper;
    @Override
    public ServerResponse<List<Assort>> selectList(Integer cusId) {
        List<Assort> list=assortMapper.selectBycusId(cusId);
        if(list!=null){
           return ServerResponse.createBySuccess(list, ResponseCode.SUCCESS.getDesc());
        }else {
            return ServerResponse.createByErrorMessage(ResponseCode.ERROR.getDesc());
        }
    }
}
