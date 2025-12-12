package com.carvantage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarService {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serviceid;
	
	@Enumerated(EnumType.STRING)
	private CarType cartype;
	
	@Enumerated(EnumType.STRING)
	private Parts parts;
	
	@Column(length = 100,nullable = false,unique = true)
	private String cardiscription;
	
	@Enumerated(EnumType.STRING)
	private ServiceStatus servicestatus;
	

}
