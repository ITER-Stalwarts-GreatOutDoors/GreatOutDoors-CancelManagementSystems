package com.cg.iter.greatoutdoorscms.beans;

import java.util.List;

import com.cg.iter.greatoutdoorscms.dto.OrderProductMapDTO;



public class Orders {

	private List<OrderProductMapDTO> orders;
  
	
	//Constructors
	public Orders() {}

	public Orders(List<OrderProductMapDTO> orders) {
		super();
		this.orders = orders;
	}

	//getter & Setter method
	public List<OrderProductMapDTO> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderProductMapDTO> orders) {
		this.orders = orders;
	}
	
}
