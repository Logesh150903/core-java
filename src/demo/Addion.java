package demo;

public class Addion {
	public int add(int a,int b) {
        return a+b;
    }
    public int mul(int a,int b) {
        return a*b;
    }
    protected int additionOfNums(int a, int b) {
        return a+b;
    }    

    public static void main(String[] args) {
        Addion a=new Addion();
        System.out.println("Addiotn :"+a.add(10,20));
    }
    
}