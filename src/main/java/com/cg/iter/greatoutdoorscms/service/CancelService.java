package com.cg.iter.greatoutdoorscms.service;


import com.cg.iter.greatoutdoorscms.dto.OrderDTO;

public interface CancelService 
{
	/*
	 * 
	 */
	String cancelOrder(OrderDTO order) ;
    /*
     * 
     */
	String cancelProduct(String orderId, String userId, String productId, int quantity) ;

}
