package com.mbcrmsys.pojo;

public class Consumer {
    private Integer conId;

    private Integer conRolId;

    private String conName;

    private String conPassword;

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public Integer getConRolId() {
        return conRolId;
    }

    public void setConRolId(Integer conRolId) {
        this.conRolId = conRolId;
    }

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName == null ? null : conName.trim();
    }

    public String getConPassword() {
        return conPassword;
    }

    public void setConPassword(String conPassword) {
        this.conPassword = conPassword == null ? null : conPassword.trim();
    }
}