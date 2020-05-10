package com.cg.iter.greatoutdoorscms.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="Cancel_table")
public class CancelDTO
{
	@Id
	private String orderid;
	private String userId;
	private String productid;
	private String productuin;
	private Date ordercanceltime;
	private int ordercancelstatus;
	public CancelDTO() {}
	public CancelDTO(String orderid, String userId, String productid, String productuin, Date ordercanceltime,
			int ordercancelstatus) {
		super();
		this.orderid = orderid;
		this.userId = userId;
		this.productid = productid;
		this.productuin = productuin;
		this.ordercanceltime = ordercanceltime;
		this.ordercancelstatus = ordercancelstatus;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductuin() {
		return productuin;
	}
	public void setProductuin(String productuin) {
		this.productuin = productuin;
	}
	public Date getOrdercanceltime() {
		return ordercanceltime;
	}
	public void setOrdercanceltime(Date ordercanceltime) {
		this.ordercanceltime = ordercanceltime;
	}
	public int getOrdercancelstatus() {
		return ordercancelstatus;
	}
	public void setOrdercancelstatus(int ordercancelstatus) {
		this.ordercancelstatus = ordercancelstatus;
	}
	
	
}
