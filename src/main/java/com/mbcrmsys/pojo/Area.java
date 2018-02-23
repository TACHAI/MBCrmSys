package com.mbcrmsys.pojo;

public class Area {
    private Integer areId;

    private String areName;

    public Integer getAreId() {
        return areId;
    }

    public void setAreId(Integer areId) {
        this.areId = areId;
    }

    public String getAreName() {
        return areName;
    }

    public void setAreName(String areName) {
        this.areName = areName == null ? null : areName.trim();
    }
}