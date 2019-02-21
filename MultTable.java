/**
 * This function implements multiplication table printing.
 * https://en.wikipedia.org/wiki/Multiplication_table
 * @author harsh
 *
 */
public class MultTable implements IPattern {
	 int N = 1;

    public static void main(String[] args){
        IPattern obj = new MultTable();
        System.out.println(obj.printNthItem(4));
        System.out.println(obj.printPattern(10));
    }
    
    /**
      * prints multiplication table for given n value
	For N=1,n=10 this prints:
	1 * 1 = 1
	1 * 2 = 2
	1 * 3 = 3
	1 * 4 = 4
	1 * 5 = 5
	1 * 6 = 6
	1 * 7 = 7
	1 * 8 = 8
	1 * 9 = 9
	1 * 10 = 10	
     */
	@Override
	public String printPattern(int n) {
	   String newValue = ""; //empty string
	      for(int lines =1; lines <= n; lines++){  // line iteration
		newValue += Integer.toString(N); // print line in (_*_=_)
		newValue += " * ";
		newValue += Integer.toString(lines);
		newValue += " = ";
		newValue += Integer.toString(N*lines);
		newValue += "\n"; // skip line
	      } 
	    return newValue; // return value
	}

	/**
	 * prints single line of multiplication for given values
	 For N=1,n=5 this prints:
	 1 * 5 = 5
	 */
	@Override
	public String printNthItem(int i) {
           String newValue = ""; // empty string
	      for(int lines = 1; lines <= N; lines++){ // line iteration
		newValue += Integer.toString(lines); // print line (_*_=) 
		newValue += " * ";
		newValue += Integer.toString(i);
		newValue += " = ";
		newValue += Integer.toString(i*lines);

		}
	    return newValue; // return value
	}

	/**
 	*sets parameter 
	 * This changes the value of class variable N to arg.
	 */
	@Override
	public void setParam(int arg) {
		this.N = arg;	// sets parameter
	}
}
