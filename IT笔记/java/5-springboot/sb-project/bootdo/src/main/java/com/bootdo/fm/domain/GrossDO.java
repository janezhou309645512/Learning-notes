package com.bootdo.fm.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2020-08-21 15:43:24
 */
public class GrossDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键标识
	private Integer id;
	//网站或者应用来源
	private String origin;
	//用户名
	private String username;
	//密码
	private String password;
	//状态
	private Boolean status;
	//备注
	private String remark;
	//创建时间
	private Date createTime;
	//创建人
	private String creator;
	//修改时间
	private Date modTime;
	//修改人
	private String modifier;

	/**
	 * 设置：主键标识
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：主键标识
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：网站或者应用来源
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * 获取：网站或者应用来源
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * 设置：用户名
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：用户名
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：状态
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}
	/**
	 * 获取：状态
	 */
	public Boolean getStatus() {
		return status;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreator() {
		return creator;
	}
	/**
	 * 设置：修改时间
	 */
	public void setModTime(Date modTime) {
		this.modTime = modTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getModTime() {
		return modTime;
	}
	/**
	 * 设置：修改人
	 */
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	/**
	 * 获取：修改人
	 */
	public String getModifier() {
		return modifier;
	}
}
