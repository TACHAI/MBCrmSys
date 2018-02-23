package com.mbcrmsys.pojo;

import java.util.Date;

public class Plan {
    private Integer plaId;

    private Integer plaChcId;

    private String plaPlan;

    private Date plaDate;

    private String plaResult;

    public Integer getPlaId() {
        return plaId;
    }

    public void setPlaId(Integer plaId) {
        this.plaId = plaId;
    }

    public Integer getPlaChcId() {
        return plaChcId;
    }

    public void setPlaChcId(Integer plaChcId) {
        this.plaChcId = plaChcId;
    }

    public String getPlaPlan() {
        return plaPlan;
    }

    public void setPlaPlan(String plaPlan) {
        this.plaPlan = plaPlan == null ? null : plaPlan.trim();
    }

    public Date getPlaDate() {
        return plaDate;
    }

    public void setPlaDate(Date plaDate) {
        this.plaDate = plaDate;
    }

    public String getPlaResult() {
        return plaResult;
    }

    public void setPlaResult(String plaResult) {
        this.plaResult = plaResult == null ? null : plaResult.trim();
    }
}