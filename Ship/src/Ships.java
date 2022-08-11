
public class Ship {
	
	private String ship;
	private int builtYear;
	
	public Ship(String ship, int builtYear) {
		this.ship = ship;
		this.builtYear = builtYear;
	}
	
	public void setName(String ship) {
		this.ship = ship;
	}
	
	public String getName() {
		return ship;
	}
	
	public void setYearBuilt(int builtYear) {
		this.builtYear = builtYear;
	}
	
	public int getYearBuilt() {
		return builtYear;
	}
	
	public String toString() {
		return ("Name: " + getName() + ", year built: " + getYearBuilt());
	}

}


class CruiseShip extends Ship {
	
	private int maxPassanger;
	
	
	public CruiseShip(String ship, int builtYear, int maxPassanger) {
		super(ship, builtYear);
		this.maxPassanger = maxPassanger;
	}
	

	public void setMaxPassengers(int maxPassanger) {
		this.maxPassanger = maxPassanger;
	}
	
	public int getMaxPassengers() {
		return maxPassanger;
	}
	
	public String toString() {
		return ("Name: " + getName() + ", max passengers: " + getMaxPassengers());
	}


}



 class CargoShip extends Ship {

	 private int capacity;
	
	
	public CargoShip(String ship, int builtYear, int capacity) {
		super(ship, builtYear);
		this.capacity = capacity;
	}
	
	public void setCapacityInTons(int capacity) {
		this.capacity = capacity;
		
	}
	
	public int getCapacityInTons() {
		return capacity;
	}
	
	public String toString() {
		return ("Name: " + getName() + ", cargo capacity (tons): " + getCapacityInTons());
	}
	
}



/**public class Ships {
	
	public static void main(String[] args) {

		//create an array of type ship of size

		Ship[] ships=new Ship[3];

		//initialize constructors

		ships[0]=new Ship("Sea-Hawk",2002);

		ships[1]=new CruiseShip("Titanic",2002,1336);

		ships[2]=new CargoShip("Sharp-Teeth",2002,100);

		//print toString methods

		for(int i=0;i<ships.length;i++)

		System.out.println(ships[i].toString());

		} */



