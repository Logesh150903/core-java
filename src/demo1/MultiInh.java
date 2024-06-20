package demo1;
interface Parentt1{
	//Interface-->java not support multiple inheritance
	//Combination of abstract,default and static method
	//interface-->class(implements)
	//interface->interface(extends)
	void display1();
	default void parent1() {
		System.out.println("default for parent1");
	}
	static void staticParent1() {
		System.out.println("static for parent1");
	}
}
interface Parentt2{
	void display();//abstract -->method without body
}
class Childd implements Parentt1,Parentt2{
	@Override
	public void display() {
		System.out.println("display for parent2");
		
	}
	@Override
	public void display1() {
		System.out.println("display for parent1");
		
	}
	}
class Childd1 implements Parentt1{

	@Override
	public void display1() {
		System.out.println("display1 childd1 implmentation");
		
	}
	
}
class Childd2 implements Parentt1{

	@Override
	public void display1() {
		System.out.println("display1 childd2 implmentation");
		
	}
	
}
public class MultiInh {

	public static void main(String[] args) {
		Childd c=new Childd();
		c.display();
		c.display1();
		c.parent1();
		Parentt1.staticParent1();
		Childd1 c1=new Childd1();
		c1.display1();
		Childd2 c2=new Childd2();
		c2.display1();
	}
}