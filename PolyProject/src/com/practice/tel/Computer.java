package com.practice.tel;

public abstract class Computer implements INet {
	@Override
	public void network() {
		System.out.println("電腦可以上網");
	}
	
	public void game() {
		System.out.println("電腦可以玩遊戲");
	}
	
	public void vedio() {
		System.out.println("電腦可以看視頻");
	}

	public void music() {
		System.out.println("電腦可以聽音樂");
	}
}
