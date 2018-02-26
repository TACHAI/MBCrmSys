package com.mbcrmsys.controller;

import com.mbcrmsys.common.Const;
import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Consumer;
import com.mbcrmsys.pojo.SalChance;
import com.mbcrmsys.service.ISalChanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
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

    @PostMapping("getall/")
    public ServerResponse<List<SalChance>> selectByCondition(HttpSession session,String chc_cust_name, String chc_title, String chc_linkman ){
        Consumer user=(Consumer) session.getAttribute(Const.CURRENT_USER);
        if(user==null){
            return ServerResponse.createByErrorMessage("用户未登录");
        }
        ServerResponse<List<SalChance>> serverResponse=iSalChanceService.selectByCondition(chc_cust_name,chc_title,chc_linkman);

        return serverResponse;
    }
}
