package com.practice.test;

import java.util.Scanner;

public class TryDemoFour {
	
	public static void main(String[] args) {
		try {
			testAge();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * throw 拋出異常對象的處理方案：
	 * 	1. 通過 try...catch 包含 throw 語句 -- 自己拋自己處理
	 *  2. 通過 throws 在方法聲明處拋出異常類型 -- 誰調用誰處理 -- 調用者可以自己處理，也可以繼續上拋，
	 *     此時可以拋出與 throw 對象相同的類型或者其父類
	 *   
	 */
	// 描述酒店的入住規則： 限定年齡，18歲以下，80歲以上的住客必須由親友陪同
//	public static void testAge() {
//		try {	
//			System.out.println("請輸入年齡：");
//			Scanner input = new Scanner(System.in);
//			int age = input.nextInt();	
//			
//			if (age < 18 || age > 80) {
//				throw new Exception("18歲以下，80歲以上的住客必須由親友陪同");
//			} else {
//				System.out.println("歡迎入住本酒店");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	public static void testAge() throws Throwable {
		System.out.println("請輸入年齡：");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();	
		
		if (age < 18 || age > 80) {
			throw new Exception("18歲以下，80歲以上的住客必須由親友陪同");
		} else {
			System.out.println("歡迎入住本酒店");
		}
	}
}
