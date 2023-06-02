package com.practice.model;

/**
 * 專業類
 * @author WWWWW
 *
 */
public class Subject {
	// 成員屬性： 學科名稱、學科編號、學制年限、報名選修的學生訊息、報名選修的學生個數
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents;
	private int studentNum; 

	// 無參構造方法
	public Subject() {

	}
	// 帶參構造方法，實現對 學科名稱、學科編號、學制年限 賦值
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}
	// 帶參構造方法，實現對全部屬性的賦值
	public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
		this.setMyStudents(myStudents);
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
	 * 獲取選修專業的學生訊息，如果保存學生訊息的陣列未被初始化，則先初始化長度200
	 * @return 保存學生訊息的陣列
	 */
	public Student[] getMyStudents() {
		if (this.myStudents == null) {
			this.myStudents = new Student[200];
		}
		return myStudents;
	}

	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}

	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
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
	
	public void addStudent(Student stu) {
		/**
		 * 1. 將學生保存到陣列中
		 * 2. 將學生個數保存到 studentNum
		 */
 
		// 1. 將學生保存到陣列中
		for (int i = 0; i < this.getMyStudents().length; i++) {
			if (this.getMyStudents()[i] == null) {
				stu.setstudentSubject(this);
				this.getMyStudents()[i] = stu;
				// 2. 將學生個數保存到 studentNum
				this.setStudentNum(i + 1);
				break;
			}
		}
	}

}
