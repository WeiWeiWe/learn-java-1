package com.practice.test;

// 接口也可以實現繼承，並且可以繼承多個父接口
public interface ISon extends IFather, IFather2 {
	void run();
	
	@Override
	default void connection() {
		System.out.println("ISon中的connection");
	}
}
