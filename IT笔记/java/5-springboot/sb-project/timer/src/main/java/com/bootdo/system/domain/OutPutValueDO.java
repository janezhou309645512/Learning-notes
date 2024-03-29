package com.bootdo.system.domain;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * 产值表
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-15 11:22:32
 */
public class OutPutValueDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //库存组织
    private String storageName;
    //库存组织ID
    private String storageFid;
    //核心单据类型
    private String coreType;
    //核心单据ID
    private String coreTypeFid;
    //来源单据类型
    private String srcBillName;
    //来源单据编码
    private String srcnumber;
    //单据类型
    private String billname;
    //单据编码
    private String billfnumber;
    //成本中心
    private String costcenterName;
    //成本中心ID
    private String costcenterID;
    //业务日期
    private String bizdate;
    //状态
    private String status;
    //业务类型
    private String bizName;
    //事务类型
    private String tranName;
    //是否赠品
    private String ISPRESENT;
    //物料编码
    private String materialNumber;
    //物料名称
    private String materialname;
    //物料规格
    private String materialModel;
    //数量
    private String entryqty;
    //计量单位
    private String measurename;
    //-基本数量
    private String entrybaseqty;
    //基本计量单位
    private String basemeasurename;
    //部门
    private String depName;
    //仓库
    private String warename;
    //仓库id
    private String wareFid;
    //库位
    private String locaname;
    //建单人
    private String creatorName;
    //建单时间
    private String createTime;
    //审核人
    private String auditorName;
    //审核时间
    private String auditTime;
    //实际成本
    private String actualcost;
    //单位成本
    private String unitCost;
    //备注
    private String remark;

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public String getStorageFid() {
        return storageFid;
    }

    public void setStorageFid(String storageFid) {
        this.storageFid = storageFid;
    }

    public String getCoreType() {
        return coreType;
    }

    public void setCoreType(String coreType) {
        this.coreType = coreType;
    }

    public String getCoreTypeFid() {
        return coreTypeFid;
    }

    public void setCoreTypeFid(String coreTypeFid) {
        this.coreTypeFid = coreTypeFid;
    }

    public String getSrcBillName() {
        return srcBillName;
    }

    public void setSrcBillName(String srcBillName) {
        this.srcBillName = srcBillName;
    }

    public String getSrcnumber() {
        return srcnumber;
    }

    public void setSrcnumber(String srcnumber) {
        this.srcnumber = srcnumber;
    }

    public String getBillname() {
        return billname;
    }

    public void setBillname(String billname) {
        this.billname = billname;
    }

    public String getBillfnumber() {
        return billfnumber;
    }

    public void setBillfnumber(String billfnumber) {
        this.billfnumber = billfnumber;
    }

    public String getCostcenterName() {
        return costcenterName;
    }

    public void setCostcenterName(String costcenterName) {
        this.costcenterName = costcenterName;
    }

    public String getCostcenterID() {
        return costcenterID;
    }

    public void setCostcenterID(String costcenterID) {
        this.costcenterID = costcenterID;
    }

    public String getBizdate() {
        return bizdate;
    }

    public void setBizdate(String bizdate) {
        this.bizdate = bizdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public String getTranName() {
        return tranName;
    }

    public void setTranName(String tranName) {
        this.tranName = tranName;
    }

    public String getISPRESENT() {
        return ISPRESENT;
    }

    public void setISPRESENT(String iSPRESENT) {
        ISPRESENT = iSPRESENT;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname;
    }

    public String getMaterialModel() {
        return materialModel;
    }

    public void setMaterialModel(String materialModel) {
        this.materialModel = materialModel;
    }

    public String getEntryqty() {
        return entryqty;
    }

    public void setEntryqty(String entryqty) {
        this.entryqty = entryqty;
    }

    public String getMeasurename() {
        return measurename;
    }

    public void setMeasurename(String measurename) {
        this.measurename = measurename;
    }

    public String getEntrybaseqty() {
        return entrybaseqty;
    }

    public void setEntrybaseqty(String entrybaseqty) {
        this.entrybaseqty = entrybaseqty;
    }

    public String getBasemeasurename() {
        return basemeasurename;
    }

    public void setBasemeasurename(String basemeasurename) {
        this.basemeasurename = basemeasurename;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getWarename() {
        return warename;
    }

    public void setWarename(String warename) {
        this.warename = warename;
    }

    public String getWareFid() {
        return wareFid;
    }

    public void setWareFid(String wareFid) {
        this.wareFid = wareFid;
    }

    public String getLocaname() {
        return locaname;
    }

    public void setLocaname(String locaname) {
        this.locaname = locaname;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    public String getActualcost() {
        return actualcost;
    }

    public void setActualcost(String actualcost) {
        this.actualcost = actualcost;
    }

    public String getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(String unitCost) {
        this.unitCost = unitCost;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "OutPutValueDO [storageName=" + storageName + ", storageFid=" + storageFid + ", coreType=" + coreType
                + ", coreTypeFid=" + coreTypeFid + ", srcBillName=" + srcBillName + ", srcnumber=" + srcnumber
                + ", billname=" + billname + ", billfnumber=" + billfnumber + ", costcenterName=" + costcenterName
                + ", costcenterID=" + costcenterID + ", bizdate=" + bizdate + ", status=" + status + ", bizName="
                + bizName + ", tranName=" + tranName + ", ISPRESENT=" + ISPRESENT + ", materialNumber=" + materialNumber
                + ", materialname=" + materialname + ", materialModel=" + materialModel + ", entryqty=" + entryqty
                + ", measurename=" + measurename + ", entrybaseqty=" + entrybaseqty + ", basemeasurename="
                + basemeasurename + ", depName=" + depName + ", warename=" + warename + ", wareFid=" + wareFid
                + ", locaname=" + locaname + ", creatorName=" + creatorName + ", createTime=" + createTime
                + ", auditorName=" + auditorName + ", auditTime=" + auditTime + ", actualcost=" + actualcost
                + ", unitCost=" + unitCost + ", remark=" + remark + "]";
    }


}
