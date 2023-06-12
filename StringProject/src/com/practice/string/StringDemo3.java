package com.practice.string;

import java.io.UnsupportedEncodingException;

public class StringDemo3 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// String 和 byte 陣列之間的相互轉換：
		
		// 定義一個 String
		String str = new String("JAVA 編程 基礎");
		
		// 將 String 轉換為 byte 陣列，並打印輸出
//		byte[] arrs = str.getBytes("GBK");
		byte[] arrs = str.getBytes("UTF-8");
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i]+" ");
		}
		System.out.println();

		// 將 byte 陣列轉換為 String
//		String str1 = new String(arrs, "GBK");
		String str1 = new String(arrs, "UTF-8");
		System.out.println(str1);
	}

}
