
public class Example2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
MyThread1 myThread=new MyThread1();
Thread thread=new Thread(myThread);
thread.start();
for(int i=0;i<100;i++) {
	System.out.println("main");
}
	}

}
class MyThread1 implements Runnable{
	public void run() {
		for(int j=0;j<50;j++) {
			System.out.println("new");
		}
	}
}
