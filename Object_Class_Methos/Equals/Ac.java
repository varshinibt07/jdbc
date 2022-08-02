package com.xworkz.corejava.Object_Class_Methos.Equals;


public class Ac {
	String brand;
	String color;
	double price;
	
	public Ac(String brand,String color,double price) {
		this.brand =brand;
		this.color = color;
		this.price = price;
		
	}
	public boolean eqauals(Object obj) {
		if(obj instanceof Ac) {
			Ac ac = (Ac)obj;
			if(this.brand==ac.brand) {
				if(this.color==ac.color) {
					if(this.price==ac.price) {
						return true;
					}
					return false;
					}
				else {
					return false;
				}
			}
			else {
				return false;
			}
			
		}
		else {
			return false;
		}
	}
	}
