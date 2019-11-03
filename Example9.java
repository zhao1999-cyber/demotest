class YieldThread extends Thread{
	public YieldThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"---"+i);
			if(i==3) {
				System.out.println("线程让步：");
				Thread.yield();
				
				
			}
		}
	}
}
public class Example9 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Thread t1=new YieldThread("线程A");
Thread t2=new YieldThread("线程B");
t1.start();
t2.start();
	}

}
