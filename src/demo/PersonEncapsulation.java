package demo;

class person{
	private int a;
	private String name;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}



public class PersonEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person();
		p.setA(5);
		p.setName("logeshkumar");
		System.out.println("ID: "+p.getA()+" "+"Name"+p.getName());
	}

}
