package com.example.order.dto.events;

import java.util.HashMap;
import java.util.Map;

import com.example.order.dto.BaseDTO;

import lombok.Data;

@Data
public class Event extends BaseDTO{
	public String eventName = "Event";
	public String errorMsg = "";
	public Object requestObj;
	public Object errorObj;
	
	public Event(){};
	
	public Event(String name) {
		eventName = name;
	}
	public Event(String name, Object requestObj) {
		eventName = name;
		this.requestObj = requestObj;
	}
	public Event(String name, Object requestObj, Object errorObj, String errorMsg) {
		eventName = name;
		this.requestObj = requestObj;
		this.errorObj = errorObj;
	}	
}
