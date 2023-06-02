package com.practice.model;

public class Position {
	// 成員屬性： 職務編號、職務名稱
	private String posNo;
	private String posName;

	// 無參構造方法
	public Position() {

	}

	// 帶參構造方法，實現對 職務編號、職務名稱 賦值
	public Position(String posNo, String posName) {
		this.posNo = posNo;
		this.posName = posName;
	}

	public String getPosNo() {
		return posNo;
	}

	public void setPosNo(String posNo) {
		this.posNo = posNo;
	}

	public String getPosName() {
		return posName;
	}

	public void setPosName(String posName) {
		this.posName = posName;
	}
}
