package com.example.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customer.customer;

public interface customer_created extends JpaRepository<customer,Integer>{
	boolean  existsByUuidIgnoreCase(String uuid);

	

	

}
