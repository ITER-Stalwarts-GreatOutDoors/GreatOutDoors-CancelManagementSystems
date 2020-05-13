package com.cg.iter.greatoutdoorscms.dto;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="Cancel_table")
public class CancelDTO
{
	@Column(name="order_id")
	private String orderid;
	@Column(name="user_id")
	private String userId;
	@Column(name = "product_id")
	private String productid;
	
	@Id
	@Column(name = "product_uin")
	private String productuin;
	@Column(name="order_cancel_time")
	private Date ordercanceltime;
	
	
	@Column(name = "order_cancel_status", unique = false, length = 1)
	private int ordercancelstatus;
	
	public CancelDTO() {}
	
	
	public CancelDTO(String orderid, String userId, String productid, String productuin, Date ordercanceltime,
			int ordercancelstatus) {

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

	public Date getOrdercanceltime() {
		return ordercanceltime;
	}
	
	public void setOrdercanceltime(Date ordercanceltime) {
		this.ordercanceltime = ordercanceltime;
	}
}
	
	

