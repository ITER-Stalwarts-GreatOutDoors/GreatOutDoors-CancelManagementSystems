package com.cg.iter.greatoutdoorscms.service;


import com.cg.iter.greatoutdoorscms.dto.OrderDTO;

public interface CancelService 
{
	/*
	 * 
	 */
	String cancelOrder(String orderId , String userId) ;
    /*
     * 
     */
	String cancelProduct(String orderId, String userId, String productId, int quantity) ;

}
