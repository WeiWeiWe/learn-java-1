package com.practice.tel;

public class FourthPhone extends ThirdPhone implements IPhoto, INet {
	@Override
	public void photo() {
		System.out.println("手機可以拍照");
	}
	
	public void network() {
		System.out.println("手機可以上網");
	}
	
	public void game() {
		System.out.println("手機可以玩遊戲");
	}
	
	@Override
	public void connection() {
		System.out.println("我是FourthPhone的connection");
	}
}
