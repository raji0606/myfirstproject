package practicebusyqa;
import java.util.Scanner;
public class Switchcase {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the month number (1-12): ");
	        int month = scanner.nextInt();

	        int days;

	        switch (month) {
	            case 1: 
	            case 3: // March
	            case 5: // May
	            case 7: // July
	            case 8: // Aug
	            case 10: // Oct
	            case 12: // Dec
	                days = 31;
	                break;
	            case 4: // April
	            case 6: // June
	            case 9: // Sep
	            case 11: // Nov
	                days = 30;
	                break;
	            case 2: // February
	                days = 28; // assuming non-leap year
	                break;
	            default:
	                System.out.println("Invalid month number.");
	                return; // terminate the program
	                
	        }
	       

	        System.out.println("Number of days in month " + month + " is: " + days);

	        scanner.close();
	    }
	}



