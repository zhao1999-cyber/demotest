package view;
//ѡ��

import java.util.Scanner;

import biz.*;

public class Xuankejiemian {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Zhujiemian.show();
	}
    
	public static void show() throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������ѧ�ţ�");
		String studentNo = scanner.nextLine();
		SCBiz sb=new SCBiz();
		sb.xuanke(studentNo);
	}
}
