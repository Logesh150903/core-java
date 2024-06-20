package demo;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		int op;
        int number1, number2, result;
        Scanner input = new Scanner(System.in);
         System.out.println("Choose an operator: +,-,*,/");
       //  op = input.nextInt();
         char ch=input.next().charAt(0);
         System.out.println("Operator==>"+ch);
     
         // ask users to enter numbers
         System.out.println("Enter first number");
         number1 = input.nextInt();
         System.out.println("Enter second number");
         number2 = input.nextInt();
         switch (ch) {
           
           case '+':
             result = number1 + number2;
             System.out.println(number1 + " + " + number2 + " = " + result);
             break;
           case '-':
        	   result = number1 - number2;
               System.out.println(number1 + "- " + number2 + " = " + result);
               break;
           case '*':
        	   result = number1 * number2;
               System.out.println(number1 + "* " + number2 + " = " + result);
               break;
               
           case '/':
        	   result = number1 / number2;
               System.out.println(number1 + "/ " + number2 + " = " + result);
               break;
               
           default:
        	   System.out.println("Unexpected value: " + ch);
        	   break;

	}

}
}