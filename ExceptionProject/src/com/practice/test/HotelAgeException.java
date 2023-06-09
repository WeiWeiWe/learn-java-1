package com.practice.test;

public class HotelAgeException extends Exception {
	public HotelAgeException() {
		super("18歲以下，80歲以上的住客必須由親友陪同");
	}
}

class SubException extends HotelAgeException {
	
}