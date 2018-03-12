package com.mbcrmsys.controller.common;

import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Area;
import com.mbcrmsys.pojo.Customer;
import com.mbcrmsys.pojo.CustomerRank;
import com.mbcrmsys.service.IAreaService;
import com.mbcrmsys.service.ICustomerRankSerivce;
import com.mbcrmsys.service.ICustomerService;
import com.mbcrmsys.vo.OpptionsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 组件
 * Created by @Author tachai
 * date 2018/3/12 21:20
 *
 * @Email 1206966083@qq.com
 */
@RestController
@RequestMapping("/Assembly/")
public class AssemblyController {
    @Autowired
    private  ICustomerRankSerivce customerRankSerivce;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IAreaService areaService;
    @RequestMapping("getcus.do")
    public ServerResponse<List<OpptionsVo>> getCus(HttpSession session){
        List<Customer> list=customerService.selectCus();
        List<OpptionsVo> opptionsVoList=list.stream()
                .map(e->e.getCusCkId())
                .collect(Collectors.toList());
        return null;
    }
    @RequestMapping("getrank.do")
    public ServerResponse<List<OpptionsVo>> getRank(HttpSession session){
        List<CustomerRank> list=customerRankSerivce.selectRank();
        List<OpptionsVo> opptionsVoList=list.stream()
                .map(e->e.getCkId())
                .map(e->e.ge)
                .collect(Collectors.toList());
        return null;
    }
    @RequestMapping("getarea")
    public ServerResponse<List<OpptionsVo>> getArea(HttpSession session){
        List<Area> list=areaService.selectArea();
        List<OpptionsVo> opptionsVoList=list.stream()
                .map(e->e.getAreId())
                .collect(Collectors.toList());
        return null;
    }
}
