package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-18 14:08:13
 */
public class OrganizationDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//标识符
	private Integer id;
	//组织唯一码
		private String organizationNumber;
		//组织名称
		private String organizationName;
	//模块名称
	private String moduleName;
	

	//创建人
	private String creator;
	//创建时间
	private Date createTime;
	//修改人
	private String updator;
	//修改时间
	private Date updateTime;

	/**
	 * 设置：标识符
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：标识符
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：模块名称
	 */
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	/**
	 * 获取：模块名称
	 */
	public String getModuleName() {
		return moduleName;
	}
	/**
	 * 设置：组织名称
	 */
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	/**
	 * 获取：组织名称
	 */
	public String getOrganizationName() {
		return organizationName;
	}
	/**
	 * 设置：组织唯一码
	 */
	public void setOrganizationNumber(String organizationNumber) {
		this.organizationNumber = organizationNumber;
	}
	/**
	 * 获取：组织唯一码
	 */
	public String getOrganizationNumber() {
		return organizationNumber;
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
	 * 设置：修改人
	 */
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	/**
	 * 获取：修改人
	 */
	public String getUpdator() {
		return updator;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
}
