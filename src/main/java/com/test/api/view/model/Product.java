package com.test.api.view.model;

import java.math.BigInteger;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="product", schema="public")
public class Product {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "product_id")
	private String productId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "amount")
	private BigInteger amount;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "status")
	private Integer status;
	
	@Column(name = "transaction_date")
	private String transactionDate;
	
	@Column(name = "create_by")
	private String createBy;
	
	@Column(name = "create_on")
	private String createOn;
}
