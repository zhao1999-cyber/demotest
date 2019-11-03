//单例程序
public class Example1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
MyThread mythread=new MyThread();
mythread.run();
while(true) {
	System.out.println("main类的方法在运行");
}
	}
}
	class MyThread{
		public void run() {
			while(true) {
				System.out.println("MyThread类中的方法在运行");
			}
		}
	}


