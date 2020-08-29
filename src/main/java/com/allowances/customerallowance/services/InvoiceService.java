package com.allowances.customerallowance.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allowances.customerallowance.respositories.InvoiceRepository;

@Service
public class InvoiceService {
	
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	public String getCustomerInvoiceStatus(Long customerId, Long invoiceId) {
		return invoiceRepository.getCustomerInvoice(customerId, invoiceId).getStatus().getName();
	}
	
}
