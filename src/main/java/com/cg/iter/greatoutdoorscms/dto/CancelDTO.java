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
	private Date ordercanceltime;
	public CancelDTO() {}
	public CancelDTO(String orderid, String userId ,Date ordercanceltime) {
		super();
		this.orderid = orderid;
		this.userId = userId;
		this.ordercanceltime = ordercanceltime;
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

	public Date getOrdercanceltime() {
		return ordercanceltime;
	}
	public void setOrdercanceltime(Date ordercanceltime) {
		this.ordercanceltime = ordercanceltime;
	}
}
	
	

