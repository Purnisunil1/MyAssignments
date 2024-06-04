package homeAssignments;

public class FindPalindrome {

	public static void main(String[] args) {
		// Find the number is Palindrome number
		
		int num = 141, reversedNum = 0, remainder;
	    
	    // store the number to originalNum
	    int originalNum = num;
	    
	    // get the reverse of originalNum
	    // store it in variable
	    while (num != 0) {
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;
	      num /= 10;
	      System.out.println("ReverseNum"+reversedNum);
	      System.out.println("num"+num);
	    }
	    //Comparing Original Num to reverse Num
	    if (originalNum == reversedNum) {
	        System.out.println(originalNum + " is Palindrome.");
	      }
	      else {
	        System.out.println(originalNum + " is not Palindrome.");
	      }
	}
	
}
