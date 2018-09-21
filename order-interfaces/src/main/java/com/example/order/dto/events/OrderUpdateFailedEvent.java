package com.example.order.dto.events;

import com.example.order.dto.requests.OrderUpdateRequestDTO;
import com.example.order.dto.responses.OrderDTO;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
public class OrderUpdateFailedEvent extends ExceptionEvent{
	public OrderUpdateRequestDTO orderUpdateReq;
	private static String EVENT_NAME = "OrderUpdateFailedEvent";
	public OrderUpdateFailedEvent(OrderUpdateRequestDTO orderUpdateReq, String errorMsg) {
		super(EVENT_NAME, errorMsg);
		this.orderUpdateReq = orderUpdateReq;
	}

}
