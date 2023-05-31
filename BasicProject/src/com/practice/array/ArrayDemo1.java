package com.practice.array;

import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		int[] a = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("請輸入第" + (i + 1) + "幾個元素：");
			a[i] = sc.nextInt();
		}
		
		System.out.println("陣列元素的內容為：");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "	");
		}
		
		System.out.println();
		System.out.println("使用forEach循環輸出陣列內容：");
		for(int n:a) {
			System.out.print(n+"	");
		}
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		System.out.println();
		System.out.println("陣列元素的累加和為："+sum);
	}
}
