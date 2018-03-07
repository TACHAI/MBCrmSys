package com.mbcrmsys.pojo;

import java.util.Date;

public class Orders {
    private Integer ordId;

    private Integer ordCusId;

    private Date ordDate;

    private Long ordState;

    private String ordAddress;

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getOrdCusId() {
        return ordCusId;
    }

    public void setOrdCusId(Integer ordCusId) {
        this.ordCusId = ordCusId;
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