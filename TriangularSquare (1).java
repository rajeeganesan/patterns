public class TriangularSquare implements IPattern {

	int N = 10;
	
	/**
	 * Prints the following pattern for n = 10:

		* * * * *  * * * * *
		* * * *      * * * *
		* * *          * * *
		* *              * *
		*                  *
		*                  * 
	        * *              * *
		* * *          * * *
		* * * *      * * * *
		* * * * *  * * * * *
		
		Prints the following pattern for n = 11:
		
		* * * * *  * * * * *
		* * * *      * * * *
		* * *          * * *
		* *              * *
		*                  *
		                    
		*                  *
		* *              * *
		* * *          * * *
		* * * *      * * * *
		* * * * *  * * * * *
		 
	 * prints a square with a diamond within with total width n-1
	 * and the square with a total length and width n 
	 */
	@Override
	public String printPattern(int n) {
	   String newValue = ""; // empty string	
	   if (n <= 0){
	       return ("");
	   }   
	       for(int lines = 1; lines <=(n/2); lines++){ // line iteration
	         for (int stars = n/2; stars >= lines; stars--){ // stars
		    if (stars == n/2 ){ // checks if its a side value
		       newValue += ("*"); // without space on left side
		    }
		    else{
		       newValue +=(" *"); // with space
		    }
		 }

		 for (int spaces = lines*2; spaces >= 2; spaces--){ // spaces
		    newValue += ("  ");
		 }

		 for (int stars = n/2; stars >= lines; stars--){ // stars
		    newValue += ("* "); // stars on right side
		 }

	         newValue += ("\n"); // line skip
	      }

	      if ( n%2 == 1){ // checks if it's odd, if so adds a line
		newValue +="\n";
	      }

	      for (int lines = 1; lines <= n/2; lines++) { // bottom half
	         for (int stars = lines; stars > 0; stars--){ // stars
		    if (stars == lines ){ // checks if its a side value
	               newValue += ("*"); // no space
		    }
		    else{
		       newValue += (" *"); // with space
		    }
		 } 

		 for (int spaces = 2; spaces <= (n/2 - lines +1)*2; spaces++){
		    newValue += ("  "); // adds spaces
		 } 

		for (int stars = lines; stars > 0 ; stars--){
		  newValue += ("* "); // adds spaces
		}
		
                newValue += ("\n"); // line skip
	        }

	   return newValue; // returns value
	}
	/**
	 * 
	 
		Printing 3rd item for N=10
		* * *          * * *
		Printing 7th item for N=11
		*                  *

	 */
	@Override
	public String printNthItem(int i) {
	   String newValue = "";
	   int n = this.N;
	   int lines = i;
	   if (i > n || i <= 0){
		return ("");
	   }
//	   for(lines = i; lines < i; lines++){  // irrelevant, ignore
	       for (int stars = n/2; stars >=(lines); stars--){ // line iterate
	         if (stars == n/2){ // checks if side case
		    newValue += ("*");
	         }	
		 else{ // adds left stars
		     newValue += (" *");
		 }
	       }

	       for(int spaces = lines*2; spaces >= 2; spaces--){ //spaces
	          newValue += ("  ");
	       } 
			
	      for(int stars = n/2; stars >= lines; stars--){ //right stars
	       newValue += ("* ");
//	    } // irrelevant

	   }
	
	    if (n%2 == 1){ // checks for odd output
	       newValue += "\n";
	   } 

// irrelevant second try
//	    for (lines = i; lines <= i; lines++){
/*               for(int stars = lines; stars >= 0; stars--){
	          if (stars == lines){ 
		     newValue += ("*");
		  }
		  else{
	       	     newValue += (" *");
	          }
	       }
 
	       for(int spaces = 2; spaces <= (n/2 - lines + 1)*2; spaces++){
	          newValue += ("  ");
	       }

       	       for(int stars = lines; stars >= 0; stars--){
	          newValue += ("* ");
              }
*/
//	     }	
	    

	return newValue;
	
        }

	public static void main(String[] args) {
		IPattern obj = new TriangularSquare();
		obj.setParam(10);
		System.out.println("Printing 3rd item for N=10");
		System.out.println(obj.printNthItem(3));
		System.out.println(obj.printNthItem(2));
		System.out.println(obj.printNthItem(0));
	
		obj.setParam(11);
		System.out.println("Printing 7th item for N=11");
		System.out.println(obj.printNthItem(7));
		
		System.out.println("Printing Pattern:");
		System.out.println(obj.printPattern(11));
	}
	
	/**
	 * This function sets the value of N
	 */
	@Override
	public void setParam(int arg) {
		this.N = arg; // sets parameter
	}
}
