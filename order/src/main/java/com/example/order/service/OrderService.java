package com.example.order.service;

import com.example.order.dto.requests.OrderCreationRequestDTO;
import com.example.order.dto.requests.OrderDeleteRequestDTO;
import com.example.order.dto.requests.OrderUpdateRequestDTO;
import com.example.order.dto.responses.OrderDTO;

public interface OrderService {
	public OrderDTO findById(String busName, Long Id) throws Exception;
	public OrderDTO createOrder(OrderCreationRequestDTO orderCreationReq) throws Exception;
	public OrderDTO updateOrder(OrderUpdateRequestDTO orderUpdRequest) throws Exception;
	public OrderDTO purgeOrder(OrderDeleteRequestDTO orderDelRequest) throws Exception;
}