package com.bootdo.system.domain;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * 销售单价表
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-15 11:22:32
 */
public class SalePriceDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //本位币价格
    private BigDecimal bwb = BigDecimal.ZERO;
    //客户名称
    private String khmc;
    //客户编码
    private String khbm;
    //价格政策名称
    private String jgzcmc;
    //物料编码
    private String wlbm;
    //物料名称
    private String wlmc;
    //规格型号
    private String ggxh;
    //原币价格
    private BigDecimal ybjg = BigDecimal.ZERO;
    //折扣方式
    private BigDecimal zkfs = BigDecimal.ZERO;
    //折扣
    private BigDecimal zk = BigDecimal.ZERO;
    //折后价格
    private BigDecimal zhjg = BigDecimal.ZERO;
    //计量单位
    private String jldw;
    //币别
    private String bb;
    //汇率
    private BigDecimal hl = BigDecimal.ZERO;
    //生效日期
    private String sxrq;
    //失效日期
    private String gqrq;

    //销售组织
    private String xszz;
    //备注
    private String remark;

    public BigDecimal getBwb() {
        return bwb;
    }

    public void setBwb(BigDecimal bwb) {
        this.bwb = bwb;
    }

    public String getKhmc() {
        return khmc;
    }

    public void setKhmc(String khmc) {
        this.khmc = khmc;
    }

    public String getWlbm() {
        return wlbm;
    }

    public void setWlbm(String wlbm) {
        this.wlbm = wlbm;
    }

    public String getWlmc() {
        return wlmc;
    }

    public void setWlmc(String wlmc) {
        this.wlmc = wlmc;
    }

    public String getGgxh() {
        return ggxh;
    }

    public void setGgxh(String ggxh) {
        this.ggxh = ggxh;
    }

    public BigDecimal getYbjg() {
        return ybjg;
    }

    public void setYbjg(BigDecimal ybjg) {
        this.ybjg = ybjg;
    }

    public BigDecimal getZkfs() {
        return zkfs;
    }

    public void setZkfs(BigDecimal zkfs) {
        this.zkfs = zkfs;
    }

    public BigDecimal getZk() {
        return zk;
    }

    public void setZk(BigDecimal zk) {
        this.zk = zk;
    }

    public BigDecimal getZhjg() {
        return zhjg;
    }

    public void setZhjg(BigDecimal zhjg) {
        this.zhjg = zhjg;
    }

    public String getJldw() {
        return jldw;
    }

    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    public BigDecimal getHl() {
        return hl;
    }

    public void setHl(BigDecimal hl) {
        this.hl = hl;
    }

    public String getSxrq() {
        return sxrq;
    }

    public void setSxrq(String sxrq) {
        this.sxrq = sxrq;
    }

    public String getGqrq() {
        return gqrq;
    }

    public void setGqrq(String gqrq) {
        this.gqrq = gqrq;
    }

    public String getXszz() {
        return xszz;
    }

    public void setXszz(String xszz) {
        this.xszz = xszz;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getJgzcmc() {
        return jgzcmc;
    }

    public void setJgzcmc(String jgzcmc) {
        this.jgzcmc = jgzcmc;
    }

    public String getKhbm() {
        return khbm;
    }

    public void setKhbm(String khbm) {
        this.khbm = khbm;
    }

    @Override
    public String toString() {
        return "SalePriceDO [bwb=" + bwb + ", khmc=" + khmc + ", khbm=" + khbm + ", jgzcmc=" + jgzcmc + ", wlbm=" + wlbm
                + ", wlmc=" + wlmc + ", ggxh=" + ggxh + ", ybjg=" + ybjg + ", zkfs=" + zkfs + ", zk=" + zk + ", zhjg="
                + zhjg + ", jldw=" + jldw + ", bb=" + bb + ", hl=" + hl + ", sxrq=" + sxrq + ", gqrq=" + gqrq
                + ", xszz=" + xszz + ", remark=" + remark + "]";
    }


}
