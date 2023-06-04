package com.practice.animal;

public class Cat extends Animal {
	private double weight; // 體重
	public int temp = 300;

	public static int st3 = 44;
	
	static {
		System.out.println("我是子類的靜態代碼塊");
	}

	{
		System.out.println("我是子類的構造代碼塊");
	}
	
	public Cat() {
		System.out.println("我是子類的無參構造方法");
	}
	
	public Cat(String name, int month) {
		/**
		 * 子類構造方法默認會調用父類無參構造方法，
		 * 但可以通過 super() 調用父類允許被訪問的其他構造方法
		 * 
		 * super() 必須放在子類構造方法有效代碼的第一行！
		 */
		super(name, month);
		
		/**
		 * 這邊的 this() 表示會優先調用 Cat 的無參構造方法，
		 * 並且 this() 也是只能放在子類構造方法有效代碼的第一行，
		 * 所以沒辦法跟 super() 同時使用！！！
		 */
//		this();
		System.out.println("我是子類的帶參構造方法");
	}
	
	public static void say() {
		// this 和 super 都不能在靜態方法中調用！
//		this.weight = 20;
//		super.name = "aa";
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void run() {
		System.out.println(this.getName()+"是一隻"+this.getSpecies()+",它在快樂的奔跑");
	}
}
