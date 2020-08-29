package com.allowances.customerallowance.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "customer_allowance")
public class CustomerAllowance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne()
	@JsonBackReference
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@ManyToOne()
	@JoinColumn(name = "allowance_id")
	@JsonManagedReference
	private Allowance allowance;
	
	private BigDecimal amount;
	
	@Column(name = "total_amount")
	private BigDecimal totalAmount;
	public CustomerAllowance() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomerAllowance(Customer customer, Allowance allowance, BigDecimal amount, BigDecimal totalAmount) {
		super();
		this.customer = customer;
		this.allowance = allowance;
		this.amount = amount;
		this.totalAmount = totalAmount;
	}

	public CustomerAllowance(Long id, Customer customer, Allowance allowance, BigDecimal amount,
			BigDecimal totalAmount) {
		super();
		this.id = id;
		this.customer = customer;
		this.allowance = allowance;
		this.amount = amount;
		this.totalAmount = totalAmount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Allowance getAllowance() {
		return allowance;
	}

	public void setAllowance(Allowance allowance) {
		this.allowance = allowance;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
