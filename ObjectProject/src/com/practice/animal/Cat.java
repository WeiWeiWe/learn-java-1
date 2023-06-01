package com.practice.animal;

/**
 * 寵物貓類
 * @author wei111
 *
 */
public class Cat {
	// 成員屬性： 暱稱、年齡、體重、品種
	private String name;
	private int month;
	private double weight;
	private String species;

	/**
	 * static 靜態成員、類成員
	 * 	1. 類對象共享
	 *  2. 類加載時產生，銷毀時釋放，生命週期長
	 */
	public static int price; // 售價
	
	public Cat() {
		System.out.println("我是寵物貓");
	}
	{
		name = "花花";
		price = 130;
		// 創造對象時調用，優先於構造方法執行
		System.out.println("我是構造代碼塊");
	} // 構造代碼塊
	static {
		price = 290;
		// 不管有多少實例，靜態代碼塊都只會執行一次
		// 類加載時調用，優先於構造代碼塊執行
		System.out.println("我是靜態代碼塊");
	} // 靜態代碼塊
//	public Cat(String name) {
//		System.out.println("我是帶參構造方法");
//	}
//	public Cat(String name, int month, double weight, String species) {
//		this();
//		this.name = name;
//		this.month = month;
//		this.weight = weight;
//		this.species = species;
//	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return "我是一隻名叫："+this.name+"的寵物貓";
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if (month <= 0) {
			System.out.println("輸入信息錯誤，寵物貓的年齡必須大於0");
		} else {			
			this.month = month;
		}
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}

	// 成員方法： 跑動、吃東西
	public void run() {
		// 在成員方法中，可以直接訪問類中靜態成員
		Cat.eat();
		price = 10;
		this.price = 20;
		Cat.price = 30;
		System.out.println("小貓快跑");
	}
	public void run(String name) {
		{
			int temp = 12;
			// 順序執行，先出現，先執行
			System.out.println("我是普通代碼塊1, temp="+temp);
		} // 普通代碼塊
		System.out.println(name+"快跑");
		{
			int temp = 13;
			// 順序執行，先出現，先執行
			System.out.println("我是普通代碼塊2, temp="+temp);
		} // 普通代碼塊
	}
	
	public static void eat() {
//		run(); // 靜態方法不能直接訪問同一個類中的非靜態成員，只能直接調用同一個類中的靜態成員！
//		this.name = "明明"; // 靜態方法中不能使用 this
//		name = "明明"; // 靜態方法不能訪問非靜態成員
		
		// 如果一定要調用，只能通過對象實例化後，對象.成員方法 的方式訪問非靜態成員
//		Cat temp = new Cat();
//		temp.run();
//		temp.name = "明明";
		
//		price = 50;
//		Cat.price = 500;
		
		System.out.println("小貓吃魚");
	}
}
