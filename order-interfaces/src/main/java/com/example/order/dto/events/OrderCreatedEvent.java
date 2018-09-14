package com.example.order.dto.events;

import java.util.Map;

import com.example.order.dto.responses.OrderDTO;

import lombok.Data;

@Data
public class OrderCreatedEvent extends Event{
	public OrderCreatedEvent(OrderDTO orderDTO) {
		super("OrderCreatedEvent", orderDTO);
		this.addHeader("busName", orderDTO.getBusName());
		this.addHeader("locnNbr", orderDTO.getLocnNbr());
		this.addHeader("company", orderDTO.getCompany());
		this.addHeader("division", orderDTO.getDivision());
		this.addHeader("busUnit", orderDTO.getBusUnit());
	}
	public OrderCreatedEvent(OrderDTO orderDTO, Map headerMap) {
		super("OrderCreatedEvent", orderDTO);
		this.setHeaderMap(headerMap);
	}
}
