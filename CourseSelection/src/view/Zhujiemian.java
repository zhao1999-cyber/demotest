package view;

import java.util.Scanner;

public class Zhujiemian {
	public static void show() throws Exception {
		System.out.println("1-注册信息；2-修改信息；3-选课；4-登录；0-退出");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		switch (option) {
		//注册
		case "1":
			Zhucejiemian.show();
			break;
		//修改密码	
		case "2":
			Xiugaimimajiemian.show();
			break;
		//选课	
		case "3":
			 Xuankejiemian.show();
			break;
		//登录
		case "4":
			Loadjiemian.show();
		}
	}
}
