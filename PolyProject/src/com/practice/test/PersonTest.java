package com.practice.test;

//import com.practice.anonymous.Man;
import com.practice.anonymous.Person;
//import com.practice.anonymous.Woman;

public class PersonTest {
	// 根據傳入的不同的人的類型，調用對應的 read 方法

	// 方案1：
//	public void getRead(Man man) {
//		man.read();
//	}
//	public void getRead(Woman woman) {
//		woman.read();
//	}
	
	// 方案2：
	public void getRead(Person person) {
		person.read();
	}

	public static void main(String[] args) {
		PersonTest test = new PersonTest();
//		Man one = new Man();
//		Woman two = new Woman();
//		test.getRead(one);
//		test.getRead(two);
		
		// 方案3： 匿名內部類
		/**
		 * 1. 匿名內部類沒有類型名稱、實例對象名稱
		 * 2. 編譯後的文件命名： 外部類$數字.class
		 * 3. 無法使用 private、public、protected、abstract、static 修飾
		 * 4. 無法編寫構造方法，但可以添加構造代碼塊
		 * 5. 不能出現靜態成員
		 * 6. 匿名內部類可以實現接口也可以繼承父類，但是不可兼得，只能擇一實現
		 */
		test.getRead(new Person(){
			{
				// 構造代碼塊
			}
			@Override
			public void read() {
				System.out.println("男生喜歡看科幻類書籍");
			}
		});
		test.getRead(new Person(){
			@Override
			public void read() {
				System.out.println("女生喜歡讀言情小說");
			}
		});

	}

}
 