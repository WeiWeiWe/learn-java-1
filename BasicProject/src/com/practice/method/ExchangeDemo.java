package com.practice.method;

public class ExchangeDemo {
	
	public void swap(int a, int b) {
		int temp;
		System.out.println("交換前：a="+a+",b="+b);
		temp = a; a = b; b = temp;
		System.out.println("交換後：a="+a+",b="+b);
	}
	
	public void swapTest() {
		int m = 4, n = 5;
		System.out.println("交換前：m="+m+",n="+n);
		swap(m, n);
		System.out.println("交換後：m="+m+",n="+n);
	}

	public static void main(String[] args) {
		ExchangeDemo ed = new ExchangeDemo();
		ed.swapTest();
	}

}
