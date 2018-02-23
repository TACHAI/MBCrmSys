package com.mbcrmsys.pojo;

public class CustomerRank {
    private Integer ckId;

    private String ckName;

    public Integer getCkId() {
        return ckId;
    }

    public void setCkId(Integer ckId) {
        this.ckId = ckId;
    }

    public String getCkName() {
        return ckName;
    }

    public void setCkName(String ckName) {
        this.ckName = ckName == null ? null : ckName.trim();
    }
}