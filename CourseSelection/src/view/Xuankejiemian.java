package view;
//选课

import java.util.Scanner;

import biz.*;

public class Xuankejiemian {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Zhujiemian.show();
	}
    
	public static void show() throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的学号：");
		String studentNo = scanner.nextLine();
		SCBiz sb=new SCBiz();
		sb.xuanke(studentNo);
	}
}
