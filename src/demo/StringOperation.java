package demo;

import java.util.Arrays;

public class StringOperation {
	//Immutable-->can't change content of string
		public static void main(String[] args) {
			String str = "Black Bunny Balck Bunny";
		    String str1 = "black Bunny Balck Bunny";
//			String str11="black bunny";
			String str2 = "   Pink   ";//10
			
			String stn=new String("welcome");
			System.out.println("Length : "+stn.length());
			System.out.println("Length : "+str.length());
//////			System.out.println("Length of string is: " + str1.length());
//			System.out.println("UpperCase :" + str.toUpperCase());
//			System.out.println("LowerCase :" + str.toLowerCase());
//		    System.out.println("Is both strings are equal: " + str.equals(str1));
//			System.out.println("Is both strings are equal: " + str.equalsIgnoreCase(str1));
//			System.out.println("Concate string: " + str.concat(" Cloud"));
////			
			System.out.println("Index of c: " + str.indexOf("Bunny"));
			System.out.println("Index of Bunny: " + str.lastIndexOf("Bunny"));
			String se1="Hello, I am Fine Hello how are you How do u do?";
			System.out.println("Index of H: " + se1.indexOf("How"));
			System.out.println("Last Index of H: " + se1.lastIndexOf("How"));
		System.out.println("Index of c: " + str.lastIndexOf("Bunny"));
			System.out.println("Last Index of c: " + str.lastIndexOf('c'));
			System.out.println("Index of a: " + str.indexOf('B'));
			System.out.println("Last Index of a: " + str.lastIndexOf('B'));
			System.out.println("replace string: " + str.replace("Black", "Pink"));
		System.out.println("contains of Z: " + str.contains("z"));
		System.out.println("contains of B: " + str.contains("B"));
			System.out.println("Substring: " + str.substring(6, 11));
			System.out.println("length of str :" + str2.length());
			System.out.println("trim :" + str2.trim());
			System.out.println("length of str after trim :" +str2.trim().length());
			String str3 = str2.trim();
			System.out.println("length :" + str3.length());
//			String str4 = "How , are , you?";
//			String arrStr[] = str4.split(",", 3);
//			System.out.println("Splited Elements:");
//			for (int i = 0; i < arrStr.length; i++) {
//				System.out.println(arrStr[i] + " ");
//			}
//			System.out.println();
//			System.out.println("Splited Elements using for each loop:");
//			for (String str5 : arrStr) {
//				System.out.print(str5 + " ");
//			}
//			String str6 = "";
//			System.out.println("Length:" + str6.length());//0
//			System.out.println("is String is empty: " + str6.isEmpty());//if length is 0-->true
//			System.out.println("is String is blank: " + str6.isBlank());//lefgth zero or white space
//			String str7 = "   ";
//			System.out.println("Str 7 Length:" + str7.length());
//			System.out.println("is String is empty: " + str7.isEmpty());//when length is 0-->then isEmpty()->true
//			System.out.println("is String is blank: " + str7.isBlank());
//			System.out.println("java".compareToIgnoreCase("PYTHON"));
//			System.out.println("a".compareTo("A"));
//			System.out.println("Cooking".endsWith("king"));
//			System.out.println("Cooking".startsWith("Co"));
//	
//			String str111 = "     java      ";
//			String str21 = "C++";
//		System.out.println(str1.trim());
//			System.out.println(str1.strip());
//		System.out.println("leading: " + str1.stripLeading());
//			System.out.println("trailing: " + str1.stripTrailing());
//			System.out.println("repeat: " + str2.repeat(2));
//	//////
//			String s1 = "JAVA Programs";
//			char str31[] = new char[12];
//			s1.getChars(0, 11, str31, 0);
//			System.out.println("**getChars method: " + Arrays.toString(str31));
//			System.out.println(s1.toCharArray());
//
//			StringBuffer sb=new StringBuffer("Hi "); //Mutable:we can change-->synchronization 
//	        //StringBuilder sb=new StringBuilder("Hello");
//	        System.out.println("My String Before append  : "+sb);
//	        sb.append("Everyone");
//	        System.out.println("My String after append  : "+sb);
//	        //System.out.println("Reverse String : "+sb.reverse());
//	        sb.insert(4, "learner");
//	        System.out.println("My String after insert  : "+sb);
//	        sb.delete(4, 10);
//	        System.out.println("My String after delete  : "+sb);
		}

	}