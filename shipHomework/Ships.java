/**
 * 
 * @author Suman Kumar Sah
 *
 */


//Creating a class named Ship
class Ship {
	
	
	//Initiating the variables to the given data type for the name and the built year of the ship.
	private String ship;
	private int builtYear;
	
	
	//A constructor is created with appropriate accessors and mutator
	public Ship(String ship, int builtYear) {
		this.ship = ship;
		this.builtYear = builtYear;
	}
	
	//Sets the name of the ship
	public void setName(String ship) {
		this.ship = ship;
	}
	
	//Returns the name of the ship.
	public String getName() {
		return ship;
	}
	
	
	//Sets the built year of the ship
	public void setYearBuilt(int builtYear) {
		this.builtYear = builtYear;
	}
	
	//Returns the built year of the ship
	public int getYearBuilt() {
		return builtYear;
	}
	
	
	//Displays the name and the built year of the ship.
	public String toString() {
		return ("Name: " + getName() + ", year built: " + getYearBuilt());
	}

}


//Creating a sub-class named CruiseShip that extends the parent class Ship
class CruiseShip extends Ship {
	
	//Initiating the variables to the given data type for the maximum number of passanger in ship.
	private int maxPassanger;
	
	
	//A constructor is created with appropriate accessors and mutator
	public CruiseShip(String ship, int builtYear, int maxPassanger) {
		super(ship, builtYear);
		this.maxPassanger = maxPassanger;
	}
	
   //Sets the maximum number of passengers in ship.
	public void setMaxPassengers(int maxPassanger) {
		this.maxPassanger = maxPassanger;
	}
	
	
	//Returns the maximum number of passengers in ship
	public int getMaxPassengers() {
		return maxPassanger;
	}
	
	
	//This method overrides the toString method in the base class and displays
	//only the ship’s name and the maximum number of passengers.
	public String toString() {
		return ("Name: " + getName() + ", max passengers: " + getMaxPassengers());
	}


}


//Creating a sub-class named CargoShip that extends the parent class Ship
 class CargoShip extends Ship {

	//Initiating the variables to the given data type for the cargo capacity in tonnage
	 private int capacity;
	
	//A constructor is created with appropriate accessors and mutator
	public CargoShip(String ship, int builtYear, int capacity) {
		super(ship, builtYear);
		this.capacity = capacity;
	}
	
	//Sets the the cargo capacity 
	public void setCapacityInTons(int capacity) {
		this.capacity = capacity;
		
	}
	
	//Returns the the cargo capacity 
	public int getCapacityInTons() {
		return capacity;
	}
	
	
	//This method overrides the toString method in the base class and displays
	//only the ship’s name and the ship’s cargo capacity.
	public String toString() {
		return ("Name: " + getName() + ", cargo capacity (tons): " + getCapacityInTons());
	}
	
}


//A class is created that has a Ship array.
public class Ships {
	
	public static void main(String[] args) {

		//Creates an array of type ship of size

		Ship[] ships=new Ship[3];

		//Initialize the constructors

		ships[0]=new Ship("The Mayflower",1620);

		ships[1]=new CruiseShip("Titanic",1990,1556);

		ships[2]=new CargoShip("HMS Victory",1878,180);

		//print toString methods

		for(int i=0;i<ships.length;i++) {

		System.out.println(ships[i].toString());

		} 

	}
}

