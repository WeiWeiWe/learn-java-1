package com.practice.flow;

import java.util.Scanner;

public class ScoreAssess {

	public static void main(String[] args) {
		System.out.println("請輸入成績：");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("優");
		} else if (score >= 80) {
			System.out.println("良");
		} else if (score >= 60) {
			System.out.println("中");
		} else {
			System.out.println("不及格");
		}

	}

}
