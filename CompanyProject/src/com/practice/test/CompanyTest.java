package com.practice.test;

import com.practice.model.Employee;
import com.practice.model.Depearment;
import com.practice.model.Position;

public class CompanyTest {

	public static void main(String[] args) {
		Position pos1 = new Position("P001", "經理");
		Position pos2 = new Position("P002", "助理");
		Position pos3 = new Position("P003", "職員");

		Depearment dep1 = new Depearment("D001", "人事部");
		Depearment dep2 = new Depearment("D002", "市場部");

		Employee employee1 = new Employee("張銘", "S001", "男", 29, pos1);
		Employee employee2 = new Employee("李艾愛", "S002", "女", 21, pos2);
		Employee employee3 = new Employee("孫超", "S003", "男", 29, pos3);
		Employee employee4 = new Employee("張美美", "S004", "女", 26, pos3);
		Employee employee5 = new Employee("藍迪", "S005", "男", 37, pos1);
		Employee employee6 = new Employee("米莉", "S006", "女", 24, pos3);

		dep1.addEmployeeToDep(employee1);
		dep1.addEmployeeToDep(employee2);
		dep1.addEmployeeToDep(employee3);
		dep2.addEmployeeToDep(employee4);
		dep2.addEmployeeToDep(employee5);
		dep2.addEmployeeToDep(employee6);

		System.out.println(employee1.showEmployeeInfo());
		System.out.println("==============================");
		System.out.println(employee2.showEmployeeInfo());
		System.out.println("==============================");
		System.out.println(employee3.showEmployeeInfo());
		System.out.println("==============================");
		System.out.println(employee4.showEmployeeInfo());
		System.out.println("==============================");
		System.out.println(employee5.showEmployeeInfo());
		System.out.println("==============================");
		System.out.println(employee6.showEmployeeInfo());
		System.out.println("==============================");
		System.out.println(dep1.showDepInfo());
		System.out.println(dep2.showDepInfo());
	}
}
