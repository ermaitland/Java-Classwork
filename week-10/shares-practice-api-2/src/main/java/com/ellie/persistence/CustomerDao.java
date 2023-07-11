package com.ellie.persistence;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ellie.entity.Customer;

@Transactional
@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>  {
	
	@Query("from Customer where customerId=:cId")
	List<Customer> findByCustomerId(@Param("cId") int customerId);
}
