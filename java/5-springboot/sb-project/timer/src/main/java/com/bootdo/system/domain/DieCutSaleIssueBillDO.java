package com.bootdo.system.domain;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * 模切销售出库流水表
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-15 11:22:32
 */
public class DieCutSaleIssueBillDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //成本报价
    private BigDecimal costQuotation = BigDecimal.ZERO;
    //组织
    private String organizationName;
    //业务日期
    private String bizDate;
    //物料编码
    private String materialNumber;
    //物料名称
    private String materialName;
    //币别
    private String currency;
    //汇率
    private BigDecimal exchangeRate = BigDecimal.ZERO;

    public BigDecimal getCostQuotation() {
        return costQuotation;
    }

    public void setCostQuotation(BigDecimal costQuotation) {
        this.costQuotation = costQuotation;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getBizDate() {
        return bizDate;
    }

    public void setBizDate(String bizDate) {
        this.bizDate = bizDate;
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


}
