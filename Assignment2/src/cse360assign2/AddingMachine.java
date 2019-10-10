/**
 * This class works like a calculator.
 * @author Moushumi Rahman
 * @classId CSE360 
 * @assignmentNumber 2
 * @version 2 
 */

package cse360assign2;

public class AddingMachine {
	
	private int total;
	
	private String fullString;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		fullString = "0";
	}
	
	/**
	 * 
	 * @return integer which is the current total
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * 
	 * @param value which is added to the total
	 */
	
	public void add (int value) {
		
		total = total + value;
		
		fullString = fullString + " + " + value;
		
	}
	
	/**
	 * 
	 * @param value which is subtracted from the total
	 */
	
	public void subtract (int value) {
		
		total = total - value;
		
		fullString = fullString + " - " + value;
		
	}
	
	/**
	 * @return String which is the history
	 */
	
	public String toString () {
		
		return fullString;
	}

	public void clear() {
	
	}


}
