package com.xworkz.watches.constants;

public enum DBProperties {
	URL("jdbc:mysql://localhost:3306/"),
	USERNAME("root"),
	PASSWORD("V@rshinibt");
	
	private String value;
	
	private DBProperties(String value) {
		this.value=value;
		
	}
	 public String getvalue() {
		return value; 
	 }

}
