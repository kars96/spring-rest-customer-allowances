package com.allowances.customerallowance.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "customer",fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JsonManagedReference
	private List<Invoice> invoices;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JsonManagedReference
	private List<CustomerAllowance> allowances;
	
	private String name;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Customer(Long id, List<Invoice> invoices, List<CustomerAllowance> allowances, String name) {
		super();
		this.id = id;
		this.invoices = invoices;
		this.allowances = allowances;
		this.name = name;
	}


	public List<Invoice> getInvoices() {
		return invoices;
	}


	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}


	public List<CustomerAllowance> getAllowances() {
		return allowances;
	}


	public void setAllowances(List<CustomerAllowance> allowances) {
		this.allowances = allowances;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
