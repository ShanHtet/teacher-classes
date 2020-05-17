package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Teacher {
	
	@Id
	private int id;
	private String name;
	private String phone;
	private String email;
	
	
	@OneToMany
	private List<Address> address = new ArrayList<Address>();

}
