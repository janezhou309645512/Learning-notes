package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-18 14:08:22
 */
public class UserPermissionDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//标志符（权限自增id)
	private Integer id;
	//报表名称
	private String reportName;
	//组织ID
	private String organizationId;
	//姓名
	private String userName;
	//工号
	private String userNo;
	//查看
	private Boolean querry;
	//上传
	private Boolean upload;
	//导出
	private Boolean export;
	//管理员
	private String admin;
	//创建人
	private String creator;
	//创建时间
	private Date createTime;
	//修改人
	private String updator;
	//修改时间
	private Date updateTime;

	/**
	 * 设置：标志符（权限自增id)
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：标志符（权限自增id)
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：报表名称
	 */
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	/**
	 * 获取：报表名称
	 */
	public String getReportName() {
		return reportName;
	}
	/**
	 * 设置：组织ID
	 */
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	/**
	 * 获取：组织ID
	 */
	public String getOrganizationId() {
		return organizationId;
	}
	/**
	 * 设置：姓名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：姓名
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置：工号
	 */
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	/**
	 * 获取：工号
	 */
	public String getUserNo() {
		return userNo;
	}
	/**
	 * 设置：查看
	 */
	public void setQuerry(Boolean querry) {
		this.querry = querry;
	}
	/**
	 * 获取：查看
	 */
	public Boolean getQuerry() {
		return querry;
	}
	/**
	 * 设置：上传
	 */
	public void setUpload(Boolean upload) {
		this.upload = upload;
	}
	/**
	 * 获取：上传
	 */
	public Boolean getUpload() {
		return upload;
	}
	/**
	 * 设置：导出
	 */
	public void setExport(Boolean export) {
		this.export = export;
	}
	/**
	 * 获取：导出
	 */
	public Boolean getExport() {
		return export;
	}
	/**
	 * 设置：管理员
	 */
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	/**
	 * 获取：管理员
	 */
	public String getAdmin() {
		return admin;
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
