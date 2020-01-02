package view;

import java.util.Scanner;
import biz.*;

//修改密码
public class Xiugaimimajiemian {
	
	public static void show() throws Exception {
		System.out.println("1-修改学生信息；2-修改课程信息；0-退出");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		switch (option) {
		case "1":{
			StudentBiz sc = new StudentBiz();
		    sc.modifyPassword();
		break;
		}
		case "2":{
			CourseBiz cr = new CourseBiz();
			cr.modifyPassword();
			break;
		}
		}
		
	}
}
