package com.mbcrmsys.pojo;

import java.util.Date;

public class Orders {
    private Integer ordId;

    private Integer ordCustId;

    private Date ordDate;

    private Long ordState;

    private String ordAddress;

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getOrdCustId() {
        return ordCustId;
    }

    public void setOrdCustId(Integer ordCustId) {
        this.ordCustId = ordCustId;
    }

    public Date getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(Date ordDate) {
        this.ordDate = ordDate;
    }

    public Long getOrdState() {
        return ordState;
    }

    public void setOrdState(Long ordState) {
        this.ordState = ordState;
    }

    public String getOrdAddress() {
        return ordAddress;
    }

    public void setOrdAddress(String ordAddress) {
        this.ordAddress = ordAddress == null ? null : ordAddress.trim();
    }
}