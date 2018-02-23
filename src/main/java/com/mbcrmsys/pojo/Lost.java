package com.mbcrmsys.pojo;

import java.util.Date;

public class Lost {
    private Integer losId;

    private String losCustomer;

    private String losManager;

    private Date losLastOrder;

    private String losRespite;

    private Date losDate;

    private String losReason;

    private Long losState;

    public Integer getLosId() {
        return losId;
    }

    public void setLosId(Integer losId) {
        this.losId = losId;
    }

    public String getLosCustomer() {
        return losCustomer;
    }

    public void setLosCustomer(String losCustomer) {
        this.losCustomer = losCustomer == null ? null : losCustomer.trim();
    }

    public String getLosManager() {
        return losManager;
    }

    public void setLosManager(String losManager) {
        this.losManager = losManager == null ? null : losManager.trim();
    }

    public Date getLosLastOrder() {
        return losLastOrder;
    }

    public void setLosLastOrder(Date losLastOrder) {
        this.losLastOrder = losLastOrder;
    }

    public String getLosRespite() {
        return losRespite;
    }

    public void setLosRespite(String losRespite) {
        this.losRespite = losRespite == null ? null : losRespite.trim();
    }

    public Date getLosDate() {
        return losDate;
    }

    public void setLosDate(Date losDate) {
        this.losDate = losDate;
    }

    public String getLosReason() {
        return losReason;
    }

    public void setLosReason(String losReason) {
        this.losReason = losReason == null ? null : losReason.trim();
    }

    public Long getLosState() {
        return losState;
    }

    public void setLosState(Long losState) {
        this.losState = losState;
    }
}