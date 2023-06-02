package com.practice.model;

public class Employee {
	// 成員屬性： 姓名、工號、性別、年齡、職務、所在部門
	private String employeeName;
	private String employeeNo;
	private String employeeSex;
	private int employeeAge;
	private Position employeePos;
	private Depearment employeeDep;

	// 無參構造方法
	public Employee() {

	}

	// 帶參構造方法，實現對 姓名、工號、性別、年齡、職務 的賦值
	public Employee(String employeeName, String employeeNo, String employeeSex, int employeeAge, Position employeePos) {
		this.setEmployeeName(employeeName);
		this.setEmployeeNo(employeeNo);
		this.setEmployeeSex(employeeSex);
		this.setEmployeeAge(employeeAge);
		this.setEmployeePos(employeePos);
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeSex() {
		return employeeSex;
	}

	public void setEmployeeSex(String employeeSex) {
		if (employeeSex.equals("男") || employeeSex.equals("女")) {
			this.employeeSex = employeeSex;
		} else {
			this.employeeSex = "男";
		}
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		if (employeeAge < 18 || employeeAge > 65) {
			this.employeeAge = 18;
		} else {
			this.employeeAge = employeeAge;
		}
	}

	public Depearment getEmployeeDep() {
		return employeeDep;
	}

	public void setEmployeeDep(Depearment employeeDep) {
		this.employeeDep = employeeDep;
	}

	public Position getEmployeePos() {
		return employeePos;
	}

	public void setEmployeePos(Position employeePos) {
		this.employeePos = employeePos;
	}

	public String showEmployeeInfo() {
		String str = "姓名：" + this.getEmployeeName() + "\n工號：" + this.getEmployeeNo() + "\n性別：" + this.getEmployeeSex()
				+ "\n年齡：" + this.getEmployeeAge() + "\n職務：" + this.getEmployeeDep().getDepName()
				+ this.getEmployeePos().getPosName();

		return str;
	}
}
