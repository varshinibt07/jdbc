package com.xworkz.bank.entity;

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
@Table(name="bankemployee_info")
public class BankEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="owner")
	private String Owner;
	@Column(name="location")
	private String location;
	@Column(name="login")
	private LocalTime login;
	@Column(name="logout")
	private LocalTime logout;
	@Column(name="createdBy")
	private String createdBy;
	@Column(name="updatedBy")
	private String updatedBy;

}
