package demo1;
class PrivateDemo{
    private int b;
}
public class PrivateClass {
    private int a=10;
    private PrivateClass() {
        System.out.println("Private constructor");
    }
    private void msg() {
        System.out.println("Msg method");
    }
    public static void main(String[] args) {
        PrivateDemo p1=new PrivateDemo();
        //p1.b=20;-->error not accessible
        PrivateClass p=new PrivateClass();
        System.out.println("Value of a : "+p.a);
        p.msg();
    }
}
