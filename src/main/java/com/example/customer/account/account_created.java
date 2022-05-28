package com.example.customer.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Table(name = "accounts")
public class account_created {
	@Id
	@GeneratedValue
	int id;
	String uuid;
	String account_id;
	String account_name;
	String product_id;
	String event_name;

}
