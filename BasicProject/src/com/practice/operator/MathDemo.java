package com.practice.operator;

public class MathDemo {
	public static void main(String[] args) {
		int num1 = 10, num2 = 5;
		int result;
		
		result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		System.out.println("" + num1 + num2); // 105
		
		result = num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + result);
		
		result = num1 * num2;
		System.out.println(num1 + "*" + num2 + "=" + result);
		
		result = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + result);
		System.out.println(13 / 5); // 2
		System.out.println(13.0 / 5); // 2.6
		
		result = 13 % num2;
		System.out.println("13%" + num2 + "=" + result);
		System.out.println("13%5" + " " + (13.5 % 5));
	}
}
