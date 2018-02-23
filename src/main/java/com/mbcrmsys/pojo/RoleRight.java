package com.mbcrmsys.pojo;

public class RoleRight {
    private Integer rtId;

    private Integer rtRolId;

    private String rtRigCode;

    public Integer getRtId() {
        return rtId;
    }

    public void setRtId(Integer rtId) {
        this.rtId = rtId;
    }

    public Integer getRtRolId() {
        return rtRolId;
    }

    public void setRtRolId(Integer rtRolId) {
        this.rtRolId = rtRolId;
    }

    public String getRtRigCode() {
        return rtRigCode;
    }

    public void setRtRigCode(String rtRigCode) {
        this.rtRigCode = rtRigCode == null ? null : rtRigCode.trim();
    }
}