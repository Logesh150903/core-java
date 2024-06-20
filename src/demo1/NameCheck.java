package demo1;

import java.util.Scanner;

class NameCheckException1 extends Exception{
	public NameCheckException1(String msg) {
		super(msg);
	}
}
public class NameCheck {
	String NameCheck(String firstname,String lastname) throws NameCheckException1{
		if(firstname.isEmpty()) {
			throw new NameCheckException1("Invalid fristname");
		}
		else if (lastname.isEmpty()) {
			throw new NameCheckException1("Invalid lastname");
		}
		else {
			return firstname+lastname;
		}
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		NameCheck m= new NameCheck();
		String result;
		System.out.println("Enter the firstname");
		String a=s.next();
		System.out.println("Enter the lastname");
		String b=s.next();
		try {
			result=m.NameCheck(a,b);
			System.out.println(result);
		} catch (NameCheckException1 e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
