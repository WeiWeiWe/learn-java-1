package com.practice;

public class TypeExchange {
	public static void main(String[] args) {
		char c = (char)65536;
		
		int n;
		n = c;
		
		c = (char)n;
		
		int x = 100;
		long y = x;
		x = (int)y;
		
		float f = 1000000000000000L;
		System.out.println("f="+f);
		
		float f1 = 1032132132112139653L;
		System.out.println("f1="+f1);
	}
}