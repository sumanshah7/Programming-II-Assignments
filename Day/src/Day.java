import java.util.HashMap;
import java.util.Map;

class DayException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DayException(String message) {
		super(message);
	}

}

public class Day {

	private int dayNumber;
	private static String[] numberToName = { "Sunday", "Monday", "Tuesday", "Wednesdday", "Thursday", "Friday",
			"Saturday" };

	private static Map<String, Integer> nameToNumber = new HashMap<>();
	static {
		for (int i = 0; i < numberToName.length; i++) {
			nameToNumber.put(numberToName[i].toLowerCase(), i);
		}
//		nameToNumber.put("Sunday", 0);
	}

	public Day(int dayNumber) throws DayException {
		 setDay(dayNumber);
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public String getDayName() {
		return numberToName[dayNumber];
	}

	public void setDay(int dayNumber) throws DayException {
		if (dayNumber < 0 || dayNumber > 6) {
			throw new DayException("Day is outside range 0 through 6.");
		}
		this.dayNumber = dayNumber;
	}

	public void setDay(String dayName) throws DayException {
		String dayNameLowercase = dayName.toLowerCase();
		if (!nameToNumber.containsKey(dayNameLowercase)) {
			throw new DayException("Day '" + dayName + "' does not exist.");
		}

		dayNumber = nameToNumber.get(dayNameLowercase);
	}
	
	public String toString() {
		return numberToName[dayNumber];
	}

	public static void main(String[] args) {
		Day day = null;
		try {
			day = new Day(1);
		} catch (DayException de) {
			System.err.println("Error: " + de.getLocalizedMessage());
			System.exit(1);
		}
		try {
			day.setDay("Monday");
			System.out.println("I also want to go home!");
		} catch (DayException de) {
			System.err.println("Error: " + de.getLocalizedMessage());
			System.exit(1);
		}
		System.out.println(day);
	}

}
