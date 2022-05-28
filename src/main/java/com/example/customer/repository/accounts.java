package com.example.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customer.account.account_created;

public interface accounts extends JpaRepository<account_created,Integer> {

	boolean existsByUuidIgnoreCase(String uuid);

	;

}
