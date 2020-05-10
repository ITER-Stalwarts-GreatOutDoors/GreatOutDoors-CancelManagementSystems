package com.cg.iter.greatoutdoorscms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.greatoutdoorscms.dto.CancelDTO;
import com.cg.iter.greatoutdoorscms.dto.OrderDTO;
import com.cg.iter.greatoutdoorscms.dto.OrderProductMapDTO;
import com.cg.iter.greatoutdoorscms.exception.OrderNotFoundException;
import com.cg.iter.greatoutdoorscms.repository.CancelRepository;
import com.cg.iter.greatoutdoorscms.repository.OrderRepository;

@Service
public class CancelServiceImpl  implements CancelService{
	
	@Autowired
	CancelRepository cancelRepositoty;
    @Autowired
	OrderRepository orderRepository;
   
    
	@Override
	public String cancelOrder(CancelDTO cancel) {
		@SuppressWarnings("unused")
		OrderDTO order = null;
		@SuppressWarnings("unused")
		OrderProductMapDTO opm = null;
		List<OrderProductMapDTO> list = null;
		String statusOrderCancel = null;
		System.out.println("Cancelling of order is being processed");
		return statusOrderCancel;
		else if (OrderRepository.findby() == null) {
			throw new OrderNotFoundException("No such order id exists");

	}

	@Override
	public String cancelProduct(String orderId, String userId, String productId, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

}
