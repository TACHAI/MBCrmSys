package com.mbcrmsys.vo;

import com.mbcrmsys.pojo.Area;
import com.mbcrmsys.pojo.CustomerRank;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by @Author tachai
 * date 2018/3/6 20:59
 *
 * @Email 1206966083@qq.com
 */
@Data
public class CustomerVo {
    private Integer cusId;

    private Area area;

    private CustomerRank customerRank;

    private String cusName;

    private String cusNumber;

    private String cusAddress;

    private String cusChangeOrigin;

    private String cusChangeDescribe;

    private String cusSuccessProbability;

    private String cusManager;

    private String cusAllotName;

    private Date cusAllotDate;

    private String cusPostalCode;

    private String cusTelephone;

    private String cusFasimile;

    private String cusUrl;

    private String cusRegisterNumber;

    private String cusLegalPerson;

    private BigDecimal cusRegisterMoney;

    private BigDecimal cusRmb;

    private String cusOpeningBank;

    private String cusBankAccount;

    private String cusCrownRent;

    private String cusStateTaxes;

    private String cusResume;

    private Long cusCreditworthiness;

    private Long cusStatisfcing;

    private Long cusState;
}
