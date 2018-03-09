package com.mbcrmsys.controller;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Assort;
import com.mbcrmsys.service.IAssortService;
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
@RequestMapping("/assort/")
public class AssortController {
    @Autowired
    private IAssortService assortService;

    @GetMapping("selectlist.do")
    @ResponseBody
    public ServerResponse<List<Assort>> sellectList(HttpSession session,String cusId){
        if(!StringUtils.isBlank(cusId)){
            Integer id=Integer.valueOf(cusId);
            return assortService.selectList(id);
        }else {
            return ServerResponse.createByErrorMessage("输入的值为空");
        }
    }

    @PostMapping("selectbyid.do")
    @ResponseBody
    public ServerResponse<Assort> selectById(HttpSession session,String assId){
        if(!StringUtils.isBlank(assId)){
            Integer id=Integer.valueOf(assId);
            return assortService.selectById(id);
        }else {
            return ServerResponse.createByErrorMessage("输入的值为空");
        }
    }

    @PostMapping("updateassort.do")
    @ResponseBody
    public ServerResponse<String> updateAssort(HttpSession session,Assort assort){
        return assortService.updateAssort(assort);
    }

    @PostMapping("addassort.do")
    @ResponseBody
    public ServerResponse<String> addAssort(HttpSession session,Assort assort){
        return assortService.insertAssort(assort);
    }

    @PostMapping("deletebyid.do")
    @ResponseBody
    public ServerResponse<String> deleteById(HttpSession session,String assId){
        if(!StringUtils.isBlank(assId)){
            Integer id=Integer.valueOf(assId);
            return assortService.deleteById(id);
        }else {
            return ServerResponse.createByErrorMessage("assId:"+assId);
        }
    }
}
