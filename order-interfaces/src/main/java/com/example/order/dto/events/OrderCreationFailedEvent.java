package com.example.order.dto.events;

import com.example.order.dto.requests.OrderCreationRequestDTO;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class OrderCreationFailedEvent extends ExceptionEvent{
	public OrderCreationRequestDTO orderCreationReq;
	private static String EVENT_NAME = "OrderUpdateFailedEvent";
	
	public OrderCreationFailedEvent(OrderCreationRequestDTO pickReq, String errorMsg) {
		super(EVENT_NAME, errorMsg);
		this.orderCreationReq = pickReq;
	}

}
