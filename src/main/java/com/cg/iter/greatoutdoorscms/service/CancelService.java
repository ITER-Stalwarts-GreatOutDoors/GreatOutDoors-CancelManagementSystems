package com.cg.iter.greatoutdoorscms.service;


import com.cg.iter.greatoutdoorscms.exception.CrudException;


public interface CancelService 
{
	
    /*
     * name-cancelOrder
     * description: Cancel a order that is placed
     */
	String cancelOrder(String orderId , String userId) throws   CrudException ;
	 /*
     * name-cancelProduct
     * description:cancel a product of particular order that is placed
     */
	String cancelProduct(String orderId, String userId, String productId, int quantity) throws Exception ;

}
