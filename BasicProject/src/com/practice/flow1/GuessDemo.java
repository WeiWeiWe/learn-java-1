package com.practice.flow1;

import java.util.Scanner;

public class GuessDemo {

	public static void main(String[] args) {
		int number = (int)(Math.random() * 10 + 1);
		System.out.println("number="+number);
		int guess;

		System.out.println("猜一個介於1到10之間的數");
		
		do {
			System.out.println("請輸入您猜測的數：");
			Scanner sc = new Scanner(System.in);
			guess = sc.nextInt();
			if (guess > number) {
				System.out.println("太大");
			} else if (guess < number) {
				System.out.println("太小");
			}
		} while (number != guess);
		
		System.out.println("您猜中了！答案為"+number);
	}

}
