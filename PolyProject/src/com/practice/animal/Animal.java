package com.practice.animal;

// 抽象類： 不允許實例化，但可以通過向上轉型，指向子類實例
public abstract class Animal {
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
	/**
	 * 抽象方法：
	 * 	1. 不允許包含方法體
	 *  2. 子類中必須要重寫父類的抽象方法，不然會報錯，除非子類本身也是抽象類
	 *  3. 抽象方法一定只能出現在抽象類，但抽象類不一定要有抽象方法
	 *  4. static final private 不能跟 abstract 並存！！！
	 */
	public abstract void eat();
	
}
