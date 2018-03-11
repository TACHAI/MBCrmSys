package com.mbcrmsys.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 销售机会页面分配人的VO
 * Created by @Author tachai
 * date 2018/3/9 17:20
 *
 * @Email 1206966083@qq.com
 */
@Data
public class SimSaleOpportunity {
    private Long chcId;
    private String chcDueName;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date chcDueDate;
}
