package com.practice.tel;

/**
 * 原始手機
 * @author wwwww
 *
 */
public class Telphone {
	private String brand;
	private int price;
	
	public Telphone() {
		
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 打電話
	public void call() {
		System.out.println("手機可以打電話");
	}
}
