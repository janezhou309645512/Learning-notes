package com.bootdo.system.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-29 10:52:57
 */
public class MaterialTariffDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer id;
    //物料编码
    private String wlbm;
    //关税率
    private BigDecimal tariff = BigDecimal.ZERO;
    //添加日期
    private Date createtime;
    //创建人
    private String createusername;

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
     * 设置：物料编码
     */
    public void setWlbm(String wlbm) {
        this.wlbm = wlbm;
    }

    /**
     * 获取：物料编码
     */
    public String getWlbm() {
        return wlbm;
    }


    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff.setScale(2, BigDecimal.ROUND_HALF_DOWN);
    }

    /**
     * 设置：添加日期
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取：添加日期
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置：创建人
     */
    public void setCreateusername(String createusername) {
        this.createusername = createusername;
    }

    /**
     * 获取：创建人
     */
    public String getCreateusername() {
        return createusername;
    }
}
