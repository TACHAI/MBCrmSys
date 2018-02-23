package com.mbcrmsys.pojo;

public class Role {
    private Integer rolId;

    private String rolName;

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName == null ? null : rolName.trim();
    }
}