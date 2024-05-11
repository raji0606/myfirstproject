package practicebusyqa;
import java.util.Scanner;
public class Palindrome {
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = scan.nextInt();

	        int originalNumber = num;
	        int reversedNumber = 0;
	        int remainder;

	        // Reversing the number
	        while (num != 0) {
	            remainder = num % 10;
	            reversedNumber = reversedNumber * 10 + remainder;
	            num /= 10;
	        }

	        // Checking if the original number is equal to the reversed number
	        if (originalNumber == reversedNumber) {
	            System.out.println(originalNumber + " is a palindrome.");
	        } else {
	            System.out.println(originalNumber + " is not a palindrome.");
	        }

	        
	    }
	}


