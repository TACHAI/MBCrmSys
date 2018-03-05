package com.mbcrmsys.service.impl;

import com.mbcrmsys.common.ResponseCode;
import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.dao.CustomerMapper;
import com.mbcrmsys.pojo.Customer;
import com.mbcrmsys.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/5 10:47
 *
 * @Email 1206966083@qq.com
 */
@Service("iCustomerService")
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public ServerResponse<List<Customer>> selectByCondition(String cusName, String cusManage, String cusState) {
        Long state;
        if(cusState!=null && cusState!=""){
             state=Long.valueOf(cusState);
        }else {
             state=null;
        }
        List<Customer> list=customerMapper.selectByCondition(cusName,cusManage,state);
        if(list!=null){
            return ServerResponse.createBySuccess(list, ResponseCode.SUCCESS.getDesc());
        }else {
            return ServerResponse.createByErrorMessage(ResponseCode.ERROR.getDesc());
        }
    }

    @Override
    public ServerResponse<Customer> selectById(Integer cusId) {
        Customer customer=customerMapper.selectByPrimaryKey(cusId);
        if(customer != null ){
            return ServerResponse.createBySuccess(customer,ResponseCode.SUCCESS.getDesc());
        }else {
            return ServerResponse.createByErrorMessage(ResponseCode.ERROR.getDesc());
        }
    }

    @Override
    public ServerResponse<String> updateCustomer(Customer customer) {
        int result=customerMapper.updateByPrimaryKeySelective(customer);
        if(result>0){
            return ServerResponse.createBySuccessMessage("更新成功");
        }else {
            return ServerResponse.createByErrorMessage("更新失败");
        }
    }
}
