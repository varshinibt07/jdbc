package com.xworkz.coventinalHall.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table (name="Hall_info")

public class ConventinalHallEntity {
	

	
		@Id
		@Column(name ="id")
		private int id;
		@Column(name ="name")
		private  String name;
		@Column(name ="location")
		private String loaction;
		@Column(name ="owner")
		private String owner;
		@Column(name ="price")
		private double price;
		@Column(name ="checkInTime")
		private LocalTime checkInTime;
		@Column(name ="checkouttime")
		private LocalTime checkOutTime;
		@Column(name ="checkInDate")
		private LocalDate checkInDate;
		@Column(name ="checkOutDate")
		private LocalDate checkOutDate;
		

	}



