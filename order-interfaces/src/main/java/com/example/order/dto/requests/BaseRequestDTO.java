package com.example.order.dto.requests;

import com.example.order.dto.BaseDTO;

import lombok.Data;

@Data
public class BaseRequestDTO extends BaseDTO{
	public String eventName = "Event";
	public String errorMsg = "";
	public Object requestObj;
	public Object errorObj;
	
	public BaseRequestDTO(){};
	
	public BaseRequestDTO(String name) {
		eventName = name;
	}
	public BaseRequestDTO(String name, Object requestObj) {
		eventName = name;
		this.requestObj = requestObj;
	}
	public BaseRequestDTO(String name, Object requestObj, Object errorObj, String errorMsg) {
		eventName = name;
		this.requestObj = requestObj;
		this.errorObj = errorObj;
	}	
}
