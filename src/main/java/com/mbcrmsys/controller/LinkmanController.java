package com.mbcrmsys.controller;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Linkman;
import com.mbcrmsys.service.ILinkmanService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/6 22:55
 *
 * @Email 1206966083@qq.com
 */
@Controller
@RequestMapping("/linkman/")
public class LinkmanController {
    @Autowired
    private ILinkmanService linkmanService;

    @GetMapping("selectlist.do")
    @ResponseBody
    public ServerResponse<List<Linkman>> selectList(HttpSession session, String cusId){
        if(!StringUtils.isBlank(cusId)){
            Integer id=Integer.valueOf(cusId);
            return linkmanService.selectList(id);
        }else {
            return ServerResponse.createByErrorMessage("输入的值为空");
        }
    }

    @PostMapping("selectbyid.do")
    @ResponseBody
    public ServerResponse<Linkman> selectById(HttpSession session,String linId){
        if(!StringUtils.isBlank(linId)){
            Integer id=Integer.valueOf(linId);
            return linkmanService.selectById(id);
        }else {
            return ServerResponse.createByErrorMessage("查询的值为空");
        }
    }

    @PostMapping("addlinkman.do")
    @ResponseBody
    public ServerResponse<String> insertLinkMan(HttpSession session,Linkman linkman){
        return  linkmanService.insertLinkMan(linkman);
    }

    @PostMapping("updatelinkman.do")
    @ResponseBody
    public ServerResponse<String> updateLinkMan(HttpSession session,Linkman linkman){
        return linkmanService.updateLinkMan(linkman);
    }

    @PostMapping("deletebyid.do")
    @ResponseBody
    public ServerResponse<String> deleteById(HttpSession session,String linId){
        if(!StringUtils.isBlank(linId)){
            Integer id=Integer.valueOf(linId);
            return linkmanService.deleteById(id);
        }else {
            return ServerResponse.createByErrorMessage("linId:"+linId);
        }
    }
}
