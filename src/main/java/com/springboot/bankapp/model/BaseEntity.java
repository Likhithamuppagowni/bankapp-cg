package com.springboot.bankapp.model;


	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	public class BaseEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id; 
	}
	


