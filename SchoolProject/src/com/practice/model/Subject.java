package com.practice.model;

/**
 * 專業類
 * @author WWWWW
 *
 */
public class Subject {
	// 成員屬性： 學科名稱、學科編號、學制年限
	private String subjectName;
	private String subjectNo;
	private int subjectLife;

	// 無參構造方法
	public Subject() {

	}

	// 帶參構造方法，實現對屬性的全部賦值
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}

	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public int getSubjectLife() {
		return subjectLife;
	}

	// 設置學制年限，限制必須>0
	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0) {
			return;
		}
		this.subjectLife = subjectLife;
	}
	
	/**
	 * 專業介紹的方法
	 * @return 專業介紹的相關訊息，包括名稱、編號、年限
	 */
	public String info() {
		String str = "專業信息如下： \n專業名稱： " + this.getSubjectName() + "\n專業編號：" 
				+ this.getSubjectNo() + "\n學制年限： " + this.getSubjectLife() + "年";

		return str;
	}

}
