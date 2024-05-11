package practicebusyqa;
import java.util.Scanner;
public class Fibanosis {
    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the number of terms in the Fibonacci series: ");
	        int n = scan.nextInt();
	        int one = 0, two = 1;
	        System.out.println("Fibonacci Series:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(one + " ");
	            int next = one + two;
	            one = two;
	            two = next;
	        }

	      
	    }
	}


