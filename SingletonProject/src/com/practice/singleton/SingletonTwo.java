package com.practice.singleton;

// 懶漢式： 類內實例對象創建時，並不直接初始化，直到第一次調用 getInstance 方法時，才完成初始化操作 -> 時間換空間
public class SingletonTwo {
	// 1. 創建私有構造方法
	private SingletonTwo() {
		
	}
	
	// 2. 創建靜態的該類實例對象
	private static SingletonTwo instance = null;

	// 3. 創建開放的靜態方法提供實例對象
	public static SingletonTwo getInstance() {
		if (instance == null) {
			instance = new SingletonTwo();
		} 
		return instance;
	}
}
