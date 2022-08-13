package com.xworkz.pub.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name="pub_info")


public class PubEntity {

	@Id
	@Column (name="id")
	private int id;
	@Column (name="name")
	private String name;
	@Column (name="location")
	private String location;
	@Column (name="owner")
	private String owner;
	@Column (name="price")
	private double pricePerDay;
	@Column (name="createdBy")
	private String createdBy;
	@Column (name="createdDate")
	private LocalDate createdDate;
	@Column (name="updatedBy")
	private String updatedBy;
	@Column (name="updatedDate")
	private LocalDate updatedDate;

}
