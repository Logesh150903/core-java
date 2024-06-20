package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable  {
	int sid;
	String sname;
	int marks;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s = new Student();
		s.sid=1;
		s.sname="abc";
		s.marks=55;
		FileOutputStream fos= new FileOutputStream("f:/logi2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		System.out.println("Object Serializable Done ");
		oos.close();
		fos.close();
		FileInputStream fis=new FileInputStream("f:/logi2.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		s=(Student) ois.readObject();
		ois.close();
		fis.close();
		System.out.println("Object DeSerializable Data ");
		System.out.println("sid: "+s.sid+"   sname: "+s.sname+"  marks: "+s.marks);
	}
}
