package com.allowances.customerallowance.respositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.allowances.customerallowance.models.Customer;
import com.allowances.customerallowance.models.CustomerAllowance;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
