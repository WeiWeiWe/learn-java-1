package com.practice.flow;

import java.util.Scanner;

public class WeekDemo2 {
	public static void main(String[] args) {
		System.out.println("請輸入表示星期的英文單詞：");

		Scanner sc = new Scanner(System.in);
		String week = sc.next();
		
		week = week.toUpperCase();

		switch (week) {
		case "MONDAY":
			System.out.println("星期一");
			break;
		case "TUESDAY":
			System.out.println("星期二");
			break;
		case "WEDNESDAY":
			System.out.println("星期三");
			break;
		case "THURSDAY":
			System.out.println("星期四");
			break;
		case "FRIDAY":
			System.out.println("星期五");
			break;
		case "SATURDAY":
			System.out.println("星期六");
			break;
		case "SUNDAY":
			System.out.println("星期日");
			break;
		default:
			System.out.println("單詞輸入錯誤！");
		}
	}
}
