package demo1;

public class ClassFound {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("demo1.Book");
		System.out.println("class found");
	}

}
