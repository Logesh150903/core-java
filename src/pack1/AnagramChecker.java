package pack1;
import java.util.Arrays;

public class AnagramChecker {

    public static void main(String[] args) {
        String phrase1 = "Desperation";
        String phrase2 = "A Rope Ends It";
        
        boolean isAnagram = areAnagrams(phrase1, phrase2);
        if (isAnagram) {
            System.out.println("\"" + phrase1 + "\" can be rearranged to \"" + phrase2 + "\"");
        } else {
            System.out.println("\"" + phrase1 + "\" cannot be rearranged to \"" + phrase2 + "\"");
        }
    }

    public static boolean areAnagrams(String s1, String s2) {
        // Remove white spaces and convert to lower case
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        
        // Convert strings to char arrays
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        
        // Sort the char arrays
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        // Compare the sorted arrays
        return Arrays.equals(array1, array2);
        
    }
    
//        String str1="dog";
//        String str2="god";
//        
//        str1=str1.toLowerCase();
//        str2=str2.toLowerCase();
//        if(str1.length() == str2.length())
//        {
//            char[] charArray1=str1.toCharArray();
//            char[] charArray2=str2.toCharArray();
//            Arrays.sort(charArray1);
//            Arrays.sort(charArray2);
//          Boolean result=Arrays.equals(charArray1,charArray2);
//          if(result) {
//              System.out.println("The given string is Anagram " +str1+" And "+str2);
//          }
//          else
//          {
//              System.out.println("The given string is not an Anagram" +str1+" And "+str2);
//          }
//  }
}
