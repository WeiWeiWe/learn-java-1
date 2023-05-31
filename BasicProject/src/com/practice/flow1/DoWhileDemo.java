package com.practice.flow1;

public class DoWhileDemo {
	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		
		do {
			sum += n;
			n++;
		} while (n <= 5);
		
		System.out.println("sum="+sum);
	}
}
