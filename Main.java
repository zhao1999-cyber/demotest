
public class Main {

	public static <TVFactory, TV> void main(String[] args, Object XMLUtil) {
		// TODO �Զ����ɵķ������
	TV tv;
	TVFactory factory;
	factory = (TVFactory)((Object) XMLUtil).getBean();
	tv=((Object) factory).produceTV();
	((Object) tv).play();
	
	
	}

}
