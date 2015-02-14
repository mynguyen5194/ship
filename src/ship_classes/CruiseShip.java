/*
 * CruiseShip class which extends from Ship
 */
package ship_classes;

public class CruiseShip extends Ship {
	// Some extra properties of CruiseShip
	private int passengerRooms;
	private int employees;
	private int passengerDecks;
	private String food;
	
	public CruiseShip() {}
	
	public CruiseShip(String Name, String Owner, String Operator, String PortOfRegistry, String Route,
			String Builder, String Status, String ClassAndType, double Tonnage, double Length,
			double Beam, double Draught, double Depth, String Propulsion, double Speed, int Crew,
			int PassengerRooms, int Employees, int PassengerDecks, String Food) {
		super(Name, Owner, Operator, PortOfRegistry, Route, Builder, Status, ClassAndType, Tonnage,
				Length, Beam, Draught, Depth, Propulsion, Speed, Crew);
		passengerRooms = PassengerRooms;
		employees = Employees;
		passengerDecks = PassengerDecks;
		food = Food;
	}

	public int getPassengerRooms() {
		return passengerRooms;
	}

	public void setPassengerRooms(int passengerRooms) {
		this.passengerRooms = passengerRooms;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	public int getPassengerDecks() {
		return passengerDecks;
	}

	public void setPassengerDesk(int passengerDecks) {
		this.passengerDecks = passengerDecks;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	
	public void displayShipInfo() {
		super.displayShipInfo();
		System.out.printf("Passenger Rooms: " + this.getPassengerRooms() +
				"\nNumber of Employees: " + this.getEmployees() + "\nFood: " + this.getFood() + "\n");
	}
	
	public void printCrew() {
		System.out.printf("Print the crew members on the Cruise Ship also \n");
	}
	
	public void printEvents() {
		System.out.printf("There are a lot of events on the Cruise Ship \n");
	}
	
	public void restock() {
		System.out.printf("Restocking food and other supplies for the " + this.getName() + " Cruise Ship \n");
	}
}
