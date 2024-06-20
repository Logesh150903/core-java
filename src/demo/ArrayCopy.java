package demo;

public class ArrayCopy {
    public static void main(String[] args) {
        int intArray[] = {0,1,2,3,4,5,6,7,8,9}; 
         
        int cloneArray[] = intArray.clone(); 
         
        // Deep copy is created following print statement will print false 
        //Deep copy-->single dimension-->original array and copy array adderes  are diffrent
        System.out.println(intArray == cloneArray); 
         
        for (int i = 0; i < cloneArray.length; i++) { 
        System.out.print(cloneArray[i]+" "); 
        }
        //Multidimensional
        //shallow copy-->address are same
        int intArray1[][] = {{1,2,3,4,5},{6,7,8,9,10}}; 
         
        int cloneArray1[][] = intArray1.clone(); 
         
        // shallow copy is created following print statement will print true 
        System.out.println(intArray1[0][0] == cloneArray1[0][0]); 
        System.out.println(intArray1[1] == cloneArray1[1]);
        
    }
}