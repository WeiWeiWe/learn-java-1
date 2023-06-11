package com.practice.wrap;

public class WrapTestTwo {

	public static void main(String[] args) {
		// 基本數據類型轉換為字串
		int t1 = 2;
		String t2 = Integer.toString(t1);
		
		// 測試
		System.out.println("int類型轉換為String類型對象t2="+t2);
		System.out.println("********************************");

		// 字串轉換為基本數據類型
		
		// 1. 包裝類的 parseInt 方法
		int t3 = Integer.parseInt(t2);

		// 2. 包裝類的 valueOf 方法，先將字串轉換為包裝類，再通過自動拆箱完成基本數據類型轉換
		int t4 = Integer.valueOf(t2);
		
		// 測試
		System.out.println("String類型轉換為int類型變量t3="+t3);
		System.out.println("String類型轉換為int類型變量t4="+t4);
	}

}
