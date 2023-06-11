package com.practice.wrap;

public class WrapperTest {

	public static void main(String[] args) {
		Integer one = new Integer(100);
		Integer two = new Integer(100);
		System.out.println("one==two的結果是："+(one == two)); // false -> 兩個引用指向不同的內存空間
		
		Integer three = 100; // 自動裝箱
//		Integer three = Integer.valueOf(100);
		System.out.println("three==100的結果是："+(three == 100)); // true -> 包裝類自動拆箱後，比較的就是數值了
		
//		Integer four = 100;
		/**
		 * Integer four = 100; 這段代碼，實際上對於 Java 執行來說，
		 * 是執行了 Integer four = Integer.valueOf(100); 這段代碼，
		 * 因為 Java 會提供一個緩存區(對象池)，
		 * 如果參數是在 -128 <= 參數 <= 127 這個範圍時，
		 * 會透過 Integer.valueOf() 直接產生包裝類，
		 * 否則才會透過 new Integer() 實例化包裝類！
		 * 
		 * 以下案例會是 true 的原因是，
		 * 因為上面的 three 再運行 Integer.valueOf() 時，已經在緩存區構建一個空間了，
		 * 所以下面的 four 因為滿足範圍，所以會直接去找緩存區已有的空間，
		 * 所以導致 three 和 four 都是同一塊空間，
		 * 所以結果為 true！！！
		 */
		Integer four = Integer.valueOf(100);
		System.out.println("three==four的結果是："+(three == four)); // true
		
		Integer five = 200;
		System.out.println("five==200的結果："+(five == 200)); // true -> 包裝類自動拆箱後，比較的就是數值了
		
		Integer six = 200;
		System.out.println("five==six的結果："+(five == six)); // false -> 參數超出範圍，所以會重新實例化包裝類，所以會是不同的內存空間！
		
		// 要特別注意除了 Float 和 Double 包裝類以外，都可以應用對象常量池概念的！
		Double d1 = Double.valueOf(100);
		System.out.println("d1==100的結果為："+(d1 == 100)); // true -> 包裝類自動拆箱後，比較的就是數值了
		
		Double d2 = Double.valueOf(100);
		System.out.println("d1==d2的結果為："+(d1 == d2)); // false -> Float 和 Double 包裝類沒有對象常量池的概念！
	}
}
