package com.mbcrmsys.pojo;

public class Stock {
    private Integer stoId;

    private Integer stoWarId;

    private Integer stoCount;

    private String stoDepot;

    private String stoStand;

    private String stoMemo;

    public Integer getStoId() {
        return stoId;
    }

    public void setStoId(Integer stoId) {
        this.stoId = stoId;
    }

    public Integer getStoWarId() {
        return stoWarId;
    }

    public void setStoWarId(Integer stoWarId) {
        this.stoWarId = stoWarId;
    }

    public Integer getStoCount() {
        return stoCount;
    }

    public void setStoCount(Integer stoCount) {
        this.stoCount = stoCount;
    }

    public String getStoDepot() {
        return stoDepot;
    }

    public void setStoDepot(String stoDepot) {
        this.stoDepot = stoDepot == null ? null : stoDepot.trim();
    }

    public String getStoStand() {
        return stoStand;
    }

    public void setStoStand(String stoStand) {
        this.stoStand = stoStand == null ? null : stoStand.trim();
    }

    public String getStoMemo() {
        return stoMemo;
    }

    public void setStoMemo(String stoMemo) {
        this.stoMemo = stoMemo == null ? null : stoMemo.trim();
    }
}