package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileMegre {

	public static void main(String[] args) throws IOException {
		String line, content = "";
        FileReader fr = new FileReader("f:/file1.txt");
        BufferedReader br = new BufferedReader(fr);
        FileReader fr1 = new FileReader("f:/file2.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        
         for(line=br.readLine(); line!=null; line=br.readLine())
                content = content + line + "\n";
             br.close();
//             System.out.println(content);
             
              for(line=br1.readLine(); line!=null; line=br1.readLine())
                content = content + line + "\n";
             br1.close();
//             System.out.println(content);
             File f=new File("f:/demo11982.txt");
 	        FileOutputStream fos=new FileOutputStream(f);
 	        byte b[] = content.getBytes();
 	        fos.write(b);
 	        
 	        System.out.println("Content Written Successfully.");
 	     //Read the content
	        FileInputStream fis = new FileInputStream("f:/demo11982.txt");
	        System.out.println("Fie Content.");
	        int i = fis.read();
	        System.out.println();
	        while (i != -1) {//-1-->end of file
	            System.out.print((char)i);
	            i = fis.read();
	        }
	    
	}

}
