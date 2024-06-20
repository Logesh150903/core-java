package demo;

import java.util.Arrays;

class  Vtype{
    static int aa=23;
    static void display2() {
        int cc=24;
        System.out.println("CC :"+cc);
    }
}
public class VariableTypesEx {
    int a;//I Instance
    static int b=20;//static
    void display() {
        int c=3;
        System.out.println("C :"+c);
    }
    static void display1() {
        int cc=23;//Local
        System.out.println("CC :"+cc);
    }
    public static void main(String[] args) {
        VariableTypesEx v=new VariableTypesEx();
        v.a=15;
        System.out.println("A : "+v.a);
        System.out.println("B : "+b);
        System.out.println("AA : "+Vtype.aa);
        v.display();
        display1();
        Vtype.display2();
        
        int arr[] = { 1,5,7,8,9,12,45};
        
        int key1= 9;
        
        int foundItemIndex1 = Arrays.binarySearch(arr, key1);
        
        System.out.println("The given int is at index: " + foundItemIndex1);

        
        
    }
}
