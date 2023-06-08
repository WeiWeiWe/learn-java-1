package com.practice.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {

	public static void main(String[] args) {
		// 要求： 定義兩個整數，輸出兩數之商
//		int one = 12;
//		int two = 2;
//		System.out.println("one 和 two 的商是：" + (one/two));
		
		// 要求： 定義兩個整數，接收用戶的鍵盤輸入輸出兩數之商
		Scanner input = new Scanner(System.in);
		System.out.println("=====運算開始=====");
		try {			
			System.out.print("請輸入第一個整數：");
			int one = input.nextInt();
			System.out.print("請輸入第二個整數：");
			int two = input.nextInt();
			System.out.println("one 和 two 的商是：" + (one/two));
		} catch (ArithmeticException e) {
			System.exit(1); // 終止程序運行
			System.out.println("除數不允許為零");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("請輸入整數");
			e.printStackTrace();
		} catch (Exception e) {
			// 建議最後還是要有一個 Exception 抓取以上都抓不到的特殊錯誤，算是一個安全機制
			System.out.println("出錯啦!!!");
			e.printStackTrace();
		} finally {
			System.out.println("=====運算結束=====");
		}	
	}

}
