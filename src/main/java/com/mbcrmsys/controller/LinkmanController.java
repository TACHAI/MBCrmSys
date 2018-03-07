package com.mbcrmsys.controller;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Linkman;
import com.mbcrmsys.service.ILinkmanService;
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
 * date 2018/3/6 22:55
 *
 * @Email 1206966083@qq.com
 */
@Controller
@RequestMapping("/linkman/")
public class LinkmanController {
    @Autowired
    private ILinkmanService linkmanService;

    @PostMapping("selectlist")
    @ResponseBody
    public ServerResponse<List<Linkman>> selectList(HttpSession session, String cusId){
        if(StringUtils.isBlank(cusId)){
            Integer id=Integer.valueOf(cusId);
            return linkmanService.selectList(id);
        }else {
            return ServerResponse.createByErrorMessage("输入的值为空");
        }
    }
}
