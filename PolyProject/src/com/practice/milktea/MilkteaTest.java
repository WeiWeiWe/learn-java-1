package com.practice.milktea;

public class MilkteaTest {

	public static void main(String[] args) {
		Likes[] userList = new Likes[10];
		
		for (int i = 0; i < userList.length; i++) {
			int randomNum = (int)(Math.random() * 120);
			
			if (randomNum >= 100) {
				userList[i] = new Onehundred();
			} else if (randomNum >= 80) {
				userList[i] = new Eighty();
			} else if (randomNum >= 60) {
				userList[i] = new Sixty();
			} else {
				userList[i] = new Notenough();
			}
			
			if (userList[i] != null) {
				userList[i].like();
			}
		}
	}

}
