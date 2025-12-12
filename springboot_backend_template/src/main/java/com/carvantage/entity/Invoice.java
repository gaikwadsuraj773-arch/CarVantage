package com.carvantage.entity;

import jakarta.persistence.Entity;

@Entity
public class Invoice<DueDate> {
	private Long Id;
	private Long gst;
	private DueDate date;
	

}
