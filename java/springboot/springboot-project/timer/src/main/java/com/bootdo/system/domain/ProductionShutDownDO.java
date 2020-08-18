package com.bootdo.system.domain;

import java.io.Serializable;


/**
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-15 11:22:32
 */
public class ProductionShutDownDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //工单编号
    private String gdbh;
    //单据状态
    private String djzt;
    //关闭时间
    private String gbsj;
    //关闭人实名
    private String gbrsm;
    //主制部门
    private String zzbm;
    //业务日期
    private String ywrq;
    //组织
    private String zz;
    //物料编码
    private String wlbm;
    //计划数量
    private String jhsl;
    //计量单位
    private String jldw;
    //入库数量
    private String rksl;

    //区域
    private String area;
    //厂区
    private String siteArea;
    //分厂
    private String branch;

    public String getGdbh() {
        return gdbh;
    }

    public void setGdbh(String gdbh) {
        this.gdbh = gdbh;
    }

    public String getDjzt() {
        return djzt;
    }

    public void setDjzt(String djzt) {
        this.djzt = djzt;
    }

    public String getGbsj() {
        return gbsj;
    }

    public void setGbsj(String gbsj) {
        this.gbsj = gbsj;
    }

    public String getGbrsm() {
        return gbrsm;
    }

    public void setGbrsm(String gbrsm) {
        this.gbrsm = gbrsm;
    }

    public String getZzbm() {
        return zzbm;
    }

    public void setZzbm(String zzbm) {
        this.zzbm = zzbm;
    }

    public String getYwrq() {
        return ywrq;
    }

    public void setYwrq(String ywrq) {
        this.ywrq = ywrq;
    }

    public String getZz() {
        return zz;
    }

    public void setZz(String zz) {
        this.zz = zz;
    }

    public String getWlbm() {
        return wlbm;
    }

    public void setWlbm(String wlbm) {
        this.wlbm = wlbm;
    }

    public String getJhsl() {
        return jhsl;
    }

    public void setJhsl(String jhsl) {
        this.jhsl = jhsl;
    }

    public String getJldw() {
        return jldw;
    }

    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    public String getRksl() {
        return rksl;
    }

    public void setRksl(String rksl) {
        this.rksl = rksl;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSiteArea() {
        return siteArea;
    }

    public void setSiteArea(String siteArea) {
        this.siteArea = siteArea;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


}
