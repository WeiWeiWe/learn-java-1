package com.practice.string;

public class StringDemo2 {

	public static void main(String[] args) {
		String str = new String("JAVA編程基礎，我喜歡java編程");
		
		// indexOf(int ch)
		System.out.println("查找字符'A'在字串中第一次出現的位置： "+str.indexOf('A')); // 1
		
		// indexOf(String str)
		System.out.println("查找子串\"編程\"在字串中第一次出現的位置： "+str.indexOf("編程")); // 4
		
		// lastIndexOf(int ch)
		System.out.println("查找字符'A'在字串中最後一次出現的位置： "+str.lastIndexOf('A')); // 3
		
		// lastIndexOf(String str)
		System.out.println("查找子串\"編程\"在字串中最後一次出現的位置： "+str.lastIndexOf("編程")); // 16
		
		// indexOf(string ch, int fromIndex)
		System.out.println("從字串index值為8的位置開始，查找字串\"編程\"第一次出現的位置："+str.indexOf("編程", 8)); // 16
	}

}
