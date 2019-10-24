
public class Example3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
TaxiDriver td=new TaxiDriver();
new Thread(td,"出租车1").start();
new Thread(td,"出租车2").start();
new Thread(td,"出租车3").start();
new Thread(td,"出租车4").start();
new Thread(td,"出租车5").start();
	}

}
class TaxiDriver implements Runnable{
	private int passagers=100;
	public void run() {
		while(true) {
			if(passagers>0) {
				Thread th =Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"正在接送第"+passagers--+"位乘客");
			}
		}
	}
}