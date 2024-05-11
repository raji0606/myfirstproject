package practicebusyqa;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scan.nextInt();
	        int a  = 1;
	        for (int i = 1; i <= number; i++) { // 4! = 4*3*2*1 
	            a *= i;
	        }

	        System.out.println("Factorial of " + number + " is: " + a);

	     
	    }
	}


