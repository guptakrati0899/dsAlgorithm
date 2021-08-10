package dsAlgorithm;

import java.util.Arrays;

public class Anagram {
	
	
	public static void main(String[] args) {
		
		String string1 = "Earth";
		String string2 = "Heart";
		
		 char[] s1Array = string1.toLowerCase().toCharArray();
		 char[] s2Array = string2.toLowerCase().toCharArray();
		 
		 
		 Arrays.sort(s1Array);
		 Arrays.sort(s2Array);
		 
		 
		 boolean status = Arrays.equals(s1Array, s2Array);
		 
		 if(status) {
			 System.out.println("The two strings are anagram of each other");
		 }
		 else {
			 System.out.println("The two strings are not anagram of each other");
		 }
	}

}
