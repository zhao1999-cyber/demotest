
public class Animal {
String name;
void shout() {
	System.out.println("���﷢������");
	
}
class Dog extends Animal{
	public void printName() {
		System.out.println("name="+name);
		}
}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
Dog dog=new Dog();
dog.name="ɳƤ��";
dog.printName();
dog.shout();
	}

}
