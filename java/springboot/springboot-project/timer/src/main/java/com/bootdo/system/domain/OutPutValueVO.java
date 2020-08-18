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
public class OutPutValueVO implements Serializable {
    private static final long serialVersionUID = 1L;

    //库存组织
    private String storageName;
    //来源单据编码
    private String srcnumber;
    //物料编码
    private String materialNumber;
    //数量
    private String entryqty;

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public String getSrcnumber() {
        return srcnumber;
    }

    public void setSrcnumber(String srcnumber) {
        this.srcnumber = srcnumber;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public String getEntryqty() {
        return entryqty;
    }

    public void setEntryqty(String entryqty) {
        this.entryqty = entryqty;
    }


}
