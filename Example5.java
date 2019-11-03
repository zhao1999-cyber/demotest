
public class Example5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TicketWindow tw=new TicketWindow();
		new Thread(tw,"窗口1").start();
		new Thread(tw,"窗口2").start();
		new Thread(tw,"窗口3").start();
		new Thread(tw,"窗口4").start();
	}

}
class TicketWindow implements Runnable{
	private int ticket=100;
	public void run() {
		while(true) {
			if(ticket>0) {
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"正在发售第"+ticket--+"张票");
			}
		}
	}
}
