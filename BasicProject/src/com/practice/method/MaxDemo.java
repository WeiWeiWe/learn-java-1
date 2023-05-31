package com.practice.method;

public class MaxDemo {
	
	public void max(float a, float b) {
		float max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("兩個數"+a+"和"+b+"最大值為："+max);
	}

	public static void main(String[] args) {
		MaxDemo maxDemo = new MaxDemo();
		float a = 5, b = 3;
		maxDemo.max(a, b);
		float m = 5.6f, n = 8.9f;
		maxDemo.max(m, n);

	}

}
