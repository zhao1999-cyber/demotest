package view;

import java.util.Scanner;

import biz.StudentBiz;
//µ«¬º
public class Loadjiemian {

	public static void show() throws Exception {
		Scanner scanner;
		String studentNo;
		String studentPassword;
		StudentBiz studentBiz;
		System.out.println("«Î ‰»Î—ß∫≈£∫");
		scanner = new Scanner(System.in);
		studentNo = scanner.nextLine();
		System.out.println("«Î ‰»Î√‹¬Î£∫");
		studentPassword = scanner.nextLine();
		studentBiz = new StudentBiz();
		studentBiz.login(studentNo, studentPassword);
	}
}
