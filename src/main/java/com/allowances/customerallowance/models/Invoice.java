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

@Entity(name="invoice")
public class Invoice {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne()
	@JoinColumn(name = "customer_id")
	@JsonBackReference
	private Customer customer;
	
	@Column(name="amount")
	private BigDecimal amount;
	
	@ManyToOne()
	@JsonManagedReference
	@JoinColumn(name = "status_id")
	private Status status;
	
	public Invoice() { }
	
	public Invoice(Long id, Customer customer, BigDecimal amount, Status status) {
		super();
		this.id = id;
		this.customer = customer;
		this.amount = amount;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status statusId) {
		this.status = statusId;
	}
	
	
}
