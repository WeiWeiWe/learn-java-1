package com.practice.animal;

public class Animal {
	// 屬性： 暱稱、年齡
	private String name;
	private int month;
	
	public Animal() {
		
	}
	
	public Animal(String name, int month) {
		this.setName(name);
		this.setMonth(month);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	// 方法： 吃東西
	public void eat() {
		System.out.println("動物都有吃東西的能力");
	}
	
}
