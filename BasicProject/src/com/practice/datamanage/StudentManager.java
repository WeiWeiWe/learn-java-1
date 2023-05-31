package com.practice.datamanage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManager {

	public float[] insertScore(int count) {
		Scanner sc = new Scanner(System.in);
		float[] scoreList = new float[count];

		for (int i = 0; i < scoreList.length; i++) {
			System.out.println("請輸入第" + (i + 1) + "個數據：");
			try {
				scoreList[i] = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("輸入非數字");
				sc.next();
				i--;
			}
		}

		return scoreList;
	}
	
	// 2 -- 求成績的平均值
	public void scoreAvg(float[] scoreList) {
		float totalScore = 0;
		
		for (int i = 0; i < scoreList.length; i++) {
			totalScore += scoreList[i];
		}
		
		System.out.println("數學平均成績為："+(totalScore / scoreList.length));
	}
	
	// 3 -- 統計成績大於 85 分的人數
	public void scoreMore(float[] scoreList) {
		int totalCount = 0;
		
		for (int i = 0; i < scoreList.length; i++) {
			if (scoreList[i] > 85) {
				totalCount++;
			}
		}
		
		System.out.println("成績大於 85 分的人數為："+totalCount);
	}
	
	// 4 -- 修改指定位置處的成績
	public void modifyScore(float[] scoreList, int index, float newScore) {
		scoreList[index] = newScore;
	}
	
	// 5 -- 打印輸出所有成績
	public void showScore(float[] scoreList) {
		System.out.println("成績為：");
		
		for (int i = 0; i < scoreList.length; i++) {
			System.out.print(scoreList[i] + "  ");
		}
		System.out.println();
	}
	
	public void notice() {
		System.out.println("******************************");
		System.out.println("       1--初始化數學成績");
		System.out.println("       2--求成績的平均值");
		System.out.println("       3--統計成績大於85分的人數");
		System.out.println("       4--修改指定位置處的成績");
		System.out.println("       5--打印輸出所有成績");
		System.out.println("       0--退出");
		System.out.println("******************************");
		System.out.println("請輸入對應的數字進行操作：");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentManager sm = new StudentManager();
		float[] scoreList = null;
		int operator = 0;
		while (true) {
			sm.notice();
			try {
				operator = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("輸入非數字");
				sc.next();
			}
			
			// 0 -- 退出
			if (operator == 0) {
				System.out.println("退出程序！");
				break;
			}

			switch (operator) {
			case 1:
				System.out.println("請輸入要存儲的數學成績的數量：");
				int count = 0;
				try {
					count = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("輸入非數字");
					sc.next();
				}
				scoreList = sm.insertScore(count);
				break;
			case 2:
				if (scoreList != null) {					
					sm.scoreAvg(scoreList);
				} else {
					System.out.println("尚未輸入數學成績！");
				}
				break;
			case 3:
				sm.scoreMore(scoreList);
				break;
			case 4:
				System.out.println("修改前：");
				sm.showScore(scoreList);
				
				int index = -1;
				int newScore = 0;
				
				System.out.println("請輸入要修改數據的位置(從0開始)：");
				try {
					index = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("輸入非數字");
					sc.next();
				}
				
				System.out.println("請輸入新數據：");
				try {
					newScore = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("輸入非數字");
					sc.next();
				}
				
				if (index >= 0) {
					sm.modifyScore(scoreList, index, newScore);
				}
				
				System.out.println("修改後：");
				sm.showScore(scoreList);
				break;
			case 5:
				if (scoreList != null) {					
					sm.showScore(scoreList);
				} else {
					System.out.println("尚未輸入數學成績！");
				}
				break;
			}
		}
	}
}
