package com.mbcrmsys.service.impl;

import com.mbcrmsys.common.ResponseCode;
import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.dao.LinkmanMapper;
import com.mbcrmsys.pojo.Linkman;
import com.mbcrmsys.service.IAssortService;
import com.mbcrmsys.service.ILinkmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/7 11:03
 *
 * @Email 1206966083@qq.com
 */
@Service("iLinkmanService")
public class LinkmanServiceImpl implements ILinkmanService {
    @Autowired
    private LinkmanMapper linkmanMapper;

    @Override
    public ServerResponse<List<Linkman>> selectList(Integer cusId) {
        List<Linkman> list= linkmanMapper.selectList(cusId);
        if(list!=null){
            return ServerResponse.createBySuccess(list, ResponseCode.SUCCESS.getDesc());
        }else {
            return ServerResponse.createByErrorMessage(ResponseCode.ERROR.getDesc());
        }
    }

    @Override
    public ServerResponse<Linkman> selectById(Integer linId) {
        Linkman linkman=linkmanMapper.selectByPrimaryKey(linId);
        if(linkman!=null){
            return ServerResponse.createBySuccess(linkman,ResponseCode.SUCCESS.getDesc());
        }else {
            return ServerResponse.createByErrorMessage("没有相关的值");
        }
    }

    @Override
    public ServerResponse<String> insertLinkMan(Linkman linkman) {
        int result=linkmanMapper.insert(linkman);
        if(result>0){
            return ServerResponse.createBySuccessMessage("增加联系人成功");
        }else {
            return ServerResponse.createByErrorMessage("增加联系人失败");
        }
    }

    @Override
    public ServerResponse<String> updateLinkMan(Linkman linkman) {
        int result=linkmanMapper.updateByPrimaryKeySelective(linkman);
        if(result>0){
            return ServerResponse.createBySuccessMessage("更新成功");
        }else {
            return ServerResponse.createByErrorMessage("更新失败");
        }
    }

    @Override
    public ServerResponse<String> deleteById(Integer linId) {
        int result=linkmanMapper.deleteByPrimaryKey(linId);
        if(result>0){
            return ServerResponse.createBySuccessMessage("删除成功");
        }else {
            return ServerResponse.createByErrorMessage("删除失败");
        }
    }
}
