package com.allowances.customerallowance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allowances.customerallowance.dtos.AllowanceDto;
import com.allowances.customerallowance.exceptions.NoCustomerFoundException;
import com.allowances.customerallowance.mappers.AllowanceMapper;
import com.allowances.customerallowance.models.Customer;
import com.allowances.customerallowance.models.CustomerAllowance;
import com.allowances.customerallowance.respositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired 
	private AllowanceMapper allowanceMapper;
	
	public List<AllowanceDto> getCustomerAllowances(Long customerId) {
		Customer customer = customerRepository.findById(customerId).get();
		if(customer != null) {
			return allowanceMapper.mapAllowanceToAllowanceDto(customer.getAllowances());
		} else {
			throw new NoCustomerFoundException();
		}
	}
	
	public String getCustomerInvoiceStatus(Long customerId, Long invoiceId) {
		return null;
	}
	
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}
}
