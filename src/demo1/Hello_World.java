package demo1;
interface ABC
	{
		public void print_ABC();
	}
interface XYZ
	{
		public void print_XYZ();
	}
interface PQR extends ABC, XYZ
	{
		public void print_PQR();
	}
class child implements PQR{

	@Override
	public void print_ABC() {
		System.out.println("Cooking");
		
	}

	@Override
	public void print_XYZ() {
		System.out.println("Emerging Technology");
		
	}

	@Override
	public void print_PQR() {
		System.out.println("IoT");
		
	}
	
}
public class Hello_World{
	public static void main(String[]args) {
		child d = new child();
		d.print_ABC();
		d.print_XYZ();
		d.print_PQR();
	}
}

