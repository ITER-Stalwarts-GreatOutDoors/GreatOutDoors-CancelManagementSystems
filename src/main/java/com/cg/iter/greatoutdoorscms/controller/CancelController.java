package com.cg.iter.greatoutdoorscms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.greatoutdoorscms.dto.CancelDTO;
import com.cg.iter.greatoutdoorscms.dto.OrderDTO;
import com.cg.iter.greatoutdoorscms.service.CancelService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Cancel")
public class CancelController 
{
	@Autowired
	private CancelService cancelService;
	
	@PostMapping("/cancelOrder")
	public String cancelOrder(@RequestParam String orderId , @RequestParam String userId) throws Exception {
		return cancelService.cancelOrder(orderId,userId);
	}

	
	@PostMapping("/Cancel-product")
	String cancelProduct(String orderId, String userId, String productId, int quantity)
	{
		return productId;
		
	}
   
}
