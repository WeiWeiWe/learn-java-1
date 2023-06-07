package com.practice.tel;

public class Camera implements IPhoto {
	@Override
	public void photo() {
		System.out.println("相機可以拍照");
	}
}
