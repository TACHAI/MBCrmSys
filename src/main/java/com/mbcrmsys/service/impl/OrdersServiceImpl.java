package com.mbcrmsys.service.impl;

import com.mbcrmsys.common.ResponseCode;
import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.dao.OrdersMapper;
import com.mbcrmsys.pojo.Orders;
import com.mbcrmsys.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/7 11:13
 *
 * @Email 1206966083@qq.com
 */
@Service("iOrdersService")
public class OrdersServiceImpl implements IOrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public ServerResponse<List<Orders>> selectList(Integer cusId) {
        List<Orders> list=ordersMapper.selectList(cusId);
        if(list!=null){
            return ServerResponse.createBySuccess(list, ResponseCode.SUCCESS.getDesc());
        }else {
            return ServerResponse.createByErrorMessage(ResponseCode.ERROR.getDesc());
        }
    }
}
