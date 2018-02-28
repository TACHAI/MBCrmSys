package com.mbcrmsys.controller;

import com.mbcrmsys.common.Const;
import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Consumer;
import com.mbcrmsys.pojo.SalChance;
import com.mbcrmsys.service.ISalChanceService;
import com.mbcrmsys.util.CheckLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/2/26 15:59
 *
 * @Email 1206966083@qq.com
 */
@Controller
@RequestMapping("/saleopp/")
public class SalChanceController {
    @Autowired
    private ISalChanceService iSalChanceService;

    @GetMapping("getall.do")
    @ResponseBody
    public ServerResponse<List<SalChance>> selectByCondition(String chc_cust_name, String chc_title, String chc_linkman, HttpSession session){
        //检查是否登录
        CheckLogin.check(session);
        try {
            chc_cust_name =URLDecoder.decode(chc_cust_name,"utf-8");
            chc_title =URLDecoder.decode(chc_title,"utf-8");
            chc_linkman =URLDecoder.decode(chc_linkman,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        ServerResponse<List<SalChance>> serverResponse=iSalChanceService.selectByCondition(chc_cust_name,chc_title,chc_linkman);
        return serverResponse;
    }

    @PostMapping("deletebyid.do")
    @ResponseBody
    public ServerResponse<String> deleteById(HttpSession session,String id){
        CheckLogin.check(session);
        Long salId=Long.parseLong(id);
        return iSalChanceService.deleteById(salId);
    }
}
