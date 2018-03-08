package com.netease.course.container.test;

public class ScrewDriver {
	private String color = "red";
	
	public void use() {
		System.out.println("Use "+color+" screwdriver");
	}
	
	public void setColor(String color) {
		this.color=color;
		System.out.println("Set screwdriver color to "+color);
	}
	
	public void init() {
		System.out.println("Init screwdriver, the init color is "+color);
	}
	
	public void cleanup() {
		System.out.println("Destroy screwdriver, the destroyed screwdriver color is "+color);
	}
}
