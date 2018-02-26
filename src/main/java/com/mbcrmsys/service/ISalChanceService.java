package com.mbcrmsys.service;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.SalChance;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/2/26 15:48
 *
 * @Email 1206966083@qq.com
 */
public interface ISalChanceService {
    ServerResponse<List<SalChance>> selectByCondition(String chc_cust_name,String chc_title,String chc_linkman);
}
