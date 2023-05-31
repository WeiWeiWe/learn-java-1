package com.practice.array;

import java.util.Scanner;

public class PracticeDemo {
	public static void main(String[] args) {
		String[] trList = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int n = 0; n < trList.length; n++) {
			System.out.println("請輸入第"+(n + 1)+"個旅遊目的地");
			trList[n] = sc.next();
		}
		
		System.out.println("以下地方供旅遊參考：");
		for (String n:trList) {
			System.out.print(n + "  ");
		}
		System.out.println();

		int random = (int)(Math.random() * 5 + 1);
		System.out.println("隨機生成的旅遊目的地："+trList[random]);
		
	}
}
