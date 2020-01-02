package view;

import java.util.Scanner;

import biz.*;
import entity.Student;

//注册
public class Zhucejiemian {
	public static void show() throws Exception {
		System.out.println("1-注册学生信息；2-注册课程信息；0-退出");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		Student student = new Student();
		switch (option) {
		//注册
		case "1":{
		System.out.println("请输入学号：");
		student.setStudentNo(scanner.nextLine());
		System.out.println("请输入姓名：");
		student.setStudentName(scanner.nextLine());
		System.out.println("请输入性别：");
		student.setStudentGender(scanner.nextLine());
		System.out.println("请输入年龄：");
		student.setStudentAge(Integer.parseInt(scanner.nextLine()));
		System.out.println("请输入院系：");
		student.setStudentDepartment(scanner.nextLine());
		System.out.println("请输入密码：");
		String firstPassword = scanner.nextLine();
		System.out.println("请再次输入密码：");
		String secondPassword = scanner.nextLine();
		StudentBiz sc = new StudentBiz();
		sc.register(student,firstPassword,secondPassword);
		break;
		}	
		case "2":{
			System.out.println("请输入学课程号：");
			String courseNo = scanner.nextLine();
			System.out.println("请输入课程名：");
			String courseName = scanner.nextLine();
			System.out.println("请输入课程分数：");
			int studentGrade = Integer.parseInt(scanner.nextLine());
			
			CourseBiz sc = new CourseBiz();
			sc.register(courseNo, 
					courseName, 
					studentGrade);
		break;
		}	
		}
	}
}
		