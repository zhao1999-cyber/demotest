package 简单工厂模式;

public class TVFactory{
	public static TV produceTV(String brand) {
		if(brand.equals("HaierTV"))
			return new HaierTV();
		if(brand.equals("HisenseTV"))
			return new HisenseTV();
		return null;
	}
}