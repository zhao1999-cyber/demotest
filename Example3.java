
public class Example3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
TaxiDriver td=new TaxiDriver();
new Thread(td,"���⳵1").start();
new Thread(td,"���⳵2").start();
new Thread(td,"���⳵3").start();
new Thread(td,"���⳵4").start();
new Thread(td,"���⳵5").start();
	}

}
class TaxiDriver implements Runnable{
	private int passagers=100;
	public void run() {
		while(true) {
			if(passagers>0) {
				Thread th =Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"���ڽ��͵�"+passagers--+"λ�˿�");
			}
		}
	}
}