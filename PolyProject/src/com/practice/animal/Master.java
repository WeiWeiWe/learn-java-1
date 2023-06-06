package com.practice.animal;

public class Master {
	/**
	 * 餵寵物：
	 * 	餵貓咪： 吃完東西後，主人會帶著去玩線球
	 * 	餵狗狗： 吃完東西後，主人會帶著狗狗去睡覺
	 */
	// 方案1： 編寫方法，傳入不同類型的動物，調用各自的方法
//	public void feed(Cat cat) {
//		cat.eat();
//		cat.playBall();
//	}
//	public void feed(Dog dog) {
//		dog.eat();
//		dog.sleep();
//	}
	
	// 方案2： 編寫方法傳入動物的父類，方法中通過類型轉換，調用指定子類的方法
	public void feed(Animal obj) {
		obj.eat();
		if (obj instanceof Cat) {
			Cat temp = (Cat)obj;
//			temp.eat();
			temp.playBall();
		} else if (obj instanceof Dog) {
			Dog temp = (Dog)obj;
//			temp.eat();
			temp.sleep();
		}
	}
	
	/**
	 * 飼養何種寵物：
	 * 	空閒時間多： 養狗狗
	 *  空閒時間少： 養貓咪
	 */
	// 方案1：
//	public Dog hasManyTime() {
//		System.out.println("主人休閒時間比較充足，適合養狗狗");
//		return new Dog();
//	}
//	public Cat hasLittleTime() {
//		System.out.println("主人平時比較忙碌，適合養貓咪");
//		return new Cat();
//	}
	
	// 方案2：
	public Animal raise(boolean isManyTime) {
		if (isManyTime) {
			System.out.println("主人休閒時間比較充足，適合養狗狗");
			return new Dog();
		} else {
			System.out.println("主人平時比較忙碌，適合養貓咪");
			return new Cat();
		}
	}
}
