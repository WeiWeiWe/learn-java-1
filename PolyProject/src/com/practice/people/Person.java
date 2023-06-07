package com.practice.people;

// 外部類
public class Person {
	public static int age;
	
	public Object getHeart() {
//		new Heart().temp = 12;
//		return new Heart();
		
		/**
		 * 方法內部類：
		 * 	1. 定義在方法內部，作用範圍也在方法內
		 *  2. 和方法內部成員使用規則一樣，class 前面不可以添加 public、private、protected、static
		 *  3. 類中不能包含靜態成員
		 *  4. 類中可以包含 final、abstract 修飾的成員
		 */
		class Heart {
			public final int age = 13;
			int temp = 22;
			public final void say() {
				System.out.println("hello");
			}
			
			public String beat() {
				new Person().eat();
				return Person.age + "歲的心臟在跳動";
			}
		}
		
		return new Heart().beat();
	}
	
	public void eat() {
		System.out.println("人會吃東西");
	}
	
	/**
	 * 成員內部類：
	 * 	1. 內部類在外部使用時，無法直接實例化，需要借由外部類信息才能完成實例化
	 *	2. 內部類的訪問修飾符，可以任意，但是訪問範圍會受到影響
	 *  3. 內部類可以直接訪問外部類的成員，但如果出現同名屬性，優先訪問內部類中定義的
	 *  4. 可以使用 外部類.this.成員 的方式，訪問外部類中同名的信息
	 *  5. 外部類訪問內部類信息，需要通過內部類實例，無法直接訪問
	 *  6. 內部類編譯後的 .class 文件命名是： 外部類$內部類.class
	 */
//	public class Heart {
//		int age = 13;
//		int temp = 22;
//		public String beat() {
//			eat();
//			return Person.this.age + "歲的心臟在跳動";
//		}
//	}
	
	/**
	 * 靜態內部類
	 * 	1. 靜態內部類中，只能直接訪問外部類的靜態成員，如果需要調用非靜態成員，可以通過對象實例
	 *  2. 靜態內部類對象實例時，可以不依賴於外部類對象
	 *  3. 可以通過 外部類.內部類.靜態成員 的方式，訪問內部類中的靜態成員
	 *  4. 當內部類屬性與外部類屬性同名時，默認直接調用內部類中的成員
	 *  5. 如果需要訪問外部類中的靜態屬性，則可以通過 外部類.屬性 的方式
	 *  6. 如果需要訪問外部類中的非靜態屬性，則可以通過 new 外部類().屬性 的方式
	 */
//	public static class Heart {
//		public static int age = 13;
//		int temp = 22;
//		public static void say() {
//			System.out.println("hello");
//		}
//		public String beat() {
//			new Person().eat();
//			return Person.age + "歲的心臟在跳動";
//		}
//	}
}
