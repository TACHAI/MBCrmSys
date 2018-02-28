package com.mbcrmsys.controller;

import com.mbcrmsys.common.Const;
import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Consumer;
import com.mbcrmsys.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by @Author tachai
 * date 2018/2/24 10:24
 *
 * @Email 1206966083@qq.com
 */
@Controller
@RequestMapping("/user/")
public class ConsumerController {
    @Autowired
    private IConsumerService iConsumerService;

    @PostMapping("login.do")
    @ResponseBody
    public ServerResponse<Consumer> login(Consumer user, HttpSession session){
        System.out.println("name"+user.getConName()+"  password"+user.getConPassword());
        ServerResponse<Consumer> response=iConsumerService.login(user.getConName(),user.getConPassword());
        if(response.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }
}
