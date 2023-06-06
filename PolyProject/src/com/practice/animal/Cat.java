package com.practice.animal;

public class Cat extends Animal {
	// 屬性： 體重
	private double weight;
	
	public Cat() {
		
	}
	
	public Cat(String name, int month, double weight) {
		super(name, month);
		this.setWeight(weight);
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// 方法： 跑動
	public void run() {
		System.out.println("小貓快樂的奔跑");
	}
	
	// 方法： 吃東西 (重寫父類方法)
	@Override
	public void eat() {
		System.out.println("貓愛吃魚~~");
	}

	public void playBall() {
		System.out.println("小貓喜歡玩線球");
	}
}
