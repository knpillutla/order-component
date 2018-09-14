package com.example.order.dto.events;

import com.example.order.dto.requests.OrderAllocationRequestDTO;
import com.example.order.dto.responses.OrderDTO;

import lombok.Data;

@Data
public class OrderLineShortedEvent{
	public OrderAllocationRequestDTO pickReq;
	public String errorMsg;
	
	public OrderLineShortedEvent(OrderAllocationRequestDTO pickReq, String errorMsg) {
		this.pickReq = pickReq;
		this.errorMsg = errorMsg;
	}

}
