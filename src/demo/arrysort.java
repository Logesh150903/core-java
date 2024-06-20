package demo;

import java.util.Arrays;

public class arrysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {11,2,5,1};
        Arrays.sort(a);
        System.out.println("My array"+Arrays.toString(a));
        
////        String str[]= {"zeba","anu","priya","keya","diya","Anya","Niya","meera"};
////        Arrays.sort(str);
//    System.out.println("My  String array"+Arrays.toString(str));
        //Bubble sort algorithm
        System.out.println("My sorted Array:");
          for (int i = 0; i < a.length; i++) {
              for (int j = i + 1; j < a.length; j++) {
                int temp = 0;
                if (a[i] > a[j]) {
                  temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
                }
              }      
              System.out.println(a[i]);  
}


	}

}
