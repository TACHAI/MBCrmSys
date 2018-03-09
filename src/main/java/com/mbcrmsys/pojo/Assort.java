package com.mbcrmsys.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Assort {
    private Integer assId;

    private Integer assCusId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date assDate;

    private String assPalce;

    private String assResume;

    private String assDetail;

    private String assMemo;

    public Integer getAssId() {
        return assId;
    }

    public void setAssId(Integer assId) {
        this.assId = assId;
    }

    public Integer getAssCusId() {
        return assCusId;
    }

    public void setAssCusId(Integer assCusId) {
        this.assCusId = assCusId;
    }

    public Date getAssDate() {
        return assDate;
    }

    public void setAssDate(Date assDate) {
        this.assDate = assDate;
    }

    public String getAssPalce() {
        return assPalce;
    }

    public void setAssPalce(String assPalce) {
        this.assPalce = assPalce == null ? null : assPalce.trim();
    }

    public String getAssResume() {
        return assResume;
    }

    public void setAssResume(String assResume) {
        this.assResume = assResume == null ? null : assResume.trim();
    }

    public String getAssDetail() {
        return assDetail;
    }

    public void setAssDetail(String assDetail) {
        this.assDetail = assDetail == null ? null : assDetail.trim();
    }

    public String getAssMemo() {
        return assMemo;
    }

    public void setAssMemo(String assMemo) {
        this.assMemo = assMemo == null ? null : assMemo.trim();
    }
}