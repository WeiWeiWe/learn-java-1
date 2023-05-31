package com.practice.method;

public class MathDemo {
	
	public int plus(int m, int n) {
		return m + n;
	}
	public double plus(double m, double n) {
		return m + n;
	} 
	
	public int plus(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int m = 5, n = 10;
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		
		MathDemo mathDemo = new MathDemo();
		
		System.out.println("int類型的和："+mathDemo.plus(m, n));
		System.out.println("double類型的和："+mathDemo.plus(5.6, 7.8));
		System.out.println("陣列元素的和："+mathDemo.plus(arr));
		
	}

}
