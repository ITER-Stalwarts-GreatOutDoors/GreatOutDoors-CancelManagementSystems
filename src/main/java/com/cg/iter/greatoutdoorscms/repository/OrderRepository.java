package com.cg.iter.greatoutdoorscms.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.iter.greatoutdoorscms.dto.OrderDTO;


public interface OrderRepository extends CrudRepository<OrderDTO, String>{

}
