package com.mbcrmsys.controller;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Serve;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by @Author tachai
 * date 2018/3/11 21:08
 *
 * @Email 1206966083@qq.com
 */
@Controller
@RequestMapping("/service/")
public class ServiceController {

    @PostMapping("serviceprocesslist.do")
    @ResponseBody
    public ServerResponse<List<Serve>> serviceProcessList(HttpSession session,Serve serve){
        return null;
    }

    @PostMapping("serviceallocation.do")
    @ResponseBody
    public ServerResponse<List<Serve>> serviceAllocation(HttpSession session,Serve serve){
        return null;
    }
}
