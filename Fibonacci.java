/**
 * This class implements Fibonacci pattern printing
 * https://en.wikipedia.org/wiki/Fibonacci_number
 * @author harsh
 *
 */
public class Fibonacci implements IPattern {

	public static void main(String[] args){
		IPattern obj = new Fibonacci();
		System.out.println(obj.printNthItem(1));
		System.out.println(obj.printPattern(5));
	}
	/**
	* prints the fibonacci sequence for a set n values
	 	Prints following for n = 5:
		0 1 1 2 3
	 */
	@Override
	public String printPattern(int n){
	   if (n == 0 || n < 0){
		return "";
	   }
              String newValue = ""; // empty string
	      int newValue1 = 0; // initializes two variables
	      int newValue2 = 1;
		if (n%2 == 1){ // checks if input is odd/even
		   for (int number = 1; number <= n/2+1; number++){ //odd loop
		      newValue += Integer.toString(newValue1);
		      newValue += " ";
		      newValue += Integer.toString(newValue2);
		      newValue += " ";
		      newValue1 = newValue1 + newValue2; //updates variables
		      newValue2 = newValue1+ newValue2;
		   }	
		}
		else { //even loop
		   for (int number =1; number <= n/2; number++){
		      newValue += Integer.toString(newValue1);
		      newValue += " ";
		      newValue += Integer.toString(newValue2);
		      newValue += " ";
		      newValue1 = newValue1 + newValue2; //updates variables
		      newValue2 = newValue1 + newValue2;
		   }	 
		} 
	   return newValue; // returns value
	}	
	   
	

	/**
	 * 
	 * prints the fibonacci value for the nth number in the sequence
		Prints following for n = 5:
		3
	 */
	@Override
	public String printNthItem(int n) {
	   String newVal = ""; // empty string
	        if (n == 0 || n < 0){
		   return "";
		}
		if (n == 1){ // corner case zero
	  	   return "0";
		}
		else if (n == 2){ // corner case 1 & 2
		   return "1";
		}
		else{ // all other numbers
		   int newValue1 = 0; // sets constants
		   int newValue2 = 1;
	           int changingValue = 0;
		   for(int i = 2; i <n; i++){ // loop for numbers >2
		      changingValue = newValue1 + newValue2;
		      newValue1 = newValue2;
		      newValue2 = changingValue;
		   }	
	   	  return Integer.toString(changingValue); // returns string
	 	} 
	}

	@Override
	public void setParam(int arg) {
		// Leave this blank
	}
}

