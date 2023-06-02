package com.practice.model;

public class Student {
	// 成員屬性： 學號、姓名、性別、年齡、專業
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;

	// 無參構造方法
	public Student() {

	}
	// 帶參構造方法，實現對 學號、姓名、性別、年齡 的賦值
	public Student(String studentNo, String studentName, String stuedentSex, int studentAge) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(stuedentSex);
		this.setStudentAge(studentAge);
	}
	// 帶參構造方法，實現對全部屬性的賦值
	public Student(String studentNo, String studentName, String stuedentSex, int studentAge, Subject studentSubject) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(stuedentSex);
		this.setStudentAge(studentAge);
		this.setstudentSubject(studentSubject);
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(String studentSex) {
		// 限制姓名只能是"男"或"女“，否則直接強制賦值為"男"
		if (studentSex.equals("男") || studentSex.equals("女")) {
			this.studentSex = studentSex;
		} else {
			this.studentSex = "男";
		}
	}

	public int getStudentAge() {
		return studentAge;
	}

	/**
	 * 給年齡賦值，限定必須在 10 ~ 100 之間，反之賦值為 18
	 * 
	 * @param studentAge
	 */
	public void setStudentAge(int studentAge) {
		if (studentAge < 10 || studentAge > 100) {
			this.studentAge = 18;
		} else {
			this.studentAge = studentAge;
		}
	}

	/**
	 * 獲取專業對象，如果沒有實例化，先實例化後，再返回
	 * 
	 * @return 專業對象訊息
	 */
	public Subject getstudentSubject() {
		if (this.studentSubject == null) {
			this.studentSubject = new Subject();
		}
		return studentSubject;
	}

	public void setstudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}

	/**
	 * 學生自我介紹的方法
	 * 
	 * @return 自我介紹的訊息，包括姓名、學號、性別、年齡
	 */
	public String introduction() {
		String str = "學生訊息如下：\n姓名：" + this.getStudentName() + "\n學號：" + this.getStudentNo() + "\n性別："
				+ this.getStudentSex() + "\n年齡：" + this.getStudentAge() + "\n所報專業名稱："
				+ this.getstudentSubject().getSubjectName() + "\n學制年限：" + this.getstudentSubject().getSubjectLife();

		return str;
	}

	/**
	 * 學生自我介紹的方法
	 * 
	 * @param subjectName 所報專業名稱
	 * @param subjectLife 學制年限
	 * @return 自我介紹的訊息，包括姓名、學號、性別、年齡、所報專業名稱、學制年限
	 */
	public String introduction(String subjectName, int subjectLife) {
		String str = "學生訊息如下：\n姓名：" + this.getStudentName() + "\n學號：" + this.getStudentNo() + "\n性別："
				+ this.getStudentSex() + "\n年齡：" + this.getStudentAge() + "\n所報專業名稱：" + subjectName + "\n學制年限："
				+ subjectLife;

		return str;
	}

	/**
	 * 學生自我介紹的方法
	 * 
	 * @param mySubject 所選專業的對象
	 * @return 自我介紹的訊息，包括姓名、學號、性別、年齡、所報專業名稱、學制年限、專業編號
	 */
	public String introduction(Subject mySubject) {
		String str = "學生訊息如下：\n姓名：" + this.getStudentName() + "\n學號：" + this.getStudentNo() + "\n性別："
				+ this.getStudentSex() + "\n年齡：" + this.getStudentAge() + "\n所報專業名稱：" + mySubject.getSubjectName()
				+ "\n學制年限：" + mySubject.getSubjectLife() + "\n專業編號：" + mySubject.getSubjectNo();

		return str;
	}

}
