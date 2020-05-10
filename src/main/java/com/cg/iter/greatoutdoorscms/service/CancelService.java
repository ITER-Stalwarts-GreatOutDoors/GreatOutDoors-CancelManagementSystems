package com.cg.iter.greatoutdoorscms.service;

import com.cg.iter.greatoutdoorscms.dto.CancelDTO;

public interface CancelService 
{
	/*
	 * 
	 */
	String cancelOrder(CancelDTO cancel) ;
    /*
     * 
     */
	String cancelProduct(String orderId, String userId, String productId, int quantity) ;

}
