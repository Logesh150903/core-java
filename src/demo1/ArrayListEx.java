package demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListEx {

	public static void main(String[] args) {
		  ArrayList<String> al=new ArrayList<>();
//		  Vector<String>al=new Vector<String>();
//		  
;	        al.add("Deepa");
	        al.add("Logesh");
//	        al.add(null);
	        al.add("Rohit");
	        al.add("M.daisy");
//	        al.add(null);
	        al.add(0,"Rajan");
	        System.out.println("Array List : "+al);
	        System.out.println("Array List size : "+al.size());
	        System.out.println("Array List Get : "+al.get(2));
	        al.set(2, "Yuvraj");//update
	        System.out.println("Array List : "+al);
	        Collections.sort(al);
	        System.out.println("Sorted Array List : "+al);
	        ArrayList< String> al1=new ArrayList<>();
	        al1.add("Meera");
	        al1.addAll(al);
	        al1.add("Sneha");
	        
	        System.out.println("Array List 2 : "+al1);
	        al1.removeAll(al);
	        System.out.println("Array List2 after remove : "+al1);
	        
	        ArrayList<Integer> listNum=new ArrayList<>();
	        listNum.add(10);
	        listNum.add(3);
	        listNum.add(15);
	        System.out.println("List num : "+listNum);
	        System.out.println("*****Enhance for loop");
	        for(String alist:al) {
	            System.out.println(alist);
	        }
	        List<String> list = Arrays.asList("Doc", "Grumpy", "Happy", 
                    "Sleepy", "Dopey", "Bashful", "Sneezy");
            
            System.out.println("List to Array example in Java 8:");
            
            Object[] objects = list.toArray();
            System.out.println(Arrays.toString(objects));
            
            String[] array = list.toArray(new String[list.size()]);
            System.out.println(Arrays.toString(array));
            System.out.println("Traversal using Enumeration");
//	        Enumeration<String> e = al.elements();
//	        while (e.hasMoreElements()) {
//	           System.out.print(e.nextElement()+"  ");
//	        }
	        ListIterator<String> lt= al.listIterator();
	        while (lt.hasNext()) {
	            System.out.println(lt.next());
	        }
	}

}
