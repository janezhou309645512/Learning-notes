package com.bootdo.system.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 产值同步表
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-05-09 18:41:09
 */
public class OutputValueJobDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer id;
    //核心单据类型
    private String coreType;
    //物料编码
    private String materialNumber;
    //数量
    private BigDecimal entryqty = BigDecimal.ZERO;
    //产值
    private BigDecimal jg = BigDecimal.ZERO;
    //业务日期
    private Date bizdate;
    //库存组织
    private String storageName;
    //单价
    private BigDecimal je = BigDecimal.ZERO;
    //同步日期
    private Date synctime;
    //来源单据编码
    private String srcnumber;

    /**
     * 设置：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取：
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：核心单据类型
     */
    public void setCoreType(String coreType) {
        this.coreType = coreType;
    }

    /**
     * 获取：核心单据类型
     */
    public String getCoreType() {
        return coreType;
    }

    /**
     * 设置：物料编码
     */
    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    /**
     * 获取：物料编码
     */
    public String getMaterialNumber() {
        return materialNumber;
    }

    /**
     * 设置：数量
     */
    public void setEntryqty(BigDecimal entryqty) {
        this.entryqty = entryqty.setScale(4, BigDecimal.ROUND_HALF_DOWN);
    }

    /**
     * 获取：数量
     */
    public BigDecimal getEntryqty() {
        return entryqty;
    }

    /**
     * 设置：产值
     */
    public void setJg(BigDecimal jg) {
        this.jg = jg.setScale(4, BigDecimal.ROUND_HALF_DOWN);
    }

    /**
     * 获取：产值
     */
    public BigDecimal getJg() {
        return jg;
    }

    /**
     * 设置：业务日期
     */
    public void setBizdate(Date bizdate) {
        this.bizdate = bizdate;
    }

    /**
     * 获取：业务日期
     */
    public Date getBizdate() {
        return bizdate;
    }

    /**
     * 设置：库存组织
     */
    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    /**
     * 获取：库存组织
     */
    public String getStorageName() {
        return storageName;
    }

    /**
     * 设置：单价
     */
    public void setJe(BigDecimal je) {
        this.je = je.setScale(4, BigDecimal.ROUND_HALF_DOWN);
    }

    /**
     * 获取：单价
     */
    public BigDecimal getJe() {
        return je;
    }

    /**
     * 设置：同步日期
     */
    public void setSynctime(Date synctime) {
        this.synctime = synctime;
    }

    /**
     * 获取：同步日期
     */
    public Date getSynctime() {
        return synctime;
    }

    public String getSrcnumber() {
        return srcnumber;
    }

    public void setSrcnumber(String srcnumber) {
        this.srcnumber = srcnumber;
    }

}
