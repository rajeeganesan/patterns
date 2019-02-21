import java.io.*;
import java.util.*;

public class Staircase implements IPattern {

	int N = 10;

	public static void main(String[] args){
		IPattern obj = new Staircase();
		System.out.println(obj.printPattern(10));
		System.out.println(obj.printNthItem(10));
		System.out.println(obj.printNthItem(2));
	}

	/**
 	 *prints staircase pattern with a base of n 	
 	 * Print the pattern for n=10
	 
		         x
		        xx
		       xxx
		      xxxx
		     xxxxx
		    xxxxxx
		   xxxxxxx
		  xxxxxxxx
		 xxxxxxxxx
		xxxxxxxxxx
	 */	
	@Override
	public String printPattern(int n) {
	   if (n == 0 || n < 0){
		return "";
	   }
	   String newValue = ""; // empty string for return value
	      for (int line = 0; line <= n; line++){ // loop for lines
		   int space = 0;

	      for(space = 0;space < (n-line); space++)  // loop for spaces
		   newValue += " ";

	      for(int star = space; star < n; star++) // loop for asterisks
		   newValue += "x"; 
		   newValue += "\n";  // skip line       	
	      }	

	   return newValue;
	}
	
	/**
 	 * prints the nth line in the previous staircase pattern 	
	 * 	print the 10th line of the pattern:
	 	xxxxxxxxxx
	 */
	@Override
	public String printNthItem(int n) {
	   if ( n ==0 || n < 0){
		return "";
	   }
	   String newVal = "";  // empty string
	   int space = 0; 
		for(space = 0 ; space < (this.N - n); space++) { // space loop
			newVal += " ";
		}
		for(int star = space; star < this.N; star++){ // asterisk loop
			newVal += "x";
		}
		
		
	   return newVal;
	}

	/**
 	 * sets parameters 
	 * This changes the value of class variable N to arg.
	 */
	@Override
	public void setParam(int arg) {
		this.N = arg; // sets parameter
	}
}
