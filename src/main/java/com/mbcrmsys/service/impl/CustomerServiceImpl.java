package com.mbcrmsys.service.impl;

import com.mbcrmsys.common.ResponseCode;
import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.dao.CustomerMapper;
import com.mbcrmsys.pojo.Area;
import com.mbcrmsys.pojo.Customer;
import com.mbcrmsys.pojo.CustomerRank;
import com.mbcrmsys.service.ICustomerService;
import com.mbcrmsys.vo.CustomerVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
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
    @Autowired
    private AreaServiceImpl areaService;
    @Autowired
    private  CustomerRankServiceImpl customerRankService;
    @Override
    public ServerResponse<List<Customer>> selectByCondition(String cusName, String cusManage, String cusState) {
        Long state;
        if(!StringUtils.isBlank(cusState)){
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
    public ServerResponse<CustomerVo> selectById(Integer cusId) {
        Customer customer=customerMapper.selectByPrimaryKey(cusId);
        CustomerVo customerVo= new CustomerVo();

        if(customer.getCusAreId()!=null){
            Area area=areaService.selectById(customer.getCusAreId());
            customerVo.setArea(area);
        }
        if(customer.getCusCkId()!=null){
            CustomerRank customerRank=customerRankService.selectById(customer.getCusCkId());
            customerVo.setCustomerRank(customerRank);
        }
        if(customerVo != null ){
            BeanUtils.copyProperties(customer,customerVo);
            return ServerResponse.createBySuccess(customerVo,ResponseCode.SUCCESS.getDesc());
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

    @Override
    public ServerResponse<String> saveCustomer(Customer customer) {
        List<Customer> result=customerMapper.selectByCondition(customer.getCusName(),null,null);
//
        if(result==null){
            int result1=customerMapper.insert(customer);
            if(result1>0){
                return ServerResponse.createBySuccessMessage("保存成功");
            }else {
                return ServerResponse.createByErrorMessage("保存失败");
            }
        }else {
            return ServerResponse.createByErrorMessage("该用户已存在");
        }

    }

    @Override
    public List<Customer> selectCus() {
        List<Customer> list=customerMapper.selectCus();
        return list;
    }
}
