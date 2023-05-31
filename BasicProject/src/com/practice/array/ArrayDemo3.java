package com.practice.array;

public class ArrayDemo3 {
	public static void main(String[] args) {
		int[][] intArray;
		
		float floatArray[][];
		
		double[] doubleArray[];
		
		intArray = new int[3][3];
		System.out.println("intArray陣列的第3行第2列的元素為："+intArray[2][1]);
		intArray[1][2] = 9;
		System.out.println("intArray陣列的第2行第3列的元素為："+intArray[1][2]);
		
		char[][] ch = new char[3][5];
		
		floatArray = new float[3][];
		floatArray[0] = new float[3];
		floatArray[1] = new float[4];
		floatArray[2] = new float[5];
		System.out.println(floatArray[0][0]);
		
		int[][] num = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println("num陣列第1行第2列的元素為："+num[0][1]);
		System.out.println("num陣列的行數為："+num.length);
		System.out.println("num陣列的列數為："+num[0].length);
		 
		int[][] num1 = {{78,98},{65,75,63},{98}};
		System.out.println("num1陣列的第1行的列數為："+num1[0].length);
		
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1[i].length; j++) {
				System.out.print(num1[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
}
