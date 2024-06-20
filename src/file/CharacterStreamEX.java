package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamEX {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("f:/demo11983.txt");
		fw.write("...Hello Everyone 11981,11982 and 11983 JFS learners...Java Full Stack...Java provides I/O Streams to read and write data where, a Stream represents an input source or an output destination which could be a file, i/o devise, other program etc. InputStream − This is used to read (sequential) data from a source");
		fw.close();
		System.out.println("Content Written Successfully.");
		FileReader freader= new FileReader("f:/demo11983.txt");
		BufferedReader breader = new BufferedReader(freader);
		
		int records;  
		System.out.println("My Content:");
//		while ((records= freader.read())!=-1)
		while ((records= breader.read())!=-1){
			System.out.print((char) records);
		}
		breader.close();
		freader.close();
	}

}
