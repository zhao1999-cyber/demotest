package �򵥹���ģʽ;
public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TV tv;
		String brandName = XMLUtilTV.getBrandName();
		tv = TVFactory.produceTV(brandName);
		tv.play();

	}

}
