/**
 * This function implements Pascal table printing
 * https://en.wikipedia.org/wiki/Pascal%27s_triangle
 * @author harsh
 */
public class PascalTriangle implements IPattern {
	private final int doubleDigit = 9;
	/**
	 *
	 * Print the pascal triangle for n = 10
       	                        1   
		              1   1   
		            1   2   1   
		          1   3   3   1   
		        1   4   6   4   1   
		      1   5   10  10  5   1   
		    1   6   15  20  15  6   1   
		  1   7   21  35  35  21  7   1   
		1   8   28  56  70  56  28  8   1   
	 */
       // computes pascal number based on top two values
	public int computePascalNumber(int n, int k){
		int nFactor = n; //finds factors to add by
		int kFactor = k;
		int nminusK = n-k;
	
		if(k == 0 || n ==k) // if first iteration, give 1
			return 1;
		if(k ==1) // return value for second row
			return n;
		for(int i = (n-1); i > 0; i--) // repeat number down
			nFactor *= i;
		for(int j = (k-1); j > 0; j--) // repeat number down
			kFactor *= j;
		for(int l = (n-k-1); l >0; l--) // calculate middle value
			nminusK *= l;
		return
		nFactor/(kFactor*nminusK); // return pascal number
	}

	
	// prints pascal's triangle      
	@Override
	public String printPattern(int n) {
	   if (n == 0 || n < 0){
		return "";
	   }	
		String newVal = ""; // empty string
		for(int i = 0; i < n; i++){ // line iteration
		   for(int j = 0; j <= n-i; j++) // space iteration
			newVal += "  ";
		   for(int j = 0; j <= i; j++){ // number iteration
			int value = computePascalNumber(i, j);
		        if (value >= doubleDigit) // adds double digit space
				newVal += (value + "  ");
			else
				newVal += (value + "   ");
			}
		   newVal += "\n"; // skips line
		}
	return newVal; // returns pascals triangles
	}
	
	
	/**
	 * 	Print the 10th line of pascal triangle
	 	1,8,28,56,70,56,28,8,1
	 */
	@Override
	public String printNthItem(int n) {
	    if ( n == 0 || n < 0){
		return "";
	    }
		String newVal = ""; // empty string
		int row = n - 1;
		for(int i = 0; i <= row; i++){ // iterates through line
		    newVal += (computePascalNumber(row, i));
		    if (i != row)
			newVal += ",";
		}
		return newVal; // returns line
	}


        // examples 	
	public static void main(String[] args) {
		IPattern obj = new PascalTriangle();
		System.out.println("Generating individual lines:");
		for(int i=1; i<10; i++) // tests printNth
		{
			System.out.println(obj.printNthItem(i));
		}
		System.out.println("Formatting into a pattern:");
		System.out.println(obj.printPattern(10)); //tests pattern
	}

	@Override
	public void setParam(int arg) {
		// Leave this blank
	}

}
