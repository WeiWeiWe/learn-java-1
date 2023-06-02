package com.practice.model;

public class Depearment {
	// 成員屬性： 部門編號、部門名稱、員工陣列、員工人數
	private String depNo;
	private String depName;
	private Employee[] employeeList;
	private int employeeNum;

	// 無參構造方法
	public Depearment() {

	}

	// 帶參構造方法，實現對 部門編號、部門名稱 賦值
	public Depearment(String depNo, String depName) {
		this.setDepNo(depNo);
		this.setDepName(depName);
	}

	public String getDepNo() {
		return depNo;
	}

	public void setDepNo(String depNo) {
		this.depNo = depNo;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Employee[] getEmployeeList() {
		if (this.employeeList == null) {
			this.setEmployeeList(new Employee[200]);
		}
		return employeeList;
	}

	public void setEmployeeList(Employee[] employeeList) {
		this.employeeList = employeeList;
	}

	public int getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}

	public void addEmployeeToDep(Employee employee) {
		for (int i = 0; i < this.getEmployeeList().length; i++) {
			if (this.getEmployeeList()[i] == null) {
				employee.setEmployeeDep(this);
				this.getEmployeeList()[i] = employee;
				this.setEmployeeNum(i + 1);
				break;
			}
		}
	}

	public String showDepInfo() {
		String str = this.getDepName() + "總共有" + this.getEmployeeNum() + "名員工";

		return str;
	}
}
