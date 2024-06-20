package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAndReadFile {

	public static void main(String[] args) throws IOException {
		 File f=new File("f:/demo11982.txt");
	        FileOutputStream fos=new FileOutputStream(f);//create file file22.txt in f:
	        //FileOutputStream fos = new FileOutputStream("f:/file2.txt");
	        String s = "...Hello Everyone 11981,11982 and 11983 learners...Java Full Stack...Java provides I/O Streams to read and write data where, a Stream represents an input source or an output destination which could be a file, i/o devise, other program etc. InputStream − This is used to read (sequential) data from a source";
	        byte b[] = s.getBytes();
	        fos.write(97);//a
	        fos.write(66);//B
	        fos.write(67);//C
	        fos.write(b);
	        
	        System.out.println("Content Written Successfully.");
	      //Read the content
	        FileInputStream fis = new FileInputStream("f:/demo11982.txt");
	        System.out.println("Fie Content.");
	        int i = fis.read();
	        //System.out.println((char) i);
	        System.out.println();
	        while (i != -1) {//-1-->end of file
	            System.out.print((char)i);
	            i = fis.read();
	        }
//	        fis.close();
	    
	}

}
