package com.practice.animal;

public class CatTest {
	public static void main(String[] args) {
		// 對象實例化
		Cat one = new Cat();
		
		one.setName("凡凡");
		one.setMonth(0);
		
		System.out.println("暱稱："+one.getName());
		System.out.println("年齡："+one.getMonth());
//		System.out.println("體重："+one.weight);
//		System.out.println("品種："+one.species);
		one.run();
	}
}
