package com.example.order.dto.events;

import java.util.List;

import com.example.order.dto.requests.OrderAllocationRequestDTO;
import com.example.order.dto.responses.OrderDTO;

import lombok.Data;

@Data
public class OrderPickedEvent{
	List<OrderDTO> inventoryDTOList;
	
	public OrderPickedEvent(List<OrderDTO> inventoryDTOList) {
		this.inventoryDTOList = inventoryDTOList;
	}	
}
