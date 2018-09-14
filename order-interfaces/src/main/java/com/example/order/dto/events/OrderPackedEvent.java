package com.example.order.dto.events;

import java.util.List;

import com.example.order.dto.requests.OrderAllocationRequestDTO;
import com.example.order.dto.responses.OrderDTO;

import lombok.Data;

@Data
public class OrderPackedEvent{
	List<OrderDTO> inventoryDTOList;
	
	public OrderPackedEvent(List<OrderDTO> inventoryDTOList) {
		this.inventoryDTOList = inventoryDTOList;
	}	
}
