package com.bootdo.system.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 分切料数据表
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-15 11:22:32
 */
public class FmaterialJobDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //单据编号
    private String djbh;
    //物料编码
    private String materialNumber;
    //物料名称
    private String materialName;
    //计量单位
    private String measurename;
    //实际发料用量
    private BigDecimal sjflsl = BigDecimal.ZERO;
    //退料数量
    private BigDecimal tlsl = BigDecimal.ZERO;
    //实际完工日期
    private Date sjwgrq;
    //产品编号
    private String cpbh;
    //产品名称
    private String cpmc;
    //关闭日期
    private Date gbrq;
    //业务日期
    private Date bizdate;

    public String getDjbh() {
        return djbh;
    }

    public void setDjbh(String djbh) {
        this.djbh = djbh;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public BigDecimal getSjflsl() {
        return sjflsl;
    }

    public void setSjflsl(BigDecimal sjflsl) {
        this.sjflsl = sjflsl;
    }

    public BigDecimal getTlsl() {
        return tlsl;
    }

    public void setTlsl(BigDecimal tlsl) {
        this.tlsl = tlsl;
    }

    public Date getSjwgrq() {
        return sjwgrq;
    }

    public void setSjwgrq(Date sjwgrq) {
        this.sjwgrq = sjwgrq;
    }

    public String getCpbh() {
        return cpbh;
    }

    public void setCpbh(String cpbh) {
        this.cpbh = cpbh;
    }

    public String getCpmc() {
        return cpmc;
    }

    public void setCpmc(String cpmc) {
        this.cpmc = cpmc;
    }

    public Date getGbrq() {
        return gbrq;
    }

    public void setGbrq(Date gbrq) {
        this.gbrq = gbrq;
    }

    public Date getBizdate() {
        return bizdate;
    }

    public void setBizdate(Date bizdate) {
        this.bizdate = bizdate;
    }

    public String getMeasurename() {
        return measurename;
    }

    public void setMeasurename(String measurename) {
        this.measurename = measurename;
    }


}
