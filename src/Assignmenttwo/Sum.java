package Assignmenttwo;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Calculate sum values of an array:");
		int[] array = new int [5];
		                      
		
		array[0]= scan.nextInt();
		array[1]= scan.nextInt();
		array[2]= scan.nextInt();
		array[3]= scan.nextInt();
		array[4]= scan.nextInt();
		
		
		System.out.println(array[0]+array[1]+array[2]+array[3]+array[4]);
		scan.close();
		
	}
	
	    
	}