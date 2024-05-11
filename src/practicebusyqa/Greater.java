package practicebusyqa;
import java.util.Scanner;
public class Greater {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		      System.out.println("Enter three numbers");

		       int a = scan.nextInt();
		        int b = scan.nextInt();
		        int c = scan.nextInt();
		      		     int greatest = a;
		        if (b > greatest) {
		            greatest = b;
		        }
		        if (c > greatest) {
		            greatest = c;
		        }

		        System.out.println("The greatest number among "+ a+","+b+", and"+c+"is:" + greatest);

		 
		    }
		}

				

