package com.cg.iter.greatoutdoorscms.service;


import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.RecoverableDataAccessException;
import org.springframework.dao.TransientDataAccessException;
import org.springframework.jdbc.datasource.init.ScriptException;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import com.cg.iter.greatoutdoorscms.beans.Orders;

import com.cg.iter.greatoutdoorscms.dto.CancelDTO;

import com.cg.iter.greatoutdoorscms.dto.OrderProductMapDTO;
import com.cg.iter.greatoutdoorscms.exception.CrudException;

import com.cg.iter.greatoutdoorscms.repository.CancelRepository;


@Service
public class CancelServiceImpl  implements CancelService{
	
	
	
	@Autowired
	RestTemplate rest;
	
	@Autowired
	CancelRepository cancelRepositoty;
   
    Orders orders;
    private String orderProductURL = "http://add-to-cart-service/order";
    
    private String dataAccessException = "distributed transaction exception!";
	private String scriptException = "Not well-formed script or error SQL command exception!";
	private String transientDataAccessException = "database timeout! exception!";

    
	@Override
	public String cancelOrder(String orderId , String userId) throws CrudException  {
		
		
		long millis=System.currentTimeMillis();  
		Date currentDate = new java.util.Date(millis);
		
		Orders orders = rest.getForObject(orderProductURL+"/getOrders/byOrderId?orderId="+orderId, Orders.class);
		List<OrderProductMapDTO> list = orders.getOrders();
		Iterator<OrderProductMapDTO> itr = list.iterator();
		int index = 0;
		
		
		while (itr.hasNext()) {
			
			CancelDTO cancelOrder = new CancelDTO( orderId,userId, list.get(index).getProductId(),
					list.get(index).getProductUIN(), currentDate, 0);
			try {
			cancelRepositoty.save(cancelOrder);
			}catch (RecoverableDataAccessException  e) {
				
				throw new CrudException(dataAccessException);
				
			} catch (ScriptException  e) {
				
				throw new CrudException(scriptException);
				
			} catch (TransientDataAccessException e) {
				
				throw new CrudException(transientDataAccessException);
				
			}
			
			index++;
			itr.next();
		}
		
		
		MultiValueMap<String, String> parametersMap = new LinkedMultiValueMap<String, String>();
		parametersMap.add("orderId", orderId);

		
		return rest.postForObject(orderProductURL+"/cancelOrder", parametersMap, String.class);

		
	}

	@Override
	public String cancelProduct(String orderId, String userId, String productId, int quantity) throws CrudException {
		
		long millis=System.currentTimeMillis();  
		Date currentDate = new java.util.Date(millis);
		
		Orders orders = rest.getForObject(orderProductURL+"/getOrders/byOrderIdProductId?orderId="+orderId+"&productId="+productId, Orders.class);
		List<OrderProductMapDTO> list = orders.getOrders();
		Iterator<OrderProductMapDTO> itr = list.iterator();
		int index = 0;
		
		
		while (itr.hasNext()) {
			
			CancelDTO cancelOrder = new CancelDTO( orderId,userId, list.get(index).getProductId(),
					list.get(index).getProductUIN(), currentDate, 0);
			try {
				cancelRepositoty.save(cancelOrder);
				}catch (RecoverableDataAccessException  e) {
					
					throw new CrudException(dataAccessException);
					
				} catch (ScriptException  e) {
					
					throw new CrudException(scriptException);
					
				} catch (TransientDataAccessException e) {
					
					throw new CrudException(transientDataAccessException);
					
				}
			
			index++;
			itr.next();
		}
		
		
		MultiValueMap<String, String> parametersMap = new LinkedMultiValueMap<String, String>();
		parametersMap.add("orderId", orderId);
		parametersMap.add("productId", productId);

		
		return rest.postForObject(orderProductURL+"/cancelProduct", parametersMap, String.class);
	}

}
