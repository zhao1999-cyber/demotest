package view;

import java.util.Scanner;
import biz.*;

//�޸�����
public class Xiugaimimajiemian {
	
	public static void show() throws Exception {
		System.out.println("1-�޸�ѧ����Ϣ��2-�޸Ŀγ���Ϣ��0-�˳�");
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
