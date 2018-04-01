package com.mbcrmsys.controller;

import com.mbcrmsys.common.Const;
import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Consumer;
import com.mbcrmsys.pojo.Serve;
import com.mbcrmsys.service.IServeService;
import com.mbcrmsys.vo.SimServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/11 21:08
 *
 * @Email 1206966083@qq.com
 */
@Controller
@RequestMapping("/serve/")
public class ServiceController {
    @Autowired
    private IServeService servcieService;

    /**
     * 根据条件查询list
     * @param session
     * @param serve
     * @return
     */
    @GetMapping("selectlist.do")
    @ResponseBody
    public ServerResponse<List<Serve>> serviceProcessList(HttpSession session,Serve serve){
        System.out.println("serve的值"+serve.getSerState());
        System.out.println("serve的值"+serve);
        return servcieService.selectlist(serve);
    }

    @PostMapping("createserve.do")
    @ResponseBody
    public ServerResponse<String> serviceCreate(HttpSession session,Serve serve){
        Consumer user= (Consumer) session.getAttribute(Const.CURRENT_USER);
        serve.setSerCreaterName(user.getConName());
        Date day=new Date();
        serve.setSerCreaterDate(day);
        return servcieService.serviceCreate(serve);
    }


    /**
     * 根据id删除销售机会
     * @param session
     * @param serId
     * @return
     */
    @PostMapping("deletebyid.do")
    @ResponseBody
    public ServerResponse<String> deleteById(HttpSession session,String serId){

        Long id=Long.parseLong(serId);
        return servcieService.deleteById(id);
    }
    @PostMapping("selectbyid.do")
    @ResponseBody
    public ServerResponse<Serve> selectById(HttpSession session,String serId){

        Long id=Long.parseLong(serId);
        return servcieService.selectById(id);
    }

    /**
     * 指派人员
     * @param session
     * @param simServe  这个是vo中用来对应前端传过来的
     * @return
     */
    @PostMapping("distributionser.do")
    @ResponseBody
    public ServerResponse<String> assignSaleOpp(HttpSession session, SimServe simServe){

        if (simServe != null){
            return  servcieService.assignSaleOpp(simServe);
        }else {
            return ServerResponse.createByErrorMessage("选择失败");
        }

    }

    @PostMapping("processedit.do")
    @ResponseBody
    public ServerResponse<String> processedit(HttpSession session,Serve serve){
        if (serve != null){
            Consumer user= (Consumer) session.getAttribute(Const.CURRENT_USER);
            System.out.println("userName是否优质"+user.getConName());
            serve.setSerHandleName(user.getConName());
            return  servcieService.processedit(serve);
        }else {
            return ServerResponse.createByErrorMessage("选择失败");
        }
    }

    @PostMapping("feedback.do")
    @ResponseBody
    public ServerResponse<String> feedback(HttpSession session,Serve serve){
        if (serve != null){
            return  servcieService.feedback(serve);
        }else {
            return ServerResponse.createByErrorMessage("选择失败");
        }
    }
}
