package com.mbcrmsys.service.impl;

import com.mbcrmsys.dao.CustomerRankMapper;
import com.mbcrmsys.pojo.CustomerRank;
import com.mbcrmsys.service.ICustomerRankSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/6 21:14
 *
 * @Email 1206966083@qq.com
 */
@Service("iCustomerRankSerivce")
public class CustomerRankServiceImpl implements ICustomerRankSerivce {
    @Autowired
    private CustomerRankMapper customerRankMapper;
    @Override
    public CustomerRank selectById(Integer id) {
        CustomerRank customerRank = customerRankMapper.selectByPrimaryKey(id);
        return customerRank;
    }
}
