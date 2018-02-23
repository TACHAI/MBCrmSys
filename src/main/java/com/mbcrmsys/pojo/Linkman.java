package com.mbcrmsys.pojo;

public class Linkman {
    private Integer linId;

    private Integer linCusId;

    private String linName;

    private String linSex;

    private String linTelephone;

    private String linPost;

    private String linMobile;

    private String linMemo;

    public Integer getLinId() {
        return linId;
    }

    public void setLinId(Integer linId) {
        this.linId = linId;
    }

    public Integer getLinCusId() {
        return linCusId;
    }

    public void setLinCusId(Integer linCusId) {
        this.linCusId = linCusId;
    }

    public String getLinName() {
        return linName;
    }

    public void setLinName(String linName) {
        this.linName = linName == null ? null : linName.trim();
    }

    public String getLinSex() {
        return linSex;
    }

    public void setLinSex(String linSex) {
        this.linSex = linSex == null ? null : linSex.trim();
    }

    public String getLinTelephone() {
        return linTelephone;
    }

    public void setLinTelephone(String linTelephone) {
        this.linTelephone = linTelephone == null ? null : linTelephone.trim();
    }

    public String getLinPost() {
        return linPost;
    }

    public void setLinPost(String linPost) {
        this.linPost = linPost == null ? null : linPost.trim();
    }

    public String getLinMobile() {
        return linMobile;
    }

    public void setLinMobile(String linMobile) {
        this.linMobile = linMobile == null ? null : linMobile.trim();
    }

    public String getLinMemo() {
        return linMemo;
    }

    public void setLinMemo(String linMemo) {
        this.linMemo = linMemo == null ? null : linMemo.trim();
    }
}