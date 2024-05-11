package Assignmenttwo;
import java.util.Scanner;

public class Studentsaverage {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] [] score = new int[2][3];
		
		for(int i=0;i<2;i++) {
			System.out.println("Score for students:" +(i+1) );
			for(int j=0;j<3;j++) {
				System.out.println("Enter score of paper:" +(j+1));
				score[i][j] = scan.nextInt();
				
			}
		}
		for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += score[i][j];
            }
            int average = (int) sum / 3;
            System.out.println("Average score for student " + (i+1) + ": " + average);
        }
		scan.close();
		
		
		
	}
	}



		
		
		
		
		
				
		
		
	


