package Assignmenttwo;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//input from user
    	//int val = scan.nextInt();
    	System.out.println("Enter the val");
    	
    	//declare the variable
    	
    	int sum =0;
    	int average;
    	//value from user to calculate
    	int values = scan.nextInt();
    	sum += values;
    	for(int i = 0;i<values;i++) {
    		System.out.println("Enter the value1:" +i);
    		
    	}
    	
    	average = sum /values;
    	
    	System.out.println("Average of the values:"+average);
    	scan.close();
    	
    	  
    	
    }
}
		
		
	
	
	  
	    	
	    	








