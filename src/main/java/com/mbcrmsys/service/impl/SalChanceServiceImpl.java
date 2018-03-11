package com.mbcrmsys.service.impl;

import com.mbcrmsys.common.ResponseCode;
import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.dao.ConsumerMapper;
import com.mbcrmsys.dao.SalChanceMapper;
import com.mbcrmsys.pojo.SalChance;
import com.mbcrmsys.service.ISalChanceService;
import com.mbcrmsys.vo.SimSaleOpportunity;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    @Autowired
    private ConsumerMapper consumerMapper;
    @Override
    public ServerResponse<List<SalChance>> selectByCondition(String chc_cust_name, String chc_title, String chc_linkman) {
        List<SalChance> list=salChanceMapper.selectByCondition(chc_cust_name,chc_title,chc_linkman);
        if(list!=null){
            return ServerResponse.createBySuccess(list, ResponseCode.SUCCESS.getDesc());

        }else {
           return ServerResponse.createByErrorMessage(ResponseCode.ERROR.getDesc());
        }
    }

    @Override
    public ServerResponse<String> deleteById(Long id) {
        int result=salChanceMapper.deleteByPrimaryKey(id);
        if(result>0){
            return ServerResponse.createBySuccessMessage("删除成功");
        }else {
            return ServerResponse.createByErrorMessage("删除失败");
        }
    }

    @Override
    public ServerResponse<SalChance> selectById(Long id) {
        SalChance  salChance=salChanceMapper.selectByPrimaryKey(id);
        if(salChance!=null){
            return ServerResponse.createBySuccess(salChance,"查询成功");
        }else {
            return ServerResponse.createByErrorMessage("删除失败");
        }
    }

    @Override
    public ServerResponse<String> saveSalChance(SalChance salChance) {
        int resultcount = salChanceMapper.insert(salChance);
        if (resultcount>0){
            System.out.println("salChancename"+salChance.getChcCustName());
            return ServerResponse.createBySuccessMessage("保存成功");
        }else {
            return ServerResponse.createByErrorMessage("保存失败");
        }
    }

    @Override
    public ServerResponse<String> updateSalChance(SalChance salChance) {
        int resultcount = salChanceMapper.updateByPrimaryKeySelective(salChance);
        if (resultcount>0){
            return ServerResponse.createBySuccessMessage("保存成功");
        }else {
            return ServerResponse.createByErrorMessage("保存失败");
        }
    }

    @Override
    public ServerResponse<String> assignSaleOpp(SimSaleOpportunity simSaleOpportunity) {
        SalChance salChance=salChanceMapper.selectByPrimaryKey(simSaleOpportunity.getChcId());
        salChance.setChcDueDate(simSaleOpportunity.getChcDueDate());
        salChance.setChcDueName(simSaleOpportunity.getChcDueName());
        int resultcount = salChanceMapper.updateByPrimaryKeySelective(salChance);
        if (resultcount>0){
            return ServerResponse.createBySuccessMessage("指派成功");
        }else {
            return ServerResponse.createByErrorMessage("指派失败");
        }
    }
}
