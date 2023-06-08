package com.practice.test;

import java.util.Scanner;

public class TryDemoTwo {

	public static void main(String[] args) {
		int result = test();
		System.out.println("one 和 two 的商是：" + result);
	}
	
	public static int test() {
		Scanner input = new Scanner(System.in);
		System.out.println("=====運算開始=====");
		try {			
			System.out.print("請輸入第一個整數：");
			int one = input.nextInt();
			System.out.print("請輸入第二個整數：");
			int two = input.nextInt();
			return one / two;
		} catch (ArithmeticException e) {
			System.out.println("除數不允許為零");
			return 0;
		} finally {
			System.out.println("=====運算結束=====");
		}	
	}
}
