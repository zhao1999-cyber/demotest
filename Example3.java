//实现Runnable接口
public class Example3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
MyThread mythread=new MyThread();
Thread thread=new Thread(mythread);
thread.start();
while(true) {
	System.out.println("main类的方法在运行");
}
	}

}
class MyThread implements Runnable{
	public void run() {
		while(true) {
			System.out.println("MyThread类中的方法在运行");
		}
	}
}
