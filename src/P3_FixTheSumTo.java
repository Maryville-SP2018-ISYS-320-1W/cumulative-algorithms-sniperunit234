/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
3. What problems did you identify in the sumTo method below?

there needed to be a return statement so it can run correctly
*/

public class P3_FixTheSumTo {

	public static void main(String[] args) {
		int totalSum = sumTo( 5 );
		System.out.println("The total sum is: " + totalSum );

	}
	
	public static int sumTo(int n) { 
	    for (int i = 1; i <= n; i++) {
	        int sum = 0; 
	        sum += i;
	    }
		return n;
	}

}
