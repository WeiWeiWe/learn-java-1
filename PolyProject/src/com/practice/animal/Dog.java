package com.practice.animal;

public class Dog extends Animal {
	// 屬性： 性別
	private String sex;
	
	public Dog() {
		
	}
	
	public Dog(String name, int month, String sex) {
		super(name, month);
		this.setSex(sex);
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	// 方法： 睡覺
	public void sleep() {
		System.out.println("小狗有午睡的習慣");
	}

	// 方法： 吃東西 (重寫父類方法)
	@Override
	public void eat() {
		System.out.println("狗愛吃肉~~");
	}
}
