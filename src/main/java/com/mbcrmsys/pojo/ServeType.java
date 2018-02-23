package com.mbcrmsys.pojo;

public class ServeType {
    private Integer seId;

    private String seName;

    public Integer getSeId() {
        return seId;
    }

    public void setSeId(Integer seId) {
        this.seId = seId;
    }

    public String getSeName() {
        return seName;
    }

    public void setSeName(String seName) {
        this.seName = seName == null ? null : seName.trim();
    }
}