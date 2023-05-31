package com.practice.operator;

public class ConditionDemo1 {

	public static void main(String[] args) {
		// 商場打折，如果兩件商品的價格大於100則減20，並把原價和折扣後的價格分別輸出
		double price1, price2;
		price1 = 80;
		price2 = 55;
		
		double sum = price1 + price2;
		System.out.println("原價為："+ sum);
		
		if (sum >= 100) {
			sum -= 20;
		}
		System.out.println("折後價格為："+ sum);
	}
}
