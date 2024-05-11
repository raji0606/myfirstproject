package Assignmenttwo;

public class GreatestSmallest {
	public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 8,9,14};
	        int min = array[0]; // Assume the first element as the minimum
	        int max = array[0]; // Assume the first element as the maximum
	        
	        // Iterate through the array to find the minimum and maximum elements
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        System.out.println("The smallest element in the array is: " + min);
	        System.out.println("The largest element in the array is: " + max);
	    }
	}



