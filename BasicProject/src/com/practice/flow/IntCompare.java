package com.practice.flow;

public class IntCompare {

	public static void main(String[] args) {
		int x = 5, y = 5;
		
		if (x != y) {
			if (x > y) {
				System.out.println(x + "大於" + y);
			} else {
				System.out.println(x + "小於" + y);
			}
		} else {
			System.out.println(x + "和" + y + "相等");
		}

	}

}
