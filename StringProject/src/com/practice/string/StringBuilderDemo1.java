package com.practice.string;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		/**
		 * String 和 StringBuilder 的區別：
		 * 	1. String 具有不可變性，而 StringBuilder 不具備。
		 * 	2. 建議當有頻繁操作字串的情況時，使用 StringBuilder。
		 * 
		 * StringBuilder 和 StringBuffer 的區別：
		 * 	1. 兩者基本相似。
		 * 	2. StringBuffer 是線程安全的，而 StringBuilder 則沒有。
		 * 	3. StringBuilder 性能略高一點，而且一般處理 String 都是單線程而已，所以用 StringBuilder 即可，除非有特殊需求。
		 */
		
		// 定義一個字串"你好“，並在後面添加內容，將字串變成”你好，hello!"
		StringBuilder str = new StringBuilder("你好");
//		str.append("，");
//		str.append("hello!");
//		System.out.println("str="+str);
		System.out.println("str="+str.append("，").append("hello!"));
		
		// 將字串變成 "你好，hELLO!"
		
		// 1. 使用 delete 方法刪除 ello 後，再插入 ELLO
//		System.out.println("替換後="+str.delete(4, 8).insert(4, "ELLO"));
		
		// 2. 使用 replace 方法直接替換
		System.out.println("替換後="+str.replace(4, 8, "ELLO"));
		
		// 在字串"你好，hELLO!"中取出"你好"並輸出
		System.out.println(str.substring(0, 2));		
	}

}
