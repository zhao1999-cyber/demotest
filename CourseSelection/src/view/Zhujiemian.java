package view;

import java.util.Scanner;

public class Zhujiemian {
	public static void show() throws Exception {
		System.out.println("1-ע����Ϣ��2-�޸���Ϣ��3-ѡ�Σ�4-��¼��0-�˳�");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		switch (option) {
		//ע��
		case "1":
			Zhucejiemian.show();
			break;
		//�޸�����	
		case "2":
			Xiugaimimajiemian.show();
			break;
		//ѡ��	
		case "3":
			 Xuankejiemian.show();
			break;
		//��¼
		case "4":
			Loadjiemian.show();
		}
	}
}
