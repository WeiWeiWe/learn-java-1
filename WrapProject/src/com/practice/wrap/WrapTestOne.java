package com.practice.wrap;

public class WrapTestOne {
	public static void main(String[] args) {		
		// 裝箱：把基本數據類型轉換成包裝類
		
		// 1. 自動裝箱
		int t1 = 2;
		Integer t2 = t1;

		// 2. 手動裝箱
		Integer t3 = new Integer(t1);
		
		// 測試
		System.out.println("int類型變量t1="+t1);
		System.out.println("Integer類型對象t2="+t2);
		System.out.println("Integer類型對象t3="+t3);
		System.out.println("*************************");

		// 拆箱：把包裝類轉換成基本數據類型
		
		// 1. 自動拆箱
		int t4 = t2;
		
		// 2. 手動拆箱
		int t5 = t2.intValue();
		double t6 = t2.doubleValue();

		// 測試
		System.out.println("Integer類型對象t2="+t2);
		System.out.println("自動拆箱後，int類型變量t4="+t4);
		System.out.println("手動拆箱後，int類型變量t5="+t5);
		System.out.println("手動拆箱後，double類型變量t6="+t6);
	}
}
