package com.mbcrmsys.service;

import com.mbcrmsys.pojo.CustomerRank;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/6 21:11
 *
 * @Email 1206966083@qq.com
 */
public interface ICustomerRankSerivce {
    CustomerRank selectById(Integer id);
    List<CustomerRank> selectRank();
}
