
public class Animal {
String name;
void shout() {
	System.out.println("动物发出叫声");
	
}
class Dog extends Animal{
	public void printName() {
		System.out.println("name="+name);
		}
}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Dog dog=new Dog();
dog.name="沙皮狗";
dog.printName();
dog.shout();
	}

}
