package com.example.demo;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Classes {

	@Id
	private int id;
	private LocalDate startDate;
	private LocalTime startTime;
	private LocalTime endTime;
	private double month;
	private int fees;
	
	@Enumerated(EnumType.STRING)
	private Days days;
	
	
	
	@ManyToOne
	private Course course;
	
	@ManyToOne
	private Teacher teacher; 
	
}
