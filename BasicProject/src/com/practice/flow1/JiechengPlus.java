package com.practice.flow1;

public class JiechengPlus {
	public static void main(String[] args) {
		long s = 1, sum = 0;
		
		for (int i = 1; i <= 3; i++) {
			s = 1;
			for (int j = 1; j <= i; j++) {
				s *= j;
			}
			sum += s;
		}
		
		System.out.println("1!+2!+3!="+sum);
	}
}
