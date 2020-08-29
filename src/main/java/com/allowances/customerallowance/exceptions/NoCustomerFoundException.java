package com.allowances.customerallowance.exceptions;

public class NoCustomerFoundException extends RuntimeException{
	public NoCustomerFoundException() {
		super("No customer found");
	}
}
