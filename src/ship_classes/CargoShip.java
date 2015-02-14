/*
 * CargoShip class which extends from Ship 
 */

package ship_classes;

public class CargoShip extends Ship {
	// Some distinguished properties of CargoShip
	private String typeOfCargo;
	private double cargoCapacity;
	private boolean crane;
	
	public CargoShip() {}
		
	public CargoShip(String Name, String Owner, String Operator, String PortOfRegistry, String Route,
			String Builder, String Status, String ClassAndType, double Tonnage, double Length,
			double Beam, double Draught, double Depth, String Propulsion, double Speed, int Crew,
			String TypeOfCargo, double CargoCapacity, boolean Crane) {
		super(Name, Owner, Operator, PortOfRegistry, Route, Builder, Status, ClassAndType, Tonnage,
				Length, Beam, Draught, Depth, Propulsion, Speed, Crew);
		typeOfCargo = TypeOfCargo;
		cargoCapacity = CargoCapacity;
		crane = Crane;
	}
	
	public String getTypeOfCargo() {
		return typeOfCargo;
	}

	public void setTypeOfCargo(String typeOfCargo) {
		this.typeOfCargo = typeOfCargo;
	}

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public boolean isCrane() {
		return crane;
	}

	public void setCrane(boolean crane) {
		this.crane = crane;
	}
	
	public void displayShipInfo() {
		super.displayShipInfo();
		System.out.printf("Type of Cargo: " + this.getTypeOfCargo() + "\nCargo Capacity: " + 
		this.getCargoCapacity() + "\nCrane: " + this.isCrane() + "\n");
	}
	
	public void printCrew() {
		
		System.out.printf("Print the crew members on the Cargo Ship also \n");
	}
	
	public void printEvents() {
		System.out.printf("There are only some events on the Cargo Ship \n");
	}
	
	public void restock() {
		System.out.printf("Restocking fuel and cargoes for the " + this.getName() + " Cargo Ship \n");
	}
}
