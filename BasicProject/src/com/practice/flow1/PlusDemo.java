package com.practice.flow1;

public class PlusDemo {

	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		
		while(n <= 5) {
			sum += n;
			System.out.println("n="+n);
			n++;
		}
		
		System.out.println("1到5的累加和為："+ sum);
	}

}
