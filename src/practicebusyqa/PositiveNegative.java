package practicebusyqa;
import java.util.Scanner;
public class PositiveNegative {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Print Positve or Negative:");
		int num= scan.nextInt();
		if(num >0) {
			System.out.println("Print Positve");
			
		}
		else if(num<0) {
			System.out.println("Negative");
			
		}
		else {
			System.out.println("Zero");
		}
	
	}
		

}
