package com.practice.operator;

import java.util.Scanner;

public class ConditionDemo2 {

	public static void main(String[] args) {
		// int n = 9;
		System.out.println("請輸入一個整數：");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		if (n % 2 == 0) {
			System.out.println(n + "是偶數！");
		} else {
			System.out.println(n + "是奇數！");
		}
	}

}
