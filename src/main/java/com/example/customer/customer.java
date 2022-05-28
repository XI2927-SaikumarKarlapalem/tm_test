package com.example.customer;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

import lombok.Data;

@Entity
@Data
@Table(name = "customers")
public class customer {
	
	//UUID uuid=UUID.randomUUID();
	@Id
	@GeneratedValue
	int id;
	String uuid;
	String customer_id;
	String first_name;
	String last_name;
	String moboile;
	String mail;
	String event_name;
	
	
	

}
