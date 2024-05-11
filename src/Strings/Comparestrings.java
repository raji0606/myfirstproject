package Strings;

public class Comparestrings {
	// 1. Write a java program to compare two strings, ignoring case differences.​
		public static void main(String[] args) {
			
			String str="Hello World";
			String str1="Hello world";
			
			boolean isEqual = str.equals(str1);
			System.out.println("Strings are equal" +isEqual);
			
			//equalsignorecase
		    boolean isequalsIgnoreCase = str.equalsIgnoreCase(str1);
		    System.out.println("Strings comparision with equalsIgnoreCase: " + isequalsIgnoreCase);

			
		}
			

}
