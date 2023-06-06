package com.practice.milktea;

public class Notenough extends Likes{
	@Override
	public void like() {
		System.out.println("讚不夠60個，無法領取奶茶。");
	}
}
