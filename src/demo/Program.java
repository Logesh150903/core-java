package demo;

public class Program extends Addion{
    public static void main(String agmts[]) {
    int a = 64;
    int b = 13;
 
    // The add () method is not accessible directly be instantiating the class
    Addion cal = new Addion();
   int sum = cal.additionOfNums(a,b);
   System.out.println("Addition: " + sum);
 
    // The Calculate class is inherited, 
   //so we can access it by creating object in main()
    Program prog = new Program();
    int sum1 = prog.additionOfNums(a,b);//additionofNum-->protected
 
   
    System.out.println("We get: " + sum1);
    }
}