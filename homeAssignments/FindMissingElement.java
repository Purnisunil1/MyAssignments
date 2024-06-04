package homeAssignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// Find Missing element in an array
		
		int[] a= {1,4,3,2,8,6,7}; 
		
		Arrays.sort(a);
		//1,2,3,4,6,7,8
		for(int i= 1; i<a.length-1; i++) {
			if(i != a[i-1]) {
				System.out.println("Missing element is "+ i);
				break;	
			}
			} 

	}

}
