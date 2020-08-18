package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-10 13:46:38
 */
public class XcgdbhDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer id;
    //厂别
    private String cp;
    //工单编号
    private String gdbh;
    //地区
    private String area;
    //工单编号位数
    private Integer flag;

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
     * 设置：厂别
     */
    public void setCp(String cp) {
        this.cp = cp;
    }

    /**
     * 获取：厂别
     */
    public String getCp() {
        return cp;
    }

    /**
     * 设置：工单编号
     */
    public void setGdbh(String gdbh) {
        this.gdbh = gdbh;
    }

    /**
     * 获取：工单编号
     */
    public String getGdbh() {
        return gdbh;
    }

    /**
     * 设置：地区
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取：地区
     */
    public String getArea() {
        return area;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }


}
