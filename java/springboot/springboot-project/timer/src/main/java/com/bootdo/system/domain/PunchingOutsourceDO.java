package com.bootdo.system.domain;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * 冲压委外外协加工中间表
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-15 11:22:32
 */
public class PunchingOutsourceDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //单位加工费
    private BigDecimal dwjgf = BigDecimal.ZERO;
    //组织
    private String zz;
    //业务日期
    private String ywrq;
    //外发料编码
    private String wflbm;
    //外协加工件编码,
    private String wxjgjbm;
    //外协加工件名称
    private String wxjgjmc;

    public BigDecimal getDwjgf() {
        return dwjgf;
    }

    public void setDwjgf(BigDecimal dwjgf) {
        this.dwjgf = dwjgf;
    }

    public String getYwrq() {
        return ywrq;
    }

    public void setYwrq(String ywrq) {
        this.ywrq = ywrq;
    }

    public String getWflbm() {
        return wflbm;
    }

    public void setWflbm(String wflbm) {
        this.wflbm = wflbm;
    }

    public String getWxjgjbm() {
        return wxjgjbm;
    }

    public void setWxjgjbm(String wxjgjbm) {
        this.wxjgjbm = wxjgjbm;
    }

    public String getWxjgjmc() {
        return wxjgjmc;
    }

    public void setWxjgjmc(String wxjgjmc) {
        this.wxjgjmc = wxjgjmc;
    }

    @Override
    public String toString() {
        return "PunchingOutsourceDO [dwjgf=" + dwjgf + ", zz=" + zz + ", ywrq=" + ywrq + ", wflbm=" + wflbm
                + ", wxjgjbm=" + wxjgjbm + ", wxjgjmc=" + wxjgjmc + "]";
    }

    public String getZz() {
        return zz;
    }

    public void setZz(String zz) {
        this.zz = zz;
    }


}
