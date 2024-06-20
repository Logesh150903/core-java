package file;

import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) throws IOException {
        File newFile = new File("C:/Users/LOGESHKUMAR/eclipse-workspace/demo/src/file/destination.txt"); 
        //File newFile=new File("C:\Users\LOGESHKUMAR\eclipse-workspace\demo\src\file");
        
//        File newFile=new File("F:/demo11982.txt") ;
        if(newFile.createNewFile())    {
            System.out.println("File created.");
        } else {
        System.out.println("File exists.");
    }
    }
    
}