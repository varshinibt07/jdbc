package com.xworkz.corejava.Object_Class_Methos.Tostring;

public class Window {
	String type ;
	double height;
	double width;
	
	Window(String type,double height,double width)
	{
		this.type = type;
		this.height = height;
		this.width =width;
	}
		@Override
		public String toString() {
			return "window type=" + type + ", height=" +height +", width=" +width;
		}
	
}
