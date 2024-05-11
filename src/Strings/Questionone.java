package Strings;
import java.util.Scanner;
public class Questionone {
	// 3. Get the length of a given string
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("enter the String:");		
		String str  = scan.nextLine();
		//System.out.println("enter the String:");
		
						
		int length = str.length();
		System.out.println("Length of the string: " +length);
		
		scan.close();
		
	}

}
