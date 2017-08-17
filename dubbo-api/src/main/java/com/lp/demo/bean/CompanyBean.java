package com.lp.demo.bean;

import java.io.Serializable;

/**
 * Created by lvping on 2017/7/21.
 */
public class CompanyBean implements Serializable{
    private String name;
    private String adrr;
    private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdrr() {
        return adrr;
    }

    public void setAdrr(String adrr) {
        this.adrr = adrr;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
