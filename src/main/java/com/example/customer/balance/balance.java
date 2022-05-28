package com.example.customer.balance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

import lombok.Getter;

@Entity
@Getter
@Table(name = "balances")
public class balance {
	@Id
	@GeneratedValue
	int id;
	String uuid;
	String account_id;
	String amount;
	String posting_instruction_batch_id;
	//String amount;
	//String posting_instruction_batch_id;
	String event_name;

}
