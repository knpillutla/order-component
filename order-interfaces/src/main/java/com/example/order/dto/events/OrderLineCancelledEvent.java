package com.example.order.dto.events;

import com.example.order.dto.requests.OrderAllocationRequestDTO;
import com.example.order.dto.responses.OrderDTO;

import lombok.Data;

@Data
public class OrderLineCancelledEvent{
	public OrderAllocationRequestDTO pickReq;
	public String errorMsg;
	
	public OrderLineCancelledEvent(OrderAllocationRequestDTO pickReq, String errorMsg) {
		this.pickReq = pickReq;
		this.errorMsg = errorMsg;
	}

}
