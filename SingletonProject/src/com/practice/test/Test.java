package com.practice.test;

import com.practice.singleton.SingletonOne;
import com.practice.singleton.SingletonTwo;

public class Test {

	public static void main(String[] args) {
		SingletonOne one = SingletonOne.getInstance();
		SingletonOne two = SingletonOne.getInstance();
		System.out.println(one == two); // true
		System.out.println("========================");
		
		SingletonTwo three = SingletonTwo.getInstance();
		SingletonTwo four = SingletonTwo.getInstance();
		
		System.out.println(three == four); // true
	}

}
