class Input implements Runnable{
	private Storage st;
	private int num;
	Input (Storage st){
		this.st=st;
	}
	public void run() {
		while(true) {
			st.put(num++);
		}
	}
}
class Output implements Runnable{
	private Storage st;
	Output (Storage st){
		this.st=st;
	}
	public void run() {
		while(true) {
			st.get();
		}
	}
}
public class Example14 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Storage st=new Storage();
Input input=new Input(st);
Output output=new Output(st);
new Thread(input).start();
new Thread(output).start();
	}

}
