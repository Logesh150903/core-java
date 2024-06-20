package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileEX {
	public static void main(String[] args) {
        // Path to the file
        String filePath = "f:/demo11983.txt";

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Increment line count
                lineCount++;

                // Increment character count (including newline characters)
                charCount += line.length() + 1;

                // Tokenize the line to count words
                StringTokenizer tokenizer = new StringTokenizer(line);
                while (tokenizer.hasMoreTokens()) {
                    tokenizer.nextToken();
                    wordCount++;
                }
            }

            // Adjust charCount to exclude the last newline character
            if (lineCount > 0) {
                charCount--; // Remove the extra newline count from the last line
            }

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}