package com.practice.animal;

/** final 使用：
 * 1. final class： 表示該類沒有子類，也可以寫成 public final class or final public class
 * 2. final 方法： 表示該方法不允許被子類重寫，但是可以正常被子類繼承使用
 * 3. final 方法內部局部變量： 只要在具體被使用之前進行賦值即可，一旦被賦值就不允許被修改！
 * 4. final 類中成員屬性： 賦值過程只能在 -> 1. 定義時直接初始化; 2. 構造方法才進行賦值; 3. 構造代碼塊才進行賦值。
 *
 */
public class Animal {
	/**
	 * private: 只允許在本類中進行訪問
	 * public: 允許在任意位置訪問
	 * protected: 允許在 當前類、同包子類/非子類、跨包子類 調用; 但不允許 跨包非子類 調用
	 * 默認: 允許在 當前類、同包子類/非子類 調用; 但不允許 跨包子類/非子類 調用
	 */
	private String name = "妮妮"; // 暱稱
	private int month = 2; // 月份
	private String species = "動物"; // 品種
	public int temp = 15;

	private static int st1 = 22;
	public static int st2 = 23;
	
	static {
		System.out.println("我是父類的靜態代碼塊");
	}

	{
		System.out.println("我是父類的構造代碼塊");
	}
	
	// 父類的構造方法不允許被繼承、也不允許被重寫，但是會影響子類對象的實例化過程
	public Animal() {
		System.out.println("我是父類的無參構造方法");
	}
	
	public Animal(String name, int month) {
		this.name = name;
		this.month = month;
		System.out.println("我是父類的帶參構造方法");
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	public void eat() {
		System.out.println(this.getName()+"在吃東西");
	}
	
	public void eat(String name) {
		System.out.println(name+"在吃東西");
	}
	
	public void jump() {
		System.out.println("動物跳躍是一種本能");
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Animal temp = (Animal)obj; // 強制轉成 Animal 類型
		if ((this.getName().equals(temp.getName())) && (this.getMonth() == temp.getMonth())) {
			return true;
		} else {
			return false;
		}
	}
	
	// 如果不強轉，也可以採用方法重載，指定只能傳入 Animal 類型的類
	public boolean equals(Animal obj) {
		if (obj == null) {
			return false;
		} 

		if ((this.getName().equals(obj.getName())) && (this.getMonth() == obj.getMonth())) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "暱稱：" + this.getName() + ";年齡：" + this.getMonth();
	}
}
