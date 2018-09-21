package com.example.order.endpoint.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import com.example.order.dto.requests.OrderCreationRequestDTO;
import com.example.order.service.OrderService;
import com.example.order.streams.OrderStreams;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OrderListener {
	@Autowired
	OrderService orderService;
	
/*	@StreamListener(OrderStreams.ORDERS_INPUT)
	public void handleIncomingOrders(String msg) { //OrderCreationRequestDTO orderCreationRequestDTO) {
		log.info("Received Msg: {}" + ": at :" + new java.util.Date(), msg);
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		log.info("Completed Order Create request for : " + msg + ": at :" + new java.util.Date()
				+ " : total time:" + (endTime - startTime) / 1000.00 + " secs");
	}*/

	@StreamListener(OrderStreams.ORDERS_INPUT)
	public void handleIncomingOrders(OrderCreationRequestDTO orderCreationRequestDTO) { //OrderCreationRequestDTO orderCreationRequestDTO) {
		log.info("Received Msg: {}" + ": at :" + new java.util.Date(), orderCreationRequestDTO);
		long startTime = System.currentTimeMillis();
		try {
			orderService.createOrder(orderCreationRequestDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		log.info("Completed Order Create request for : " + orderCreationRequestDTO + ": at :" + new java.util.Date()
				+ " : total time:" + (endTime - startTime) / 1000.00 + " secs");
	}
}
