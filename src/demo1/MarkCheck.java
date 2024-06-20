package demo1;
class MarkCheckException1 extends Exception{
	public MarkCheckException1(String msg) {
		super(msg);
	}
}
public class MarkCheck {
String checkMark(int mark) throws MarkCheckException1  {
	if(mark<0) {
		throw new MarkCheckException1("Invalid mark");
	}
	return"Valid mark";
}
	public static void main(String[] args) {
		MarkCheck m=new MarkCheck();
		String result;
		try {
			result=m.checkMark(55);
			System.out.println(result);
		} catch (MarkCheckException1 e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
