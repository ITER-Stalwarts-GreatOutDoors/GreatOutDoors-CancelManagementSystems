package com.cg.iter.greatoutdoorscms.service;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.iter.greatoutdoorscms.dto.CancelDTO;
import com.cg.iter.greatoutdoorscms.dto.OrderDTO;
import com.cg.iter.greatoutdoorscms.repository.CancelRepository;


@Service
public class CancelServiceImpl  implements CancelService{
	
	
	
	@Autowired
	RestTemplate rest;
	
	@Autowired
	CancelRepository cancelRepositoty;
    @Autowired
    
    private String orderProductURL = "http://add-to-cart-service/cart";

   
    
	@Override
	public String cancelOrder(OrderDTO order) {
		
		rest.postForObject(orderProductURL+"/cancelOrder", order, OrderDTO.class);
		
		long millis=System.currentTimeMillis();  
		
		Date currentDate = new java.util.Date(millis);  
		
		cancelRepositoty.save(new CancelDTO(order.getOrderId(), order.getUserId(), (java.sql.Date) currentDate));
		
		return "cancelled successfully!!";
	}

	@Override
	public String cancelProduct(String orderId, String userId, String productId, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

}
