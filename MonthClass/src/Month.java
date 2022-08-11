
/*
 * @Suman_Kumar_Sah
 * l
 */
import java.util.HashMap;
import java.util.Map;

//Creating checked MonthException class that extends Exception
class MonthException extends Exception {
	
	
	static final long serialVersionUID = 1L; //Helps to comply with Java standards

	public MonthException(String errMessage) {
		super(errMessage);
	}

}

public class Month {

	// Holds the number of the month
	// Adding private fields to the class
	private int monthNumber;
	
	//Creating null in index 0, and other indices through
	// 1 to 12 will contain the name of the month with the first letter capitalized.
	
	private static String[] numberToName = {null, "January", "February", "March", "April", "May", "June", "July",
			"August", "September", "October", "November", "December" };
	
	//Initiating nameToNumber as a HashMap
	private static Map<String, Integer> nameToNumber = new HashMap<>();
	
	//Using a static block to initialize the key-value pairs in the HashMap
	static {
		for (int i = 1; i < numberToName.length; i++) {
			nameToNumber.put(numberToName[i].toLowerCase(), i);
		}
	}

	//Initializes the monthNumber
	public Month(){
		monthNumber = 1;
	}
	
	//This method throw MonthException and calls setMonthNumber from the constructor.
	public Month(int monthNumber) throws MonthException {
		setMonthNumber(monthNumber);
	}

	//This throws MonthException and shows the message.
	//And Converts monthName to lower Case before looking it up in the HashMap, but if it’s not found, 
	//the MonthException message is printed in its original case.
	public Month(String monthName) throws MonthException {
		String lowMonthName = monthName.toLowerCase();
		if(!nameToNumber.containsKey(lowMonthName)) {
			throw new MonthException("Invalid month name " + "'" + monthName + "'.");
		}
		monthNumber = nameToNumber.get(lowMonthName);	}

	

	// throw MonthException and shows message
	// value less than 1 or greater than 12 is passed, then sets monthNumber to 1.
	public void setMonthNumber(int monthNumber) throws MonthException {

		if (monthNumber < 1 || monthNumber > 12) {
			throw new MonthException("Invalid month number " + monthNumber + ".");
		}

		this.monthNumber = monthNumber;

	}

	// method that returns the value in the monthNumber field
	public int getMonthNumber() {
		return monthNumber;
	}

	// method that returns the name of the month
	public String getMonthName() {
		switch (monthNumber) {
		case 1:
			return ("January");

		case 2:
			return ("February");

		case 3:
			return ("March");

		case 4:
			return ("April");

		case 5:
			return ("May");

		case 6:
			return ("June");

		case 7:
			return ("July");

		case 8:
			return ("August");

		case 9:
			return ("September");

		case 10:
			return ("October");

		case 11:
			return ("November");

		case 12:
			return ("December");

		}
		return ("January");
	}

	// method that returns the same value as the getMonthName method
	public String toString() {
		return getMonthName();
	}

	// method that accepts a Month object as an argument. If the argument object
	// holds the same data as
	// the calling object, this method returns true. Otherwise, it returns false
	public boolean equals(Month myMonth) {
		if (monthNumber == myMonth.getMonthNumber()) {
			return true;
		} else {
			return false;
		}
	}

	// method that accepts a Month object as an argument. If the calling object’s
	// monthNumber
	// field is greater than the argument’s monthNumber field,then this method
	// returns true. Otherwise, it return false
	public boolean greaterThan(Month myMonth) {
		if (monthNumber > myMonth.getMonthNumber()) {
			return true;
		} else {
			return false;
		}
	}

	// method that accepts a Month object as an argument. If the calling object’s
	// monthNumber field
	// is less than the argument’s monthNumber field, this method returns true.
	// Otherwise, it return false.
	public boolean lessThan(Month myMonth) {
		if (monthNumber < myMonth.getMonthNumber()) {
			return true;
		} else {
			return false;
		}
	}
}
