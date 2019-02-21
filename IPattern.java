/**
 * This is a interface that helps printing of different patterns
 * @author harsh
 *
 */
public interface IPattern {

	/**
	 * This function prints n lines of the pattern
	 * @param n
	 * @return
	 */
	public String printPattern(int n);
	
	/**
	 * This function prints just the nth line
	 * @param n
	 * @return
	 */
	public String printNthItem(int n);
	
	/**
	 * This function is used to set arguments to the function
	 * @param arg
	 */
	public void setParam(int arg);

}
