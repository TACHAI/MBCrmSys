package com.mbcrmsys.service.impl;

import com.mbcrmsys.common.ResponseCode;
import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.dao.SalChanceMapper;
import com.mbcrmsys.pojo.SalChance;
import com.mbcrmsys.service.ISalChanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/2/26 15:53
 *
 * @Email 1206966083@qq.com
 */
@Service("iSalChanceService")
public class SalChanceServiceImpl implements ISalChanceService {
    @Autowired
    private SalChanceMapper salChanceMapper;
    @Override
    public ServerResponse<List<SalChance>> selectByCondition(String chc_cust_name, String chc_title, String chc_linkman) {
        List<SalChance> list=salChanceMapper.selectByCondition(chc_cust_name,chc_title,chc_linkman);
        if(list!=null){
            return ServerResponse.createBySuccess(list, ResponseCode.SUCCESS.getDesc());

        }else {
           return ServerResponse.createByErrorMessage(ResponseCode.ERROR.getDesc());
        }
    }
}
