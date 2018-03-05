package com.mbcrmsys.controller;

import com.mbcrmsys.common.Const;
import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Consumer;
import com.mbcrmsys.pojo.SalChance;
import com.mbcrmsys.service.ISalChanceService;
import com.mbcrmsys.util.CheckLogin;
import com.mbcrmsys.util.DecoderSelectByCondition;
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
 * date 2018/2/26 15:59
 *
 * @Email 1206966083@qq.com
 */
@Controller
@RequestMapping("/saleopp/")
public class SalChanceController {
    @Autowired
    private ISalChanceService iSalChanceService;

    /**
     * 销售机会查询列表
     */
    @GetMapping("getall.do")
    @ResponseBody
    public ServerResponse<List<SalChance>> selectByCondition(String chc_cust_name, String chc_title, String chc_linkman, HttpSession session){
        //检查是否登录
        CheckLogin.check(session);
        //转码
        Map<String,String> map= DecoderSelectByCondition.decoder(chc_cust_name,chc_title,chc_linkman);
        ServerResponse<List<SalChance>> serverResponse=iSalChanceService.selectByCondition(map.get("param1"),map.get("param2"),map.get("param3"));
        return serverResponse;
    }

    /**
     * 根据id删除销售机会
     * @param session
     * @param id
     * @return
     */
    @PostMapping("deletebyid.do")
    @ResponseBody
    public ServerResponse<String> deleteById(HttpSession session,String id){
        CheckLogin.check(session);
        Long salId=Long.parseLong(id);
        return iSalChanceService.deleteById(salId);
    }
    @PostMapping("slectbyid.do")
    @ResponseBody
    public ServerResponse<SalChance> selectById(HttpSession session,String id){
        CheckLogin.check(session);
        Long salId=Long.parseLong(id);
        return iSalChanceService.selectById(salId);
    }

    /**
     * 保存
     * @param session
     * @param salChance
     * @return
     */
    @PostMapping("savesaleopp.do")
    @ResponseBody
    public ServerResponse<String> saveSaleOpp(SalChance salChance,HttpSession session){
        CheckLogin.check(session);
        System.out.println(salChance.getChcCreateName()+"controllerNAme");
        return iSalChanceService.saveSalChance(salChance);
    }

    /**
     * 编辑销售机会
     * @param session
     * @param salChance
     * @return
     */
    @PostMapping("updatesaleopp.do")
    @ResponseBody
    public  ServerResponse<String> update(HttpSession session,SalChance salChance){
        CheckLogin.check(session);
        if(salChance==null){
            return ServerResponse.createByErrorMessage("表单为空");
        }
        return iSalChanceService.updateSalChance(salChance);
    }

    /**
     * 指派人员
     * @param session
     * @param chcDueId
     * @param chcId
     * @return
     */
    @PostMapping("distributionSal.do")
    @ResponseBody
    public ServerResponse<String> assignSaleOpp(HttpSession session,String chcDueId,String chcId,String chcDueName){
        CheckLogin.check(session);
        if (chcDueId==null){
            return ServerResponse.createByErrorMessage("选择失败");
        }
        Integer dueId= Integer.parseInt(chcDueId);
        Long id=Long.valueOf(chcId);
        return  iSalChanceService.assignSaleOpp(dueId,id,chcDueName);
    }
}
