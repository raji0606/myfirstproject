package practicebusyqa;
import java.util.Scanner;
public class Reverseno {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int reverseNumber = 0;
	        int remainder;

	        // Reversing the number using a while loop
	        while (number != 0) {
	            remainder = number % 10;
	            reverseNumber = reverseNumber * 10 + remainder;
	            number /= 10;
	        }

	        System.out.println("Reversed number: " + reverseNumber);

	        scanner.close();
	    }
	}



