package demo1;

import java.util.ArrayList;
import java.util.Iterator;

public class ShowDetails {
	public static void main(String[] args) {
	        ArrayList<Student> students = new  ArrayList<>();

	        Student s1 = new Student(1, "Alice", 20);
	        Student s2 = new Student(2, "Bob", 22);
	        Student s3 = new Student(3, "Charlie", 23);

	        students.add(s1);
	        students.add(s2);
	        students.add(s3);
	        System.out.println("Students list:");
	        for (Student s : students) {
	            System.out.println(s);
	        }
	        for (Student s : students) {
	            if (s.getId() == 2) {
	                s.setAge(23);
	                s.setName("Robert");
	            }
	        }
	        System.out.println("\nAfter updating Bob's details:");
	        for (Student s : students) {
	            System.out.println(s);
	        }
	        Iterator<Student> iterator = students.iterator();
	        while (iterator.hasNext()) {
	            Student s = iterator.next();
	            if (s.getId() == 3) {
	                iterator.remove();
	            }
	        }
	        System.out.println("\nAfter deleting Charlie:");
	        for (Student s : students) {
	            System.out.println(s);
	        }
	}
}

