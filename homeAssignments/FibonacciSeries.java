package homeAssignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		//Print Fibonacci series
		int input=8;
		int n1=0, n2=1, n3;
		
		System.out.println(n1+"\n"+n2);
		
		for(int i=2;i<input;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}	
		
	}

}
