package com.mbcrmsys.pojo;

import java.math.BigDecimal;

public class OrdersDetail {
    private Integer olId;

    private Integer olOrdId;

    private Integer olWarId;

    private BigDecimal olPrice;

    private Long olCount;

    private byte[] olUnit;

    public Integer getOlId() {
        return olId;
    }

    public void setOlId(Integer olId) {
        this.olId = olId;
    }

    public Integer getOlOrdId() {
        return olOrdId;
    }

    public void setOlOrdId(Integer olOrdId) {
        this.olOrdId = olOrdId;
    }

    public Integer getOlWarId() {
        return olWarId;
    }

    public void setOlWarId(Integer olWarId) {
        this.olWarId = olWarId;
    }

    public BigDecimal getOlPrice() {
        return olPrice;
    }

    public void setOlPrice(BigDecimal olPrice) {
        this.olPrice = olPrice;
    }

    public Long getOlCount() {
        return olCount;
    }

    public void setOlCount(Long olCount) {
        this.olCount = olCount;
    }

    public byte[] getOlUnit() {
        return olUnit;
    }

    public void setOlUnit(byte[] olUnit) {
        this.olUnit = olUnit;
    }
}