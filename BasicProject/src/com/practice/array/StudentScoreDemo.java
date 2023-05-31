package com.practice.array;

import java.util.Scanner;

public class StudentScoreDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int studentScoreList[][] = new int[3][2];
		int chineseTotalScore = 0;
		int englishTotalScore = 0;
		
		for (int i = 0; i < studentScoreList.length; i++) {
			for (int j = 0; j < studentScoreList[i].length; j++) {
				System.out.println("請輸入第"+(i + 1)+"個學生的"+(j == 0 ? "國文" : "數學")+"成績：");

				int score = sc.nextInt();
				studentScoreList[i][j] = score;
				if (j == 0) {
					chineseTotalScore += score;
				} else {
					englishTotalScore += score;
				}
			}
		}
		
		System.out.println("語文的總成績為："+chineseTotalScore);
		System.out.println("語文的平均分為："+chineseTotalScore / studentScoreList.length);
		System.out.println("英文的總成績為："+englishTotalScore);
		System.out.println("英文的平均分為："+englishTotalScore / studentScoreList.length);
	}
}
