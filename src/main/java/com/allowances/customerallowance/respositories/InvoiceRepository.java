package com.allowances.customerallowance.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.allowances.customerallowance.models.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

	@Query(value = "SELECT * FROM invoice i JOIN customer c WHERE i.customer_id = c.id and  i.id = ?2 and c.id = ?1", nativeQuery = true)
	public Invoice getCustomerInvoice(Long customerId,
			Long invoiceId);
}
