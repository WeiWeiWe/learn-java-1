package com.practice.test;
//import com.practice.animal.*; // 加載所有類
import com.practice.animal.Cat; // 加載指定類
//import com.practice.mechanics.Cat; // 相同名稱的類，沒辦法一起指定加載
//import com.practice.mechanics.*; // 雖然加載所有類不會報錯，但下方的 new Cat 還是 animal 包下的 Cat，所以只能透過直接加載

public class Test {
	public static void main(String[] args) {
//		Cat cat = new Cat();
//		com.practice.mechanics.Cat cat2 = new com.practice.mechanics.Cat();
		
		// 直接加載類
//		com.practice.animal.CatTest tex = new com.practice.animal.CatTest();
		
		
		Cat one = new Cat();
		one.run("花花");
//		one.setName("花花");
//		one.setMonth(2);
//		one.setSpecies("英國短毛貓");
//		Cat.price = 3000;
//		one.run();
		
//		Cat two = new Cat();
//		two.setName("凡凡");
//		two.setMonth(1);
//		two.setSpecies("英國短毛貓");
//		Cat.price = 1800;
		
//		System.out.println(one.getName()+"的售價"+Cat.price);
//		System.out.println(two.getName()+"的售價"+Cat.price);
		
	}
}
