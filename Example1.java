//��������
public class Example1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
MyThread mythread=new MyThread();
mythread.run();
while(true) {
	System.out.println("main��ķ���������");
}
	}
}
	class MyThread{
		public void run() {
			while(true) {
				System.out.println("MyThread���еķ���������");
			}
		}
	}


