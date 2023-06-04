package com.practice.animal;

public class Dog extends Animal {
	private String sex; // 性別
	
	public Dog() {
		
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void sleep() {
		super.eat();
		System.out.println(this.getName()+"現在"+this.getMonth()+"個月大, 它在睡覺~");
	}
	
	/**
	 * 方法重載：
	 * 1. 同一個類中
	 * 2. 方法名相同，參數列表不同 (參數順序、個數、類型)
	 * 3. 方法返回值、訪問修飾符任意
	 * 4. 與方法的參數名無關
	 * 
	 * 方法重寫：
	 * 1. 有繼承關係的子類中
	 * 2. 方法名相同，參數列表相同 (參數順序、個數、類型)
	 * 3. 訪問修飾符，訪問範圍需要大於等於父類的訪問範圍
	 * 4. 與方法的參數名無關
	 * 5. 當方法返回值是 void 或基本數據類型時，必須相同; 當返回值是引用類型時，可以是父類或其子類
	 */
	
	// 方法重載
//	private String sleep(String name) {
//		return "";
//	}
	// 方法重載
//	public void sleep(String name, int month) {
//		
//	}
	// 方法重載
//	public void sleep(int month, String name) {
//		
//	}
	// 非方法重載 -> 跟前一個方法重載差異只是參數名稱不同
//	public void sleep(int name, String month) {
//		
//	}
	
	public void eat() {
		System.out.println(this.getName()+"最近沒有食慾~");
	}
	
	public void eat(String month) {
		System.out.println(month + "最近沒有食慾");
	}
	
}






