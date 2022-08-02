package com.xworkz.bars.constants;

public enum BarType {
	WINE_SHOP("wine"),
	MSIL("msil"),
	BARANDRESTAURANT("bar and restaurant"),
	RESORT("resort"),
	DEFAULT("restaurant");
	
	private String name;
	
	private BarType(String name)
	{
		this.name=name;
	}
	public String getBar() 
	{
		return name;
	}

}
