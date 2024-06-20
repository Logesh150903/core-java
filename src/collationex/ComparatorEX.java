package collationex;

import java.time.LocalDate;
import java.util.ArrayList;

class Student{
	private String sname;
	private int sid;
	private LocalDate sdob;
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
public class ComparatorEX {

	public static void main(String[] args) {
		ArrayList<Student> alist= new ArrayList<>();
		alist.add(new Student("logi", 1, LocalDate.of(2000,02,13)));
		alist.add(new Student("kjgj", 2 ,LocalDate.of(2003,10,18)));
		alist.add(new Student("asdfgkj", 3, LocalDate.of(2012,10,15)));
		alist.add(new Student("ouebuf", 4, LocalDate.of(2020,02,20)));
		System.out.println("alist"+alist);
	}

}
