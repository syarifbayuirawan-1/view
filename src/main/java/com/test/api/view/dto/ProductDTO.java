package com.test.api.view.dto;

import java.sql.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDTO {
	
	private Integer id;

	private String productId;
	
	private String productName;
	
	private Number amount;
	
	private String customerName;
	
	private Integer status;
	
	private String transactionDate;
	
	private String createBy;

	private String createOn;
	
}
