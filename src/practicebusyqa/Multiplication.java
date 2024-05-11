package practicebusyqa;
import java.util.Scanner;
public class Multiplication {
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the number for multiplication table: ");
	        int num = scan.nextInt();

	        System.out.println("Multiplication table for: " );

	        // Printing multiplication table using a loop
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " * " + i + " = " + (num * i));
	        }

	        scan.close();
	    }
	}


