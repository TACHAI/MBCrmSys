package com.mbcrmsys.controller;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Orders;
import com.mbcrmsys.service.IOrdersService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/6 22:54
 *
 * @Email 1206966083@qq.com
 */
@Controller
@RequestMapping("/order/")
public class OrderController {
    @Autowired
    private IOrdersService ordersService;

    @PostMapping("selectlist")
    @ResponseBody
    public ServerResponse<List<Orders>> selectList(HttpSession session, String cusId){
        if(StringUtils.isBlank(cusId)){
            Integer id=Integer.valueOf(cusId);
            return ordersService.selectList(id);
        }else {
            return ServerResponse.createByErrorMessage("输入的值为空");
        }
    }
}
