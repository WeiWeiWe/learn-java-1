package com.practice.tel;

public class SmartWatch implements INet, IPhoto {
	public static final int TEMP = 30;
	public void call() {
		System.out.println("智能手錶可以打電話");
	}
	
	public void message() {
		System.out.println("智能手錶可以發短信");
	}
	
	@Override
	public void network() {
		System.out.println("智能手錶可以上網");
	}

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("SemartWatch中的connection");
	}
	
	@Override
	public void photo() {
		// TODO Auto-generated method stub
		
	}
}
