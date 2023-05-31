package com.practice.datamanage;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 從鍵盤接收整形數據存放到陣列中，並對陣列中的數據進行管理
 * 
 * @author Wei111
 *
 */
public class DataManage {

	/**
	 * 從鍵盤接收數據
	 * 
	 * @return 接收數據的陣列
	 */
	public int[] insertData() {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);

		// 少接收一個數據，為指定位置插入數據做準備
		for (int i = 0; i < a.length - 1; i++) {
			System.out.println("請輸入第" + (i + 1) + "個數據：");
			try {
				a[i] = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("輸入的數據格式有誤，不能有非數字！");
				sc.next();
				i--;
			}

		}

		return a;
	}

	/**
	 * 顯示陣列中元素的內容
	 * 
	 * @param a      陣列
	 * @param length 要顯示陣列元素的個數
	 */
	public void showData(int[] a, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
	}

	/**
	 * 從鍵盤接收一個數據，插入到陣列的指定位置處
	 * 
	 * @param a 要插入數據的陣列
	 * @param n 要插入的數據
	 * @param k 要插入的位置，從 0 開始
	 */
	public void insertAtArray(int[] a, int n, int k) {
		// 從最後一個數據開始移動，避免數據覆蓋
		for (int i = a.length - 1; i > k; i--) {
			a[i] = a[i - 1];
		}
		a[k] = n;
	}

	/**
	 * 輸出陣列中能被3整除的元素
	 * 
	 * @param a
	 */
	public void divThree(int[] a) {
		String str = "";
		int count = 0;

		for (int n : a) {
			if (n % 3 == 0) {
				str = str + n + "  ";
				count++;
			}
		}

		if (count == 0) {
			System.out.println("陣列中沒有能被3整除的元素！");
		} else {
			System.out.println("陣列中能被3整除的元素為：" + str);
		}
	}

	/**
	 * 提示訊息
	 */
	public void notice() {
		System.out.println("**********************************************");
		System.out.println("            1--插入數據");
		System.out.println("            2--顯示所有數據");
		System.out.println("            3--在指定位置處插入數據");
		System.out.println("            4--查詢能被3整除的數據");
		System.out.println("            0--退出");
		System.out.println("**********************************************");
	}

	public static void main(String[] args) {
		DataManage dm = new DataManage();
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int[] a = null;
		int n = 0, k = 0; // n 表示要插入的數據，k 表示要插入的位置
		while (true) {
			dm.notice();
			System.out.println("請輸入對應的數字進行操作：");

			try {
				input = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("輸入的數據格式有誤，不能有非數字！");
				sc.next();
				continue;
			}

			if (input == 0) {
				System.out.println("退出程序！");
				break;
			}

			switch (input) {
			case 1:
				// 插入數據
				a = dm.insertData();
				// 顯示數據
				System.out.println("陣列元素為：");
				dm.showData(a, a.length - 1);
				break;
			case 2:
				// 顯示所有數據
				if (a != null) {
					System.out.println("陣列元素為：");
					if (a[a.length - 1] == 0) {
						// 如果陣列的最後一個元素為0，說明還沒有插入數據，因此不顯示最後一個元素
						dm.showData(a, a.length - 1);
					} else {
						dm.showData(a, a.length);
					}
				} else {
					System.out.println("還未在陣列中插入數據，請重新選擇操作！");
				}
				break;
			case 3:
				// 在指定位置處插入數據
				if (a != null) {
					System.out.println("請輸入要插入的數據：");
					try {
						n = sc.nextInt();
						System.out.println("請輸入要插入數據的位置：");
						k = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("輸入的數據格式有誤，不能有非數字！");
						sc.next();
						break;
					}
					dm.insertAtArray(a, n, k);
					dm.showData(a, a.length);
				} else {
					System.out.println("還未在陣列中插入數據，請重新選擇操作！");
				}
				break;
			case 4:
				// 查詢陣列中能被3整除的元素
				if (a != null) {
					dm.divThree(a);
				} else {
					System.out.println("還未在陣列中插入數據，請重新選擇操作！");
				}
				break;
			}
		}
	}

}
