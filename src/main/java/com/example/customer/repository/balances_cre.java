package com.example.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customer.account.account_created;
import com.example.customer.balance.balance;

public interface balances_cre extends JpaRepository<balance,Integer>{

	boolean existsByUuidIgnoreCase(String uuid);

	void save(account_created input);

}
