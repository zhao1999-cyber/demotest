
public class Example1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
MyThread myThread=new MyThread();
myThread.start();
while(true) {
	System.out.println("线程1");
	
}
	}
}
class MyThread extends Thread{
	public void run() {
		while (true) {
			System.out.println("线程2");
		}
	}
}

