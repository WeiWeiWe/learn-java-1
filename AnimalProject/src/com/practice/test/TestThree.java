package com.practice.test;

import com.practice.animal.Animal;

public class TestThree {

	public static void main(String[] args) {
		Animal one = new Animal("花花", 2);
		Animal two = new Animal("花花", 2);
		
		// 
		/** equals 測試：
		 * 1. 繼承 Object 中的 equals 方法時，
		 *    比較的是兩個引用是否指向同一個對象，
		 *    所以 one 跟 two 指向的是不同的對象！
		 * 2. 如果真的想要實際去比較實例後的值是否相等，
		 * 	  可以到 Animal 類去重寫 equals 方法，改變比較的內容！
		 */
		boolean flag = one.equals(two);
		System.out.println("one 和 two 的引用比較："+flag); // false
		System.out.println("one 和 two 的引用比較："+(one == two)); // false
		System.out.println("======================================");
		String str1 = new String("hello");
		String str2 = new String("hello");
		// String 類重寫了 equals 方法，所以比較的是值，而 == 比較的是地址值，實際 str1 和 str2 指向的是不同的對象
		flag = str1.equals(str2);
		System.out.println("str1 和 str2 的引用比較："+flag); // true
		System.out.println("str1 和 str2 的引用比較："+(str1 == str2)); // false
		System.out.println("======================================");
		/** toString 測試：
		 * 1. 輸出對象名時，默認會直接調用類中的 toString 方法
		 * 2. 繼承 Object 中的 toString 方法時，輸出對象的字串表示形式為: 類型訊息+@+地址訊息
		 * 3. 子類可以通過重寫 toString 方法的形式，改變輸出的內容以及表現形式
		 */
		System.out.println(one.toString());
		System.out.println(one);
		System.out.println("======================================");
		System.out.println(str1);
	}
}
