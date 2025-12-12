package com.carvantage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @Column(length = 100, nullable = false, unique = true)
    private String email;
    
    @Enumerated(EnumType.STRING)
	private Role role;
	
    @Column(length = 100, nullable = false, unique = true)
    private String Name;

}
