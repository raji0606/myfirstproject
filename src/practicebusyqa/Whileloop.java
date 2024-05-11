package practicebusyqa;
import java.util.Scanner;
public class Whileloop {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int count = 0;
	        int temp = number;

	        // Counting the number of digits using a while loop
	        while (temp != 0) {
	            temp /= 10;
	            count++;
	        }

	        System.out.println("Number of digits in " + number + " is: " + count);

	        scanner.close();
	    }
	}



