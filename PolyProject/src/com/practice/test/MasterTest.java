package com.practice.test;

import com.practice.animal.Animal;
import com.practice.animal.Cat;
import com.practice.animal.Dog;
import com.practice.animal.Master;

public class MasterTest {

	public static void main(String[] args) {
		Master master = new Master();
		Cat one = new Cat();
		Dog two = new Dog();
		master.feed(one);
		master.feed(two);
		System.out.println("==========");
		boolean isManyTime = true;
		Animal temp;
//		if (isManyTime) {
//			temp = master.hasManyTime();
//		} else {
//			temp = master.hasLittleTime();
//		}
		temp = master.raise(isManyTime);
		System.out.println(temp);
	}

}
