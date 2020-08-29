package com.allowances.customerallowance.dtos;

import java.math.BigDecimal;

public class AllowanceDto {
	private String allowanceName;
	private BigDecimal totalAmount;
	private BigDecimal remainingAmount;
	
	public AllowanceDto() {
		// TODO Auto-generated constructor stub
	}
	
	

	public AllowanceDto(String allowanceName, BigDecimal totalAmount, BigDecimal remainingAmount) {
		super();
		this.allowanceName = allowanceName;
		this.totalAmount = totalAmount;
		this.remainingAmount = remainingAmount;
	}



	public String getAllowanceName() {
		return allowanceName;
	}

	public void setAllowanceName(String allowanceName) {
		this.allowanceName = allowanceName;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getRemainingAmount() {
		return remainingAmount;
	}

	public void setRemainingAmount(BigDecimal remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	
	
}
