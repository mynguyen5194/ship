/*
 * Regular Ship class
 */

package ship_classes;

public class Ship {
	// Basic Information
	private String name;
	private String owner;
	private String operator;
	private String portOfRegistry;
	private String route;
	private String builder;
	private String status;
	
	// General characteristics
	private String classAndType;
	private double tonnage;
	private double length;
	private double beam;
	private double draught;
	private double depth;
	private String propulsion;
	private double speed;
	private int crew;
	
	public Ship () {}
	
	public Ship (String Name, String Owner, String Operator, String PortOfRegistry, String Route, String Builder,
			String Status, String ClassAndType, double Tonnage, double Length,
			double Beam, double Draught, double Depth, String Propulsion, double Speed, int Crew) {
		name = Name;
		owner = Owner;
		operator = Operator;
		portOfRegistry = PortOfRegistry;
		route = Route;
		builder = Builder;
		status = Status;
		classAndType = ClassAndType;
		tonnage = Tonnage;
		length = Length;
		beam = Beam;
		draught = Draught;
		depth = Depth;
		propulsion = Propulsion;
		speed = Speed;
		crew = Crew;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getPortOfRegistry() {
		return portOfRegistry;
	}

	public void setPortOfRegistry(String portOfRegistry) {
		this.portOfRegistry = portOfRegistry;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getClassAndType() {
		return classAndType;
	}

	public void setClassAndType(String classAndType) {
		this.classAndType = classAndType;
	}

	public double getTonnage() {
		return tonnage;
	}

	public void setTonnage(double tonnage) {
		this.tonnage = tonnage;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBeam() {
		return beam;
	}

	public void setBeam(double beam) {
		this.beam = beam;
	}

	public double getDraught() {
		return draught;
	}

	public void setDraught(double draught) {
		this.draught = draught;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public String getPropulsion() {
		return propulsion;
	}

	public void setPropulsion(String propulsion) {
		this.propulsion = propulsion;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public void displayShipInfo() {
		System.out.printf("\n\t*** Career Information ***"
				+ "\nName: " + this.getName() + "\nOwner: " + this.getOwner()
				+ "\nOperator: " + this.getOperator() + "\nPort of Registry: " + this.getPortOfRegistry()
				+ "\nRoute: " + this.getRoute() + "\nBuilder: " + this.getBuilder()
				+ "\nStatus: " + this.getStatus()
				+ "\n\t*** General Characteristics ***"
				+ "\nClass & Type: " + this.getClassAndType() + "\nTonnage: " + this.getTonnage()
				+ " GT" + "\nLength: " + this.getLength() + " ft" + "\nBeam: " + this.getBeam() + " ft"
				+ "\nDraught: " + this.getDraught() + " ft" + "\nDepth: " + this.getDepth() + " ft"
				+ "\nPropulsion: " + this.getPropulsion() +"\nSpeed: " + this.getSpeed() + " knots"
				+ "\nNumber of crew: " + this.getCrew() + "\n");
	}
	
	public void printCrew() {
		System.out.printf("Print the crew members on the Ship\n");
	}
	
	public void printEvents() {
		System.out.printf("Display events on the Ship \n");
	}
	
	public void restock() {
		System.out.printf("Restocking the Ship \n");
	}
}
