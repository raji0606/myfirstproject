
package Assignmenttwo;

public class Evenodd {

	    public static void main(String[] args) {
	    	int[] array = {1, 2, 3, 4, 8,9,14};

	        System.out.println("Even numbers in the array:");
	        for (int num : array) {
	            if (num % 2 == 0) {
	                System.out.println(num);
	            }
	        }

	        System.out.println("\nOdd numbers in the array:");
	        for (int num : array) {
	            if (num % 2 != 0) {
	                System.out.println(num);
	            }
	        }
	    }
	}


