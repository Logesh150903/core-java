package pack2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	String sname;
	private int sid;
	LocalDate sdob;
	public Student(String sname, int sid, LocalDate sdob) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.sdob = sdob;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", sdob=" + sdob + "]";
	}
	
}
class SortName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.sname.compareTo(o2.sname);
	} 
	
}
class Sortbydob implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.sdob.compareTo(o2.sdob);
	} 
	
}
public class ComparatorEX {

	public static void main(String[] args) {
		ArrayList<Student> alist= new ArrayList<>();
		alist.add(new Student("logi", 1, LocalDate.of(2000,02,13)));
		alist.add(new Student("kjgj", 2 ,LocalDate.of(2003,10,18)));
		alist.add(new Student("asdfgkj", 3, LocalDate.of(2012,10,15)));
		alist.add(new Student("ouebuf", 4, LocalDate.of(2020,02,20)));
		System.out.println("alist"+alist);
		Collections.sort(alist,new SortName());
//		for(<Student> s: alist) {
//			System.out.println(s);
//		}
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		System.out.println("Sort by dob");
		Collections.sort(alist,new Sortbydob());
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
	}

}
