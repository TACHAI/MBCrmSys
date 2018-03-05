package com.mbcrmsys.controller;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Customer;
import com.mbcrmsys.service.ICustomerService;
import com.mbcrmsys.util.CheckLogin;
import com.mbcrmsys.util.DecoderSelectByCondition;
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
import java.util.Map;

/**
 * Created by @Author tachai
 * date 2018/3/5 10:43
 *
 * @Email 1206966083@qq.com
 */
@Controller
@RequestMapping("/cmp/")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    /**
     * 查询所有
     * @param cusName
     * @param cusManager
     * @param cusState
     * @param session
     * @return
     */
    @GetMapping("getall.do")
    @ResponseBody
    public ServerResponse<List<Customer>> selectByCondition(String cusName, String cusManager, String cusState, HttpSession session){
        //检查是否登录
        CheckLogin.check(session);
        Map<String,String> map=DecoderSelectByCondition.decoder(cusName,cusManager,cusState);
        ServerResponse<List<Customer>> serverResponse=iCustomerService.selectByCondition(map.get("param1"),map.get("param2"),map.get("param3"));
        return serverResponse;
    }

    /**
     * 根据id查
     * @param cusId
     * @param session
     * @return
     */
    @PostMapping("slectbyid.do")
    @ResponseBody
    public ServerResponse<Customer> selectById(String cusId,HttpSession session){
        CheckLogin.check(session);
        Integer id=Integer.valueOf(cusId);
        return iCustomerService.selectById(id);
    }
    @PostMapping("updatecus")
    @ResponseBody
    public ServerResponse<String> updateCustomer(Customer customer,HttpSession session){
        CheckLogin.check(session);
        return iCustomerService.updateCustomer(customer);
    }
}
