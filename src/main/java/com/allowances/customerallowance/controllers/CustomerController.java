package com.allowances.customerallowance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.allowances.customerallowance.dtos.AllowanceDto;
import com.allowances.customerallowance.models.Customer;
import com.allowances.customerallowance.models.CustomerAllowance;
import com.allowances.customerallowance.services.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerServ;
	
	@GetMapping(path = "/customer/{id}/allowances")
	ResponseEntity<List<AllowanceDto>> getCustomerAllowances(@PathVariable() Long id) {
		return ResponseEntity.ok(customerServ.getCustomerAllowances(id));
	}
	
	@GetMapping(path = "/customers")
	ResponseEntity<List<Customer>> getCustomers() {
		return ResponseEntity.ok(customerServ.getCustomers());
	}
}
