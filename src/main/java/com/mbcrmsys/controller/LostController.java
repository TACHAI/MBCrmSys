package com.mbcrmsys.controller;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Lost;
import com.mbcrmsys.service.ILostService;
import com.mbcrmsys.util.DecoderSelectByCondition;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by @Author tachai
 * date 2018/3/9 9:27
 *
 * @Email 1206966083@qq.com
 */
@Controller
@RequestMapping("/lost/")
public class LostController {
    @Autowired
    private ILostService lostService;

    @GetMapping("selectlist.do")
    @ResponseBody
    public ServerResponse<List<Lost>> selectList(HttpSession session,String losCustomer,String losManager,String losState){
        Map<String,String> map=DecoderSelectByCondition.decoder(losCustomer,losManager,losState);
        Long state = null;
        if(!StringUtils.isBlank(map.get("param3"))){
            state = Long.valueOf(map.get("param3"));
        }
        return  lostService.selectList(map.get("param1"),map.get("param2"),state);
    }

    @PostMapping("selectbyid.do")
    @ResponseBody
    public ServerResponse<Lost> selectById(HttpSession session,String losId){
        if(!StringUtils.isBlank(losId)){
            Integer id=Integer.valueOf(losId);
            return lostService.selectById(id);
        }else {
            return ServerResponse.createByErrorMessage("没有相关记录");
        }
    }
    @PostMapping("updatelost.do")
    @ResponseBody
    public ServerResponse<String> updateLost(HttpSession session,Lost lost){
        return lostService.update(lost);
    }
}
