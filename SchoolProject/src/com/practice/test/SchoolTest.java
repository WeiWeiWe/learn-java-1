package com.practice.test;
import com.practice.model.Student;
import com.practice.model.Subject;

public class SchoolTest {

	public static void main(String[] args) {
		// 測試 Subject
		Subject sub1 = new Subject("計算機科學與應用", "J0001", 4);
//		System.out.println(sub1.info());
//		System.out.println("===========================");
		// 測試 Student
		Student stu1 = new Student("S01", "小明", "男", 18);
//		System.out.println(stu1.introduction());
//		System.out.println("===========================");
//		Student stu2 = new Student("S02", "小美", "女", 17);
//		System.out.println(stu2.introduction("計算機科學與應用", 4));
//		System.out.println("===========================");
//		Student stu3 = new Student("S03", "小強", "男", 18);
//		System.out.println(stu3.introduction(sub1));
//		System.out.println("===========================");
		// 測試指定專業中到底有多少學生報名
		sub1.addStudent(stu1);
//		sub1.addStudent(stu2);
//		sub1.addStudent(stu3);
		System.out.println(sub1.getSubjectName()+"的專業中已有"+sub1.getStudentNum()+"位學生進行了報名！");
	}
}
