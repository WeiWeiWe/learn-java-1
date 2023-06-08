package com.practice.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThree {
	public static void main(String[] args) {
//		try {
//			int result = test();
//			System.out.println("one 和 two 的商是：" + result);
//		} catch (ArithmeticException e) {
//			System.out.println("除數不允許為零");
//			e.printStackTrace();
//		} catch(InputMismatchException e) {
//			System.out.println("請輸入整數");
//			e.printStackTrace();
//		}
		
		try {
			int result = test();
			System.out.println("one 和 two 的商是：" + result);
		} catch (ArithmeticException e) {
			System.out.println("除數不允許為零");
			e.printStackTrace();
		} catch(InputMismatchException e) {
			System.out.println("請輸入整數");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("程序錯誤了");
		}
	}
	
	/**
	 * 通過 throws 拋出異常時，針對可能出現的多種異常情況的解決方案：
	 * 	1. throws 後面接多個異常類型，中間用逗號分隔
	 * 	2. throws 後面接 Exception
	 */
	/**
	 * 測試接收數據相除結果的方法
	 * @return 兩個接收數據的商
	 * @throws ArithmeticException
	 * @throws InputMismatchException
	 */
//	public static int test() throws ArithmeticException, InputMismatchException {
//		Scanner input = new Scanner(System.in);
//		System.out.println("=====運算開始=====");			
//		System.out.print("請輸入第一個整數：");
//		int one = input.nextInt();
//		System.out.print("請輸入第二個整數：");
//		int two = input.nextInt();
//		System.out.println("=====運算結束=====");
//		return one / two;
//	}
	
	public static int test() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("=====運算開始=====");			
		System.out.print("請輸入第一個整數：");
		int one = input.nextInt();
		System.out.print("請輸入第二個整數：");
		int two = input.nextInt();
		System.out.println("=====運算結束=====");
		return one / two;
	}
}
