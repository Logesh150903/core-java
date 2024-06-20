package demo1;

class DefaultDemo{
    int c;
    DefaultDemo(int c) {
        System.out.println("Defaultdemo constructor "+c);
    }
    void display() {
        System.out.println("Display");
    }
}
class DefaultChild extends DefaultDemo{
    DefaultChild(int c) {
        super(c);
        System.out.println("Defaultchild constructor "+c);
    }
    void childMethod() {
        System.out.println("child method");
    }
    
}
public class DefaultClass {
	 int a=10;
	    DefaultClass() {
	     System.out.println("Default constructor");
	    }
	     void msg() {
	        System.out.println("Msg method");
	    }
	    public static void main(String[] args) {
	        DefaultClass d=new DefaultClass();
	        System.out.println("Value of a : "+d.a);
	        d.msg();
	        
	        DefaultChild dd=new DefaultChild(23);
	        dd.display();
	        dd.childMethod();
	}

}
