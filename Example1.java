
public class Example1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
MyThread myThread=new MyThread();
myThread.start();
while(true) {
	System.out.println("�߳�1");
	
}
	}
}
class MyThread extends Thread{
	public void run() {
		while (true) {
			System.out.println("�߳�2");
		}
	}
}

