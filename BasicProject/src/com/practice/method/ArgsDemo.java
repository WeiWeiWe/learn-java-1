package com.practice.method;

public class ArgsDemo {
	
	public void sum(int... n) {
		int sum = 0;
		for (int i:n) {
			sum += i;
		}
		System.out.println("sum="+sum);
	}
	
	
	public static void main(String[] args) {
		ArgsDemo ad = new ArgsDemo();
		ad.sum(1);
		ad.sum(1, 2);
		ad.sum(1, 2, 3);
	}

}
