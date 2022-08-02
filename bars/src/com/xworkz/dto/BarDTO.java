package com.xworkz.dto;

import com.xworkz.bars.constants.BarType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
@NoArgsConstructor         //Default constructor
@AllArgsConstructor       //parameterized constructor

public class BarDTO {
	private Integer id;
	private String name;
	private String location;
	private BarType type = BarType.DEFAULT;
	private Double avgCollectionPerDay;
	private Double avgCollectionPerMonth;
	
	

}
