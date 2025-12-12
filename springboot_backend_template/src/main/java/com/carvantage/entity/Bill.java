package com.carvantage.entity;

import jakarta.persistence.Entity;

@Entity
public class Bill {


	private Long Id;
	
	private Long serviceid;
	private Long labourcharges;
	private PayementMethod method;
	

}
