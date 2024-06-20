package demo;

public class Student {
	int rno;
    public Student () {
        rno=10;
        System.out.println("Defalut constructor: "+rno);
    }
    public Student (int rno) {
        this.rno=rno;
        System.out.println("Paramerterised constructor: "+rno);
    }
    public Student (Student  l) {
        rno=l.rno;
        System.out.println("copy constructor: "+rno);
    }
    public static void main(String[] args) {
        Student  l=new Student ();
        Student  l1=new Student (20);
        Student  l2=new Student (l1);
	}

}
