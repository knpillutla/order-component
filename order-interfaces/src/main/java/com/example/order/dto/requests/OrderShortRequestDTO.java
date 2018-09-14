package com.example.order.dto.requests;

import lombok.Data;

@Data
public class OrderShortRequestDTO {
	private Integer locnNbr;
	private String locnBrcd;
	private String itemBrcd;
	private String ilpn;
	private Integer qty;
	private String batchNbr;
	private String orderNbr;
	private String packageNbr;
	private String busUnit;
	private String userId;
}
