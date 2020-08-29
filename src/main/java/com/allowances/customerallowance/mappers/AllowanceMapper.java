package com.allowances.customerallowance.mappers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.allowances.customerallowance.dtos.AllowanceDto;
import com.allowances.customerallowance.models.CustomerAllowance;

@Component
public class AllowanceMapper {
	public List<AllowanceDto> mapAllowanceToAllowanceDto(List<CustomerAllowance> allowances) {
		List<AllowanceDto> allowancesDto = new ArrayList();
		for(CustomerAllowance custAllowance : allowances) {
			allowancesDto.add(new AllowanceDto(custAllowance.getAllowance().getName(),
					custAllowance.getTotalAmount(), custAllowance.getAmount()));
		}
		return allowancesDto;
	}
}
