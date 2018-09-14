package com.example.order.dto.events;

import com.example.order.dto.requests.OrderCreationRequestDTO;
import com.example.order.dto.requests.OrderAllocationRequestDTO;
import com.example.order.dto.responses.OrderDTO;

import lombok.Data;

@Data
public class OrderCreationFailedEvent extends Event{
	public OrderCreationRequestDTO orderCreationReq;
	public String errorMsg;
	
	public OrderCreationFailedEvent(OrderCreationRequestDTO pickReq, String errorMsg) {
		this.orderCreationReq = pickReq;
		this.errorMsg = errorMsg;
	}

}
