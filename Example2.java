
public class Example2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
MyThread mythread=new MyThread();
mythread.start();
while(true) {
	System.out.println("main���еķ���������");
}
	}

}
class MyThread extends Thread{
	public void run() {
		while(true) {
			System.out.println("MyThread���еķ���������");
		}
	}
}
