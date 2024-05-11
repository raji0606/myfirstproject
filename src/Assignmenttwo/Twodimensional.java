package Assignmenttwo;
import java.util.Scanner;
public class Twodimensional {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get the dimensions of the matrices from the user
	        System.out.print("Enter the number of rows for the matrices: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter the number of columns for the matrices: ");
	        int cols = scanner.nextInt();

	        // Create two matrices
	        int[][] matrix1 = new int[rows][cols];
	        int[][] matrix2 = new int[rows][cols];

	        // Input elements of the first matrix
	        System.out.println("Enter the elements of the first matrix:");
	       inputMatrixElements(scanner, matrix1);
	        

	        // Input elements of the second matrix
	        System.out.println("Enter the elements of the second matrix:");
	        inputMatrixElements(scanner, matrix2);

	        // Add the matrices
	        int[][] sumMatrix = addMatrices(matrix1, matrix2);

	        // Display the sum matrix
	        System.out.println("Sum of the matrices:");
	        displayMatrix(sumMatrix);

	        scanner.close();
	    }

	    // Method to input elements of a matrix
	    public static void inputMatrixElements(Scanner scanner, int[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[0].length; j++) {
	                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
	                matrix[i][j] = scanner.nextInt();
	            }
	        }
	    }

	    // Method to add two matrices
	    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows = matrix1.length;
	        int cols = matrix1[0].length;
	        int[][] sumMatrix = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	        return sumMatrix;
	    }

	    // Method to display a matrix
	    public static void displayMatrix(int[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[0].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}



