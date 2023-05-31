package com.practice.array;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] intArray;
		String strArray[];
		
		intArray = new int[5];
		strArray = new String[10];
		
		float[] floatArray = new float[4];
		char[] charArray = new char[2];
		
		System.out.println("charArray陣列的長度為："+charArray.length);
		System.out.println("intArray陣列的第2個元素為："+intArray[1]);
		System.out.println("strArray陣列的第5個元素為："+strArray[4]);
		System.out.println("floatArray陣列的最後一個元素為："+floatArray[floatArray.length - 1]);
		System.out.println("charArray陣列的最後一個元素為："+charArray[0]);
		
		for(int i = 0; i < 5; i++) {
			intArray[i] = i + 1;
		}
		
		System.out.println("intArray的元素為：");
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]+ "  ");
		}
	}
}
 