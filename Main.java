
public class Main {

	public static <TVFactory, TV> void main(String[] args, Object XMLUtil) {
		// TODO 自动生成的方法存根
	TV tv;
	TVFactory factory;
	factory = (TVFactory)((Object) XMLUtil).getBean();
	tv=((Object) factory).produceTV();
	((Object) tv).play();
	
	
	}

}
