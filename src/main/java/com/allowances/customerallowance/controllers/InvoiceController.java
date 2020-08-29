package com.allowances.customerallowance.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.allowances.customerallowance.services.InvoiceService;

@RestController
public class InvoiceController {
	@Autowired
	private InvoiceService invoiceServ;
	
	@GetMapping(path = "/customer/{customerId}/invoice/{invoiceId}/status")
	ResponseEntity<String> getCustomerInvoiceStatus(@PathVariable() Long customerId, @PathVariable() Long invoiceId) {
		
		
		return ResponseEntity.ok(invoiceServ.getCustomerInvoiceStatus(customerId, invoiceId));
	}
}
