package com.edwin.fsg.model;

import java.io.Serializable;
import java.util.Date;

public class MLog implements Serializable{
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 日志id*/
	private Long id;
	/** 创建人*/
	private String createName;
	/** 日志时间*/
	private Date createTime;
	/** 日志内容*/
	private String remark;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCreateName() {
		return createName;
	}
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public MLog() {}
	
	public MLog(Date createTime,String createName,String remark) {
		this.createTime =createTime;
		this.createName=createName;
		this.remark=remark;
	}
	@Override
	public String toString() {
		return "MLog [id=" + id + ", createName=" + createName + ", createTime=" + createTime + ", remark=" + remark
				+ "]";
	}
}
