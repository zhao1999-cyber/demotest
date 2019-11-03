
public class Example2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
MyThread mythread=new MyThread();
mythread.start();
while(true) {
	System.out.println("main类中的方法在运行");
}
	}

}
class MyThread extends Thread{
	public void run() {
		while(true) {
			System.out.println("MyThread类中的方法在运行");
		}
	}
}
