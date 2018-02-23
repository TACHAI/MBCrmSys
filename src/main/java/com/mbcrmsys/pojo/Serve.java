package com.mbcrmsys.pojo;

import java.util.Date;

public class Serve {
    private Long serId;

    private Integer serSeId;

    private Integer serCusId;

    private String serCreaterName;

    private Date serCreaterDate;

    private String serRequest;

    private String serAllotName;

    private Date serAllotDate;

    private String serHandle;

    private String serHandleName;

    private String serResult;

    private Integer serSatisfcing;

    private String serResume;

    private Integer serState;

    private Long serCreaterId;

    private Long serAllotId;

    private Long serHandleId;

    private Date serHandleDate;

    public Long getSerId() {
        return serId;
    }

    public void setSerId(Long serId) {
        this.serId = serId;
    }

    public Integer getSerSeId() {
        return serSeId;
    }

    public void setSerSeId(Integer serSeId) {
        this.serSeId = serSeId;
    }

    public Integer getSerCusId() {
        return serCusId;
    }

    public void setSerCusId(Integer serCusId) {
        this.serCusId = serCusId;
    }

    public String getSerCreaterName() {
        return serCreaterName;
    }

    public void setSerCreaterName(String serCreaterName) {
        this.serCreaterName = serCreaterName == null ? null : serCreaterName.trim();
    }

    public Date getSerCreaterDate() {
        return serCreaterDate;
    }

    public void setSerCreaterDate(Date serCreaterDate) {
        this.serCreaterDate = serCreaterDate;
    }

    public String getSerRequest() {
        return serRequest;
    }

    public void setSerRequest(String serRequest) {
        this.serRequest = serRequest == null ? null : serRequest.trim();
    }

    public String getSerAllotName() {
        return serAllotName;
    }

    public void setSerAllotName(String serAllotName) {
        this.serAllotName = serAllotName == null ? null : serAllotName.trim();
    }

    public Date getSerAllotDate() {
        return serAllotDate;
    }

    public void setSerAllotDate(Date serAllotDate) {
        this.serAllotDate = serAllotDate;
    }

    public String getSerHandle() {
        return serHandle;
    }

    public void setSerHandle(String serHandle) {
        this.serHandle = serHandle == null ? null : serHandle.trim();
    }

    public String getSerHandleName() {
        return serHandleName;
    }

    public void setSerHandleName(String serHandleName) {
        this.serHandleName = serHandleName == null ? null : serHandleName.trim();
    }

    public String getSerResult() {
        return serResult;
    }

    public void setSerResult(String serResult) {
        this.serResult = serResult == null ? null : serResult.trim();
    }

    public Integer getSerSatisfcing() {
        return serSatisfcing;
    }

    public void setSerSatisfcing(Integer serSatisfcing) {
        this.serSatisfcing = serSatisfcing;
    }

    public String getSerResume() {
        return serResume;
    }

    public void setSerResume(String serResume) {
        this.serResume = serResume == null ? null : serResume.trim();
    }

    public Integer getSerState() {
        return serState;
    }

    public void setSerState(Integer serState) {
        this.serState = serState;
    }

    public Long getSerCreaterId() {
        return serCreaterId;
    }

    public void setSerCreaterId(Long serCreaterId) {
        this.serCreaterId = serCreaterId;
    }

    public Long getSerAllotId() {
        return serAllotId;
    }

    public void setSerAllotId(Long serAllotId) {
        this.serAllotId = serAllotId;
    }

    public Long getSerHandleId() {
        return serHandleId;
    }

    public void setSerHandleId(Long serHandleId) {
        this.serHandleId = serHandleId;
    }

    public Date getSerHandleDate() {
        return serHandleDate;
    }

    public void setSerHandleDate(Date serHandleDate) {
        this.serHandleDate = serHandleDate;
    }
}