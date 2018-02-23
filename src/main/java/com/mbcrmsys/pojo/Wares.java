package com.mbcrmsys.pojo;

import java.math.BigDecimal;

public class Wares {
    private Integer warId;

    private String warName;

    private BigDecimal warPrice;

    private String warUnit;

    private String warType;

    private String warBatch;

    private String warMemo;

    public Integer getWarId() {
        return warId;
    }

    public void setWarId(Integer warId) {
        this.warId = warId;
    }

    public String getWarName() {
        return warName;
    }

    public void setWarName(String warName) {
        this.warName = warName == null ? null : warName.trim();
    }

    public BigDecimal getWarPrice() {
        return warPrice;
    }

    public void setWarPrice(BigDecimal warPrice) {
        this.warPrice = warPrice;
    }

    public String getWarUnit() {
        return warUnit;
    }

    public void setWarUnit(String warUnit) {
        this.warUnit = warUnit == null ? null : warUnit.trim();
    }

    public String getWarType() {
        return warType;
    }

    public void setWarType(String warType) {
        this.warType = warType == null ? null : warType.trim();
    }

    public String getWarBatch() {
        return warBatch;
    }

    public void setWarBatch(String warBatch) {
        this.warBatch = warBatch == null ? null : warBatch.trim();
    }

    public String getWarMemo() {
        return warMemo;
    }

    public void setWarMemo(String warMemo) {
        this.warMemo = warMemo == null ? null : warMemo.trim();
    }
}