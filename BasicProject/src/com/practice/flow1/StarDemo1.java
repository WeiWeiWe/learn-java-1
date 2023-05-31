package com.practice.flow1;

public class StarDemo1 {

	public static void main(String[] args) {
		int m = 1;
		int n = 1;
		
		System.out.println("輸出4行4列的星號");
		
		while(m <= 4) {
			n = 1;
			while(n <= m) {
				System.out.print("*");
				n++;
			}
			System.out.println();
			m++;
		}

	}

}
