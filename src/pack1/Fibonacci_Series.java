package pack1;
public class Fibonacci_Series {

    static int n1=0,n2=1,n3=0;
    static void fibonaccicheck(int count){
            if(count>0){
                n3=n1+n2;
                n1=n2;
                n2=n3;
               System.out.print(" "+n3);
               fibonaccicheck(count-1);
            }
    }
            public static void main(String[] args) {
                  int count=10;
                   System.out.println(n1);
                   System.out.println(n2);
                   
                   fibonaccicheck(count-2);
                       }
                   }
