package com.mbcrmsys.service.impl;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.dao.LostMapper;
import com.mbcrmsys.pojo.Lost;
import com.mbcrmsys.service.ILostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/9 9:53
 *
 * @Email 1206966083@qq.com
 */
@Service("iLostService")
public class LostServiceImpl implements ILostService {
    @Autowired
    private LostMapper lostMapper;

    @Override
    public ServerResponse<List<Lost>> selectList(String losCustomer, String losManager, Long losState) {
        List<Lost> list = lostMapper.selectList(losCustomer,losManager,losState);
        if(list!=null){
            return ServerResponse.createBySuccess(list,"查询成功");
        }else {
            return ServerResponse.createByErrorMessage("没有查到相关的值");
        }
    }

    @Override
    public ServerResponse<Lost> selectById(Integer losId) {
        Lost lost=lostMapper.selectByPrimaryKey(losId);
        if(lost!=null){
            return ServerResponse.createBySuccess(lost,"查询成功");
        }else {
            return ServerResponse.createByErrorMessage("没有查到相关的值");
        }
    }

    @Override
    public ServerResponse<String> update(Lost lost) {
        int result = lostMapper.updateByPrimaryKeySelective(lost);
        if(result>0){
            return ServerResponse.createBySuccessMessage("更新成功");
        }else {
            return ServerResponse.createByErrorMessage("更新失败");
        }
    }

    @Override
    public ServerResponse<String> insert(Lost lost) {
        int result = lostMapper.insert(lost);
        if(result>0){
            return ServerResponse.createBySuccessMessage("新增成功");
        }else {
            return ServerResponse.createByErrorMessage("新增失败");
        }
    }
}
