package Assignmenttwo;

public class Missing {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,8,9,14};
		
		int size =array.length;
		
		int total = 0;
		
		for(int i=0;i<size;i++) {
			
			System.out.println(array[i]+",");
			total = total +array[i];
		}
		
		System.out.println();
		
		
		array[4]=0;
		
		System.out.println("Remove the 5th number from the list");
		
		
		int temp_no =0;
		for(int i =0 ; i<size;i++) {
			temp_no = temp_no +array[i];
			
		}
		
		int missing_no = total - temp_no;
		
		System.out.println("Missing value s:" +missing_no);
		
	}
}

		
	
			
