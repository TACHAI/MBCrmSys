package com.mbcrmsys.service;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Customer;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/5 10:46
 *
 * @Email 1206966083@qq.com
 */
public interface ICustomerService {
    ServerResponse<List<Customer>> selectByCondition(String cusName, String cusManage, String cusState);
    ServerResponse<Customer> selectById(Integer cusId);
    ServerResponse<String> updateCustomer(Customer customer);
}
