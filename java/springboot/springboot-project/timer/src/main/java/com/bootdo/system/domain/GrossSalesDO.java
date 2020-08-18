package com.bootdo.system.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 销售毛利表
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-15 11:22:32
 */
public class GrossSalesDO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    //组织
    private String zz;
    //公司编码
    private String gsbm;
    //应收单号
    private String ysdh;
    //应收行号
    private String ysdhh;
    //应收日期
    private String ysrq;
    //客户编码
    private String khbm;
    //客户名称
    private String khmc;
    //物料编码
    private String wlbm;
    //物料名称
    private String wlmc;
    //仓库编码
    private String ckbm;
    //仓库名称
    private String ckmc;
    //销售出库单号
    private String xsckdh;
    //销售出库单行号
    private String xsckdhh;
    //出库日期
    private String ckrq;
    //出库数量
    private String cksl;
    //出库单位
    private String ckdw;
    //出库基本数量
    private String ckjbsl;
    //出库基本单位
    private String ckjbdw;
    //币别
    private String bb;
    //税率
    private BigDecimal sl = BigDecimal.ZERO;
    //凭证号
    private String pzh;
    //单位实际成本
    private BigDecimal dwsjcb = BigDecimal.ZERO;
    //实际成本
    private BigDecimal sjcb = BigDecimal.ZERO;
    //应收金额
    private BigDecimal ysje = BigDecimal.ZERO;
    //应收金额本位币
    private BigDecimal ysjebwb = BigDecimal.ZERO;
    //发票数量
    private String fpsl;
    //发票计量单位
    private String fpjldw;
    //发票基本数量
    private String fpjbsl;
    //发票基本计量单位
    private String fpjbjldw;
    //发票成本
    private BigDecimal fpcb = BigDecimal.ZERO;
    //未开票数量
    private String wkpsl;
    //未开票的成本
    private String wkpcb;
    //毛利率
    private BigDecimal mll = BigDecimal.ZERO;
    //标识 0-正常 1-已删除
    private Integer flag;
    //同步时间
    private Date createdate;
    //单据日期
    private Date djrq;
    //制单人
    private String zdr;
    //单据类型
    private String djlx;
    //单据编码
    private String djbm;
    //业务类型
    private String ywlx;
    //发票号
    private String fph;
    //摘要
    private String zy;
    //金额
    private BigDecimal je = BigDecimal.ZERO;
    //主营/其他
    private String zyorqt;
    //物料记账分类
    private String wljzfl;
    //客户-关联关系
    private String khglgx;
    //客户（购买方）-简称（内部客户）
    private String gmf;

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
     * 设置：组织
     */
    public void setZz(String zz) {
        this.zz = zz;
    }

    /**
     * 获取：组织
     */
    public String getZz() {
        return zz;
    }

    /**
     * 设置：公司编码
     */
    public void setGsbm(String gsbm) {
        this.gsbm = gsbm;
    }

    /**
     * 获取：公司编码
     */
    public String getGsbm() {
        return gsbm;
    }

    /**
     * 设置：应收单号
     */
    public void setYsdh(String ysdh) {
        this.ysdh = ysdh;
    }

    /**
     * 获取：应收单号
     */
    public String getYsdh() {
        return ysdh;
    }

    /**
     * 设置：应收行号
     */
    public void setYsdhh(String ysdhh) {
        this.ysdhh = ysdhh;
    }

    /**
     * 获取：应收行号
     */
    public String getYsdhh() {
        return ysdhh;
    }

    /**
     * 设置：应收日期
     */
    public void setYsrq(String ysrq) {
        this.ysrq = ysrq;
    }

    /**
     * 获取：应收日期
     */
    public String getYsrq() {
        return ysrq;
    }

    /**
     * 设置：客户编码
     */
    public void setKhbm(String khbm) {
        this.khbm = khbm;
    }

    /**
     * 获取：客户编码
     */
    public String getKhbm() {
        return khbm;
    }

    /**
     * 设置：客户名称
     */
    public void setKhmc(String khmc) {
        this.khmc = khmc;
    }

    /**
     * 获取：客户名称
     */
    public String getKhmc() {
        return khmc;
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

    /**
     * 设置：仓库编码
     */
    public void setCkbm(String ckbm) {
        this.ckbm = ckbm;
    }

    /**
     * 获取：仓库编码
     */
    public String getCkbm() {
        return ckbm;
    }

    /**
     * 设置：仓库名称
     */
    public void setCkmc(String ckmc) {
        this.ckmc = ckmc;
    }

    /**
     * 获取：仓库名称
     */
    public String getCkmc() {
        return ckmc;
    }

    /**
     * 设置：销售出库单号
     */
    public void setXsckdh(String xsckdh) {
        this.xsckdh = xsckdh;
    }

    /**
     * 获取：销售出库单号
     */
    public String getXsckdh() {
        return xsckdh;
    }

    /**
     * 设置：销售出库单行号
     */
    public void setXsckdhh(String xsckdhh) {
        this.xsckdhh = xsckdhh;
    }

    /**
     * 获取：销售出库单行号
     */
    public String getXsckdhh() {
        return xsckdhh;
    }

    /**
     * 设置：出库日期
     */
    public void setCkrq(String ckrq) {
        this.ckrq = ckrq;
    }

    /**
     * 获取：出库日期
     */
    public String getCkrq() {
        return ckrq;
    }

    /**
     * 设置：出库数量
     */
    public void setCksl(String cksl) {
        this.cksl = cksl;
    }

    /**
     * 获取：出库数量
     */
    public String getCksl() {
        return cksl;
    }

    /**
     * 设置：出库单位
     */
    public void setCkdw(String ckdw) {
        this.ckdw = ckdw;
    }

    /**
     * 获取：出库单位
     */
    public String getCkdw() {
        return ckdw;
    }

    /**
     * 设置：出库基本数量
     */
    public void setCkjbsl(String ckjbsl) {
        this.ckjbsl = ckjbsl;
    }

    /**
     * 获取：出库基本数量
     */
    public String getCkjbsl() {
        return ckjbsl;
    }

    /**
     * 设置：出库基本单位
     */
    public void setCkjbdw(String ckjbdw) {
        this.ckjbdw = ckjbdw;
    }

    /**
     * 获取：出库基本单位
     */
    public String getCkjbdw() {
        return ckjbdw;
    }

    /**
     * 设置：币别
     */
    public void setBb(String bb) {
        this.bb = bb;
    }

    /**
     * 获取：币别
     */
    public String getBb() {
        return bb;
    }

    /**
     * 设置：凭证号
     */
    public void setPzh(String pzh) {
        this.pzh = pzh;
    }

    /**
     * 获取：凭证号
     */
    public String getPzh() {
        return pzh;
    }

    /**
     * 设置：发票数量
     */
    public void setFpsl(String fpsl) {
        this.fpsl = fpsl;
    }

    /**
     * 获取：发票数量
     */
    public String getFpsl() {
        return fpsl;
    }

    /**
     * 设置：发票计量单位
     */
    public void setFpjldw(String fpjldw) {
        this.fpjldw = fpjldw;
    }

    /**
     * 获取：发票计量单位
     */
    public String getFpjldw() {
        return fpjldw;
    }

    /**
     * 设置：发票基本数量
     */
    public void setFpjbsl(String fpjbsl) {
        this.fpjbsl = fpjbsl;
    }

    /**
     * 获取：发票基本数量
     */
    public String getFpjbsl() {
        return fpjbsl;
    }

    /**
     * 设置：发票基本计量单位
     */
    public void setFpjbjldw(String fpjbjldw) {
        this.fpjbjldw = fpjbjldw;
    }

    /**
     * 获取：发票基本计量单位
     */
    public String getFpjbjldw() {
        return fpjbjldw;
    }

    /**
     * 设置：未开票数量
     */
    public void setWkpsl(String wkpsl) {
        this.wkpsl = wkpsl;
    }

    /**
     * 获取：未开票数量
     */
    public String getWkpsl() {
        return wkpsl;
    }

    /**
     * 设置：未开票的成本
     */
    public void setWkpcb(String wkpcb) {
        this.wkpcb = wkpcb;
    }

    /**
     * 获取：未开票的成本
     */
    public String getWkpcb() {
        return wkpcb;
    }

    public BigDecimal getMll() {
        return mll;
    }

    public void setMll(BigDecimal mll) {
        this.mll = mll;
    }

    /**
     * 设置：标识 0-正常 1-已删除
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * 获取：标识 0-正常 1-已删除
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置：同步时间
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * 获取：同步时间
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * 设置：单据日期
     */
    public void setDjrq(Date djrq) {
        this.djrq = djrq;
    }

    /**
     * 获取：单据日期
     */
    public Date getDjrq() {
        return djrq;
    }

    /**
     * 设置：制单人
     */
    public void setZdr(String zdr) {
        this.zdr = zdr;
    }

    /**
     * 获取：制单人
     */
    public String getZdr() {
        return zdr;
    }

    /**
     * 设置：单据类型
     */
    public void setDjlx(String djlx) {
        this.djlx = djlx;
    }

    /**
     * 获取：单据类型
     */
    public String getDjlx() {
        return djlx;
    }

    /**
     * 设置：业务类型
     */
    public void setYwlx(String ywlx) {
        this.ywlx = ywlx;
    }

    /**
     * 获取：业务类型
     */
    public String getYwlx() {
        return ywlx;
    }

    /**
     * 设置：发票号
     */
    public void setFph(String fph) {
        this.fph = fph;
    }

    /**
     * 获取：发票号
     */
    public String getFph() {
        return fph;
    }

    /**
     * 设置：摘要
     */
    public void setZy(String zy) {
        this.zy = zy;
    }

    /**
     * 获取：摘要
     */
    public String getZy() {
        return zy;
    }

    /**
     * 设置：主营/其他
     */
    public void setZyorqt(String zyorqt) {
        this.zyorqt = zyorqt;
    }

    /**
     * 获取：主营/其他
     */
    public String getZyorqt() {
        return zyorqt;
    }

    /**
     * 设置：物料记账分类
     */
    public void setWljzfl(String wljzfl) {
        this.wljzfl = wljzfl;
    }

    /**
     * 获取：物料记账分类
     */
    public String getWljzfl() {
        return wljzfl;
    }

    /**
     * 设置：客户-关联关系
     */
    public void setKhglgx(String khglgx) {
        this.khglgx = khglgx;
    }

    /**
     * 获取：客户-关联关系
     */
    public String getKhglgx() {
        return khglgx;
    }

    /**
     * 设置：客户（购买方）-简称（内部客户）
     */
    public void setGmf(String gmf) {
        this.gmf = gmf;
    }

    /**
     * 获取：客户（购买方）-简称（内部客户）
     */
    public String getGmf() {
        return gmf;
    }

    public String getDjbm() {
        return djbm;
    }

    public void setDjbm(String djbm) {
        this.djbm = djbm;
    }

    public BigDecimal getSl() {
        return sl;
    }

    public void setSl(BigDecimal sl) {
        this.sl = sl.setScale(4, BigDecimal.ROUND_HALF_DOWN);
    }

    public BigDecimal getDwsjcb() {
        return dwsjcb;
    }

    public void setDwsjcb(BigDecimal dwsjcb) {
        this.dwsjcb = dwsjcb.setScale(4, BigDecimal.ROUND_HALF_DOWN);
    }

    public BigDecimal getSjcb() {
        return sjcb;
    }

    public void setSjcb(BigDecimal sjcb) {
        this.sjcb = sjcb.setScale(4, BigDecimal.ROUND_HALF_DOWN);
    }

    public BigDecimal getYsje() {
        return ysje;
    }

    public void setYsje(BigDecimal ysje) {
        this.ysje = ysje.setScale(4, BigDecimal.ROUND_HALF_DOWN);
    }

    public BigDecimal getYsjebwb() {
        return ysjebwb;
    }

    public void setYsjebwb(BigDecimal ysjebwb) {
        this.ysjebwb = ysjebwb.setScale(4, BigDecimal.ROUND_HALF_DOWN);
    }

    public BigDecimal getFpcb() {
        return fpcb;
    }

    public void setFpcb(BigDecimal fpcb) {
        this.fpcb = fpcb.setScale(4, BigDecimal.ROUND_HALF_DOWN);
    }

    public BigDecimal getJe() {
        return je;
    }

    public void setJe(BigDecimal je) {
        this.je = je.setScale(4, BigDecimal.ROUND_HALF_DOWN);
    }

    public String getWlmc() {
        return wlmc;
    }

    public void setWlmc(String wlmc) {
        this.wlmc = wlmc;
    }


}
