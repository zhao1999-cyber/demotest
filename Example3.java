//ʵ��Runnable�ӿ�
public class Example3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
MyThread mythread=new MyThread();
Thread thread=new Thread(mythread);
thread.start();
while(true) {
	System.out.println("main��ķ���������");
}
	}

}
class MyThread implements Runnable{
	public void run() {
		while(true) {
			System.out.println("MyThread���еķ���������");
		}
	}
}
