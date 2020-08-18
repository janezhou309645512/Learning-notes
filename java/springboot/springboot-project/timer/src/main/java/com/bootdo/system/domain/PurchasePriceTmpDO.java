package com.bootdo.system.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 采购单价表
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-15 11:22:32
 */
public class PurchasePriceTmpDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //单据编号
    private String fdjbh;
    //物料编码
    private String fmaterialNumber;
    //供应商
    private String suppliername;
    //编码1
    private String fbm1;
    //编码2
    private String fbm2;
    //编码3
    private String fbm3;
    //物料名称
    private String fmaterialName;
    //实际发料用量
    private BigDecimal fsjflsl = BigDecimal.ZERO;
    //退料数量
    private BigDecimal ftlsl = BigDecimal.ZERO;
    //实际完工日期
    private Date fsjwgrq;
    //产品编号
    private String fcpbh;
    //产品名称
    private String fcpmc;
    //仓库
    private String fwarename;
    //关闭日期
    private Date fgbrq;
    //业务日期
    private Date fbizdate;
    //不良品入库
    private BigDecimal fblprk = BigDecimal.ZERO;
    //入库数量
    private BigDecimal frksl = BigDecimal.ZERO;
    //业务日期
    private String bizdate;
    //物料编码
    private String materialNumber;
    //数量
    private BigDecimal entryqty = BigDecimal.ZERO;
    //计量单位
    private String measurename;
    //基本计量单位
    private String basemeasurename;
    //单位采购成本
    private BigDecimal fUnitPurchaseCost = BigDecimal.ZERO;
    //采购成本
    private BigDecimal purchaseCost = BigDecimal.ZERO;
    //币别
    private String bb;
    //编码1
    private String bm1;
    //编码2
    private String bm2;
    //仓库
    private String warename;
    //销售组织
    private String purchaseName;
    //主制部门
    private String department;
    //是否保税
    private String sfbs;
    //备注
    private String remark;

    //编码3
    private String bm3;
    //单价不含关税
    private BigDecimal priceTwo = BigDecimal.ZERO;
    //关税率
    private BigDecimal gsl = BigDecimal.ZERO;

    public String getFdjbh() {
        return fdjbh;
    }

    public void setFdjbh(String fdjbh) {
        this.fdjbh = fdjbh;
    }

    public String getFmaterialNumber() {
        return fmaterialNumber;
    }

    public void setFmaterialNumber(String fmaterialNumber) {
        this.fmaterialNumber = fmaterialNumber;
    }

    public String getFmaterialName() {
        return fmaterialName;
    }

    public void setFmaterialName(String fmaterialName) {
        this.fmaterialName = fmaterialName;
    }

    public BigDecimal getFsjflsl() {
        return fsjflsl;
    }

    public void setFsjflsl(BigDecimal fsjflsl) {
        this.fsjflsl = fsjflsl;
    }

    public BigDecimal getFtlsl() {
        return ftlsl;
    }

    public void setFtlsl(BigDecimal ftlsl) {
        this.ftlsl = ftlsl;
    }

    public Date getFsjwgrq() {
        return fsjwgrq;
    }

    public void setFsjwgrq(Date fsjwgrq) {
        this.fsjwgrq = fsjwgrq;
    }

    public String getFcpbh() {
        return fcpbh;
    }

    public void setFcpbh(String fcpbh) {
        this.fcpbh = fcpbh;
    }

    public String getFcpmc() {
        return fcpmc;
    }

    public void setFcpmc(String fcpmc) {
        this.fcpmc = fcpmc;
    }

    public Date getFgbrq() {
        return fgbrq;
    }

    public void setFgbrq(Date fgbrq) {
        this.fgbrq = fgbrq;
    }

    public Date getFbizdate() {
        return fbizdate;
    }

    public void setFbizdate(Date fbizdate) {
        this.fbizdate = fbizdate;
    }

    public String getBizdate() {
        return bizdate;
    }

    public void setBizdate(String bizdate) {
        this.bizdate = bizdate;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public BigDecimal getEntryqty() {
        return entryqty;
    }

    public void setEntryqty(BigDecimal entryqty) {
        this.entryqty = entryqty;
    }

    public String getMeasurename() {
        return measurename;
    }

    public void setMeasurename(String measurename) {
        this.measurename = measurename;
    }

    public BigDecimal getfUnitPurchaseCost() {
        return fUnitPurchaseCost;
    }

    public void setfUnitPurchaseCost(BigDecimal fUnitPurchaseCost) {
        this.fUnitPurchaseCost = fUnitPurchaseCost;
    }

    public BigDecimal getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(BigDecimal purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    public String getBm1() {
        return bm1;
    }

    public void setBm1(String bm1) {
        this.bm1 = bm1;
    }

    public String getBm2() {
        return bm2;
    }

    public void setBm2(String bm2) {
        this.bm2 = bm2;
    }

    public String getWarename() {
        return warename;
    }

    public void setWarename(String warename) {
        this.warename = warename;
    }

    public String getBm3() {
        return bm3;
    }

    public void setBm3(String bm3) {
        this.bm3 = bm3;
    }

    public BigDecimal getPriceTwo() {
        return priceTwo;
    }

    public void setPriceTwo(BigDecimal priceTwo) {
        this.priceTwo = priceTwo;
    }

    public BigDecimal getGsl() {
        return gsl;
    }

    public void setGsl(BigDecimal gsl) {
        this.gsl = gsl;
    }

    public String getFbm1() {
        return fbm1;
    }

    public void setFbm1(String fbm1) {
        this.fbm1 = fbm1;
    }

    public String getFbm2() {
        return fbm2;
    }

    public void setFbm2(String fbm2) {
        this.fbm2 = fbm2;
    }

    public String getFbm3() {
        return fbm3;
    }

    public void setFbm3(String fbm3) {
        this.fbm3 = fbm3;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getBasemeasurename() {
        return basemeasurename;
    }

    public void setBasemeasurename(String basemeasurename) {
        this.basemeasurename = basemeasurename;
    }

    public BigDecimal getFblprk() {
        return fblprk;
    }

    public void setFblprk(BigDecimal fblprk) {
        this.fblprk = fblprk;
    }

    public BigDecimal getFrksl() {
        return frksl;
    }

    public void setFrksl(BigDecimal frksl) {
        this.frksl = frksl;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    public String getFwarename() {
        return fwarename;
    }

    public void setFwarename(String fwarename) {
        this.fwarename = fwarename;
    }

    public String getSfbs() {
        return sfbs;
    }

    public void setSfbs(String sfbs) {
        this.sfbs = sfbs;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
