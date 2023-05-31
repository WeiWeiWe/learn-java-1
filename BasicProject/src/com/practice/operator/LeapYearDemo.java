package com.practice.operator;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		System.out.println("請輸入年份：");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if ((year % 4 == 0) & (year % 100 != 0) | (year % 400 == 0)) {
			System.out.println(year + "是閏年！");
		} else {
			System.out.println(year + "不是閏年！");
		}
	}

}
