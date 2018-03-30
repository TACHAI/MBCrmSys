package com.mbcrmsys.service.impl;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.dao.ServeMapper;
import com.mbcrmsys.pojo.Serve;
import com.mbcrmsys.service.IServeService;
import com.mbcrmsys.vo.SimServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/11 21:10
 *
 * @Email 1206966083@qq.com
 */
@Service("iServeService")
public class ServeServiceImpl implements IServeService {
    @Autowired
    private ServeMapper serveMapper;
    @Override
    public ServerResponse<String> serviceCreate(Serve serve) {
        int result=serveMapper.insert(serve);
        if(result>0){
            return ServerResponse.createBySuccessMessage("新建服务成功");
        }else {
            return ServerResponse.createByErrorMessage("新建服务失败");
        }

    }

    @Override
    public ServerResponse<List<Serve>> selectlist(Serve serve) {
        System.out.println("serve是否有值"+serve.getSerState());
        List<Serve> list= serveMapper.selectlist(serve);
        if(list!=null){
            return ServerResponse.createBySuccess(list,"查询列表成功");
        }else {
            return ServerResponse.createByErrorMessage("查询列表失败");
        }
    }

    @Override
    public ServerResponse<Serve> selectById(Long serId) {
        Serve serve=serveMapper.selectByPrimaryKey(serId);
        if(serve!=null){
            return ServerResponse.createBySuccess(serve,"查询成功");
        }else {
            return ServerResponse.createByErrorMessage("查询失败");
        }
    }

    @Override
    public ServerResponse<String> deleteById(Long serId) {
        int result=serveMapper.deleteByPrimaryKey(serId);
        if(result>0){
            return ServerResponse.createBySuccessMessage("删除成功");
        }else {
            return ServerResponse.createByErrorMessage("删除失败");
        }
}

    @Override
    public ServerResponse<String> assignSaleOpp(SimServe simServe) {
        Serve serve = serveMapper.selectByPrimaryKey(simServe.getSerId());
        serve.setSerAllotDate(simServe.getSerAllotDate());
        serve.setSerAllotName(simServe.getSerAllotName());
        serve.setSerState(simServe.getSerState());
        int resultcount = serveMapper.updateByPrimaryKeySelective(serve);
        if (resultcount>0){
            return ServerResponse.createBySuccessMessage("指派成功");
        }else {
            return ServerResponse.createByErrorMessage("指派失败");
        }
    }

    @Override
    public ServerResponse<String> processedit(Serve serve) {
        Serve  serverDTO=serveMapper.selectByPrimaryKey(serve.getSerId());
        serverDTO.setSerHandleName(serve.getSerHandleName());
        serverDTO.setSerHandleDate(serve.getSerHandleDate());
        serverDTO.setSerHandle(serve.getSerHandle());
        serverDTO.setSerState(3);
        int result=serveMapper.updateByPrimaryKeySelective(serverDTO);
        if (result>0){
            return ServerResponse.createBySuccessMessage("处理成功");
        }else {
            return ServerResponse.createByErrorMessage("处理失败");
        }
    }
}
