package com.mbcrmsys.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by @Author tachai
 * date 2018/3/14 20:57
 *
 * @Email 1206966083@qq.com
 */
@Data
public class SimServe {
    private Long serId;
    private String serAllotName;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date serAllotDate;
    private Integer serState;
}
