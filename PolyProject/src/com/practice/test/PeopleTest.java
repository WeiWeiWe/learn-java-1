package com.practice.test;

import com.practice.people.Person;
//import com.practice.people.Person.Heart;

public class PeopleTest {

	public static void main(String[] args) {
		Person lili = new Person();
		lili.age = 12;
		
		// 獲取內部類對象實例，方式1:
//		Person.Heart myHeart = new Person().new Heart();
//		System.out.println(myHeart.beat());
		
		// 獲取內部類對象實例，方式2:
//		myHeart = lili.new Heart();
//		System.out.println(myHeart.beat());
		
		// 獲取內部類對象實例，方式3:
//		myHeart = lili.getHeart();
//		System.out.println(myHeart.beat());
		
		// 獲取靜態內部類對象實例
//		Person.Heart myHeart = new Person.Heart();
//		System.out.println(myHeart.beat());
//		
//		Person.Heart.say();
		
		System.out.println(lili.getHeart());
	}

}
