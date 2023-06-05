package com.practice.singleton;

// 餓漢式： 創建對象實例的時候，直接初始化 -> 空間換時間
public class SingletonOne {
	// 1. 創建類中私有構造
	private SingletonOne() {
		
	}
	
	// 2. 創建該類型的私有靜態實例
	private static SingletonOne instance = new SingletonOne();
	
	// 3. 創建公有靜態方法返回靜態實例對象
	public static SingletonOne getInstance() {
		return instance;
	}
}
