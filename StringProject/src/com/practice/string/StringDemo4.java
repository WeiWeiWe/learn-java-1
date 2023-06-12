package com.practice.string;

public class StringDemo4 {

	public static void main(String[] args) {
		// == 和 equals 方法的區別：
		String str1 = "abcde";
		String str2 = "abcde";
		String str3 = new String("abcde");
		String str4 = new String("abcde");
		
		System.out.println("str1和str2的內容是否相同？"+(str1.equals(str2))); // true
		System.out.println("str1和str3的內容是否相同？"+(str1.equals(str3))); // true
		
		System.out.println("str1和str2的地址是否相同？"+(str1 == str2)); // true
		System.out.println("str1和str3的地址是否相同？"+(str1 == str3)); // false
		System.out.println("str3和str4的地址是否相同？"+(str3 == str4)); // false
		
		/**
		 * 在 Java 執行 String str1 = "abcde"; 這段代碼時，會先在 Stack 創建 str1，
		 * 並在字串池創建名為 abcde 的字串，接著執行 String str2 = "abcde"; 這段代碼時，
		 * 同樣先在 Stack 創建 str2，但因為同樣是 abcde 的字串，先前創建 str1 時，
		 * 就已經在字串池創建名為 abcde 的字串了，所以 str2 會直接指向字串池已經創建好的 abcde 字串，
		 * 所以 str1 和 str2 兩者是相同的地址！
		 * 
		 * 在 Java 執行 String str3 = new String("abcde"); 這段代碼時，一樣會先在 Stack 創建 str3，
		 * 但後續是會在 heap 實例化一個 new String("abcde") 對象並指向 str3，
		 * 此時如果接著執行 String str4 = new String("abcde"); 這段代碼時，同樣會先在 Stack 創建 str4，
		 * 但後續也是在 heap 再實例化一個新的 new String("abcde") 對象並指向 str4，
		 * 所以 str3 和 str4 兩者是不同的地址，反之，跟指向字串池的 str1 和 str2 的地址也會是不同的！！！
		 */

	}

}
