package view;

import java.util.Scanner;

import biz.*;
import entity.Student;

//ע��
public class Zhucejiemian {
	public static void show() throws Exception {
		System.out.println("1-ע��ѧ����Ϣ��2-ע��γ���Ϣ��0-�˳�");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		Student student = new Student();
		switch (option) {
		//ע��
		case "1":{
		System.out.println("������ѧ�ţ�");
		student.setStudentNo(scanner.nextLine());
		System.out.println("������������");
		student.setStudentName(scanner.nextLine());
		System.out.println("�������Ա�");
		student.setStudentGender(scanner.nextLine());
		System.out.println("���������䣺");
		student.setStudentAge(Integer.parseInt(scanner.nextLine()));
		System.out.println("������Ժϵ��");
		student.setStudentDepartment(scanner.nextLine());
		System.out.println("���������룺");
		String firstPassword = scanner.nextLine();
		System.out.println("���ٴ��������룺");
		String secondPassword = scanner.nextLine();
		StudentBiz sc = new StudentBiz();
		sc.register(student,firstPassword,secondPassword);
		break;
		}	
		case "2":{
			System.out.println("������ѧ�γ̺ţ�");
			String courseNo = scanner.nextLine();
			System.out.println("������γ�����");
			String courseName = scanner.nextLine();
			System.out.println("������γ̷�����");
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
		