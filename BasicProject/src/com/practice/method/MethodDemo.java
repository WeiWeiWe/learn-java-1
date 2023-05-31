package com.practice.method;

public class MethodDemo {
	public void printStar() {
		System.out.println("*********************");
	}

	public static void main(String[] args) {
		MethodDemo myMethodDemo = new MethodDemo();
		myMethodDemo.printStar();
		System.out.println("歡迎來到Java的世界！");
		myMethodDemo.printStar();
	}

}
