package com.practice.test;

import com.practice.animal.Animal;
import com.practice.animal.Cat;
import com.practice.animal.Dog;

public class Test {

	public static void main(String[] args) {
		Animal one = new Animal();
		/**
		 * 向上轉型、隱式轉型、自動轉型：
		 * 	1. 父類引用指向子類實例
		 *  2. 小類轉型為大類
		 *  3. 可以調用子類重寫父類的方法以及父類派生的方法
		 *  4. 無法調用子類獨有方法
		 *  5. 因為父類中的靜態方法無法被子類重寫，所以向上轉型之後，只能調用到父類原有的靜態方法
		 */
		Animal two = new Cat();
		Animal three = new Dog();
		
		one.eat();
		two.eat();
		two.setMonth(2);
		two.getMonth();
//		two.run(); // 不能調用
		three.eat();
		System.out.println("====================");
		
		/**
		 * 向下轉型、強制類型轉換：
		 * 	1. 子類引用指向父類對象，此處必須進行強轉
		 *  2. 可以調用子類特有的方法
		 *  3. 必須滿足轉型條件才能進行強轉
		 *  4. 可以透過 instanceof 運算符判斷是否符合條件，返回 true/false
		 */
		if (two instanceof Cat) {			
			Cat temp = (Cat)two;
			temp.eat();
			temp.run();
			temp.getMonth();
			System.out.println("two可以轉換為Cat類型");
		}
		
		if (two instanceof Dog) {			
			/**
			 * 因為上面的 two 初始化實例是 Cat 類，
			 * 雖然這裡強轉成 Dog 類時，沒有語法上的錯誤，
			 * 但實際 run code 時，會有錯誤，因為不符合轉型條件，
			 * 所以可以透過 instanceof 進行判斷，避免錯誤發生！
			 */
			Dog temp2 = (Dog)two;
			temp2.eat();
			temp2.sleep();
			temp2.getSex();
			System.out.println("two可以轉換為Dog類型");
		}
		
		if (two instanceof Animal) {
			System.out.println("Animal");
		}
		
		if (two instanceof Object) {
			System.out.println("Object");
		}
	}

}
