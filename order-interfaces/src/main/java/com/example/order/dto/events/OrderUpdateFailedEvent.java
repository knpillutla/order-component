package com.example.order.dto.events;

import com.example.order.dto.requests.OrderUpdateRequestDTO;

import lombok.Data;

@Data
public class OrderUpdateFailedEvent extends Event{
	public OrderUpdateRequestDTO orderUpdateReq;
	public String errorMsg;
	
	public OrderUpdateFailedEvent(OrderUpdateRequestDTO orderUpdateReq, String errorMsg) {
		this.orderUpdateReq = orderUpdateReq;
		this.errorMsg = errorMsg;
	}

}
