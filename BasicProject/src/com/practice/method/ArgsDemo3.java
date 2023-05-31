package com.practice.method;

public class ArgsDemo3 {
	
	public int plus(int a, int b) {
		System.out.println("不帶可變參數的方法被調用！");
		return a + b;
	}
	
	// 可變參數列表所在的方法是最後被訪問的
	public int plus(int... a) {
		int sum = 0;
		for (int n:a) {
			sum += n;
		}
		System.out.println("帶可變參數的方法被調用！");
		return sum;
	}
	
	public static void main(String[] args) {
		ArgsDemo3 ad = new ArgsDemo3();
		System.out.println("和為："+ad.plus(1, 2));
	}

}
