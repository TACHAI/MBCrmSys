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

    /**
     * 根据客户id查询列表
     * @param cusId
     * @return
     */
    @Override
    public ServerResponse<List<Assort>> selectList(Integer cusId) {
        List<Assort> list=assortMapper.selectBycusId(cusId);
        if(list!=null){
           return ServerResponse.createBySuccess(list, ResponseCode.SUCCESS.getDesc());
        }else {
            return ServerResponse.createByErrorMessage(ResponseCode.ERROR.getDesc());
        }
    }

    @Override
    public ServerResponse<Assort> selectById(Integer assId) {
        Assort assort=assortMapper.selectByPrimaryKey(assId);
        if(assort!=null){
            return ServerResponse.createBySuccess(assort,ResponseCode.SUCCESS.getDesc());
        }else {
            return ServerResponse.createByErrorMessage(ResponseCode.ERROR.getDesc());
        }
    }

    @Override
    public ServerResponse<String> updateAssort(Assort assort) {
        int result=assortMapper.updateByPrimaryKeySelective(assort);
        if(result>0){
            return ServerResponse.createBySuccessMessage("更新成功");
        }else {
            return ServerResponse.createByErrorMessage("更新失败");
        }
    }

    @Override
    public ServerResponse<String> insertAssort(Assort assort) {
        int result= assortMapper.insert(assort);
        if(result>0){
            return ServerResponse.createBySuccessMessage("新增交往记录成功");
        }else {
            return ServerResponse.createByErrorMessage("新增交往记录失败");
        }
    }

    @Override
    public ServerResponse<String> deleteById(Integer assId) {
        int result=assortMapper.deleteByPrimaryKey(assId);
        if(result>0){
            return ServerResponse.createBySuccessMessage("删除成功");
        }else {
            return ServerResponse.createByErrorMessage("删除失败");
        }
    }
}
