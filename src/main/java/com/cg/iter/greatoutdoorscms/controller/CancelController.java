package com.cg.iter.greatoutdoorscms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.greatoutdoorscms.dto.CancelDTO;
import com.cg.iter.greatoutdoorscms.service.CancelService;

@RestController
@RequestMapping("/Cancel")
public class CancelController 
{
	@Autowired
  private CancelService cancelService;
	

	    @ResponseBody
		@RequestMapping(value = "/cancelOrder", method = RequestMethod.POST)
		@CrossOrigin(origins = "*")

		public String cancelOrder(@RequestBody Map<String, Object> model) throws Exception {
			String result = null;
			String userID = model.get("userId").toString();
			String orderID = model.get("orderId").toString();
			try {
				String message = CancelService.cancelOrder(CancelDTO cancel);
				
				cancelOrderObj.addProperty("Success", message);
				cancelOrderList.add(cancelOrderObj);

				result = cancelOrderList.toString();
			} catch (Exception e) {
				JsonArray cancelOrderList = new JsonArray();
				JsonObject cancelOrderObj = new JsonObject();
				cancelOrderObj.addProperty("Error :", e.getMessage());
				cancelOrderList.add(cancelOrderObj);

				result = cancelOrderList.toString();
			}
			return result;
		}
	}
	
	@PostMapping("/Cancel-product")
	String cancelProduct(String orderId, String userId, String productId, int quantity)
	{
		return productId;
		
	}
   
}
