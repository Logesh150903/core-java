package file;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileCopyExample {
	public static void main(String[] args) {
        // Define source and destination file paths
        String sourceFile = "f:/file1.txt";
        String destinationFile = "f:/file2.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            
            byte[] buffer = new byte[1024];
            int length;

            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred during the file copy process.");
            e.printStackTrace();
        }
    }
}