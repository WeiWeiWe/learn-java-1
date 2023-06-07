package com.practice.tel;

// 接口訪問修飾符 -> 只能是 public 或 默認不寫 兩種情況
public interface INet {
	/**
	 * 1. 接口中抽象方法可以不寫 abstract 關鍵字
	 * 2. 在接口這邊訪問修飾符就算默認不寫，一樣都會是 public，這是比較特殊的規則！
	 * 3. 當類實現接口時，需要去實現接口中的所有抽象方法，否則需要將該類設置為抽象類！
	 */
	void network();
	
	// 接口中可以包含常量，並且默認會自己加上 public static final
//	public static final int TEMP = 20;
	int TEMP = 20;
	
	/**
	 * default 默認方法：
	 * 	1. JDK1.8 以後才提供的功能
	 *  2. 可以帶方法體
	 *  3. 可以在實現類中重寫，並可以通過接口的引用調用
	 */
	default void connection() {
		System.out.println("我是接口中的默認方法");
	}
	
	/**
	 * static 靜態方法：
	 * 	1. JDK1.8 以後才提供的功能
	 *  2. 可以帶方法體
	 *  3. 不可以在實現類中重寫，可以同接口名調用
	 */
	static void stop() {
		System.out.println("我是接口中的靜態方法");
	}
}
