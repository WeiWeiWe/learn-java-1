package com.practice.string;

public class StringDemo1 {

	public static void main(String[] args) {
		String str = "JAVA 編程 基礎";
		
		// length()
		System.out.println("字串的長度是： "+str.length()); // 10
		
		// charAt(int index)
		System.out.println("取出字符'程'並輸出： "+str.charAt(6)); // 程
		
		// substring(int beginIndex)
		System.out.println("取出字串'編程 基礎'並輸出： "+str.substring(5));
		
		// substring(int beginIndex, int endIndex)
		System.out.println("取出字串'編程'並輸出： "+str.substring(5, 7));
	}

}
