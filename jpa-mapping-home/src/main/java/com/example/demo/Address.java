package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Address {
	
	@Id
	private int id;
	private String address;
	private String street;
	private String township;
	private String state;
	

}
