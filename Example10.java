
public class Example10 {

	public static void main(String[] args) throws Exception{
		// TODO �Զ����ɵķ������
Thread t=new Thread(new EmergencyThread(),"�߳�һ");
t.start();
for(int i=1;i<6;i++) {
	System.out.println(Thread.currentThread().getName()+"���룺"+i);
	if(i==2) {
		t.join();
	}
	Thread.sleep(500);
}
	}

}
class EmergencyThread implements Runnable{
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println(Thread.currentThread().getName()+"���룺"+i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
