package com.practice;

public class charDemo {

	public static void main(String[] args) {
		char a = 'a';
		System.out.println("a="+a);
		char ch = 65535;
		char ch1 = (char)65536;
		System.out.println("ch="+ch);
		System.out.println("ch="+ch1);
		
		// Unicode
		char c = '\u005d';
		System.out.println("c="+c);
	}

}
