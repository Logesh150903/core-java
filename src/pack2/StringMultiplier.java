package pack2;
import java.math.BigInteger;
import java.util.Scanner;

public class StringMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input strings
        System.out.print("Enter the first number: ");
        String num1 = scanner.nextLine();
        System.out.print("Enter the second number: ");
        String num2 = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Multiply the numbers using BigInteger
        String result = multiplyStrings(num1, num2);
        
        // Print the result
        System.out.println(result);
    }

    // Method to multiply two numbers represented as strings
    public static String multiplyStrings(String num1, String num2) {
        // Use BigInteger for handling large numbers
        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);
        
        // Perform multiplication
        BigInteger product = number1.multiply(number2);
        
        // Return the result as a string
        return product.toString();
    }
}
