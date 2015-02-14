/*
 * Name: My Nguyen
 * Course: CIS 35A - 61Y
 * Assignment: #3
 * Project: #2
 * Due date: 02/15/2015
 * Data submitted: 02/14/2015
 * 
 * This program create a Ship array of 6 different ships, 2 for CargoShip, 
 * 2 for CruiseShip, and 2 for Ship. It then displays the appropriate 
 * information about the ships and their tasks.
 *
 */

package driver;

import ship_classes.*;

public class Driver {

	public static void main(String[] args) {
		Ship [] newShip = new Ship [6];
		newShip[0] = new CargoShip("MS Vale Brasil", "Vale Shipping Holding Pte. Ltd.",
				"Vale Shipping Holding Pte. Ltd.", "Singapore", "Brazil to China",
				"Daewoo Shipbuilding & Marine Engineering Co., Ltd, South Korea", 
				"In Service", "Bulk carrier", 198980, 1187.7, 213.3, 75.5, 99.7,
				"Fixed-pitch propeller", 15.4, 33, "Ore", 400000, false);
		
		newShip[1] = new CruiseShip("MS Freedom of the Seas", "Royal Caribbean Cruises Ltd.",
				"Royal Caribbean International", "Nassau, Bahamas", "Caribbean",
				"Aker Yards Turku Shipyard, Finland", "In Service", "Freedom-class cruise ship",
				154407, 1112, 126.64, 28, 50,
				"Diesel-electric; Three ABB Azipod units, two azimuthing and one fixed. Four bow thrusters",
				21.6, 4994, 2200, 1360, 15, "All kinds");
		
		newShip[2] = new Ship("USS Roosevelt (DDG-80)", "US Navy", "US Navy", "NAVSTA Mayport, Florida, U.S.",
				"Overseas", "Ingalls Shipbuilding", "In Active Service", "Arleigh Burke-class destroyer",
				9300, 509.5, 66, 31, 63,
				"4 × General Electric LM2500-30 gas turbines, 2 shafts, 100,000 shp (75 MW)", 30, 460);
		
		newShip[3] = new CargoShip("Emma Maersk", "Moller-Maersk", "A. P. Moller-Maersk Group", "Taarbæk,Denmark", 
				"Between northern Europe and the far east", "Odense Steel Shipyard Ltd, Denmark",
				"In Service", "Mærsk E-class container ship", 170794, 1302, 184, 52.6, 98,
				"80 MW (109,000 hp) Wärtsilä 14RT-Flex96c plus 30 MW (40,000 hp) from five Caterpillar 8M32",
				25.5, 13, "Containers", 14770, false);
		
		newShip[4] = new CruiseShip("RMS Titanic", "White Star Line", "White Star Line", "Liverpool, UK", 
				"Southampton to New York City", "Harland and Wolff, Belfast",  
				"Wreck", "Olympic-class ocean liner", 46328, 882.8, 92, 34.6, 64.5,
				"Two three-blade wing propellers and one four-blade centre propeller",
				24, 3327, 840, 892, 8, "Varied");
		
		newShip[5] = new Ship("Nordica", "Arctia Offshore", "Arctia Offshore", "Helsinki, Finland", 
				"Baltic Sea & offshore", "Finnyards Ltd., Rauma, Finland",
				"In Service", "Icebreaker/Platform supply vessel", 9392, 381, 85, 28, 41,
				"Diesel-electric (AC/AC). Two Aquamaster US ARC 1 azimuth thrusters (2 × 7,500 kW)."
				+ " Three Brunvoll bow thrusters (3 × 1,150 kW)", 16.5, 77);
		
		for(int i = 0; i < newShip.length; i++) {
			newShip[i].displayShipInfo();
			System.out.printf("\t*** Activities ***\n");
			newShip[i].printCrew();
			newShip[i].printEvents();
			newShip[i].restock();
		}
	}
}

/*
 * Output:

	*** Career Information ***
Name: MS Vale Brasil
Owner: Vale Shipping Holding Pte. Ltd.
Operator: Vale Shipping Holding Pte. Ltd.
Port of Registry: Singapore
Route: Brazil to China
Builder: Daewoo Shipbuilding & Marine Engineering Co., Ltd, South Korea
Status: In Service
	*** General Characteristics ***
Class & Type: Bulk carrier
Tonnage: 198980.0 GT
Length: 1187.7 ft
Beam: 213.3 ft
Draught: 75.5 ft
Depth: 99.7 ft
Propulsion: Fixed-pitch propeller
Speed: 15.4 knots
Number of crew: 33
Type of Cargo: Ore
Cargo Capacity: 400000.0
Crane: false
	*** Activities ***
Print the crew members on the Cargo Ship also 
There are only some events on the Cargo Ship 
Restocking fuel and cargoes for the MS Vale Brasil Cargo Ship 

	*** Career Information ***
Name: MS Freedom of the Seas
Owner: Royal Caribbean Cruises Ltd.
Operator: Royal Caribbean International
Port of Registry: Nassau, Bahamas
Route: Caribbean
Builder: Aker Yards Turku Shipyard, Finland
Status: In Service
	*** General Characteristics ***
Class & Type: Freedom-class cruise ship
Tonnage: 154407.0 GT
Length: 1112.0 ft
Beam: 126.64 ft
Draught: 28.0 ft
Depth: 50.0 ft
Propulsion: Diesel-electric; Three ABB Azipod units, two azimuthing and one fixed. Four bow thrusters
Speed: 21.6 knots
Number of crew: 4994
Passenger Rooms: 2200
Number of Employees: 1360
Food: All kinds
	*** Activities ***
Print the crew members on the Cruise Ship also 
There are a lot of events on the Cruise Ship 
Restocking food and other supplies for the MS Freedom of the Seas Cruise Ship 

	*** Career Information ***
Name: USS Roosevelt (DDG-80)
Owner: US Navy
Operator: US Navy
Port of Registry: NAVSTA Mayport, Florida, U.S.
Route: Overseas
Builder: Ingalls Shipbuilding
Status: In Active Service
	*** General Characteristics ***
Class & Type: Arleigh Burke-class destroyer
Tonnage: 9300.0 GT
Length: 509.5 ft
Beam: 66.0 ft
Draught: 31.0 ft
Depth: 63.0 ft
Propulsion: 4 × General Electric LM2500-30 gas turbines, 2 shafts, 100,000 shp (75 MW)
Speed: 30.0 knots
Number of crew: 460
	*** Activities ***
Print the crew members on the Ship
Display events on the Ship 
Restocking the Ship 

	*** Career Information ***
Name: Emma Maersk
Owner: Moller-Maersk
Operator: A. P. Moller-Maersk Group
Port of Registry: Taarbæk,Denmark
Route: Between northern Europe and the far east
Builder: Odense Steel Shipyard Ltd, Denmark
Status: In Service
	*** General Characteristics ***
Class & Type: Mærsk E-class container ship
Tonnage: 170794.0 GT
Length: 1302.0 ft
Beam: 184.0 ft
Draught: 52.6 ft
Depth: 98.0 ft
Propulsion: 80 MW (109,000 hp) Wärtsilä 14RT-Flex96c plus 30 MW (40,000 hp) from five Caterpillar 8M32
Speed: 25.5 knots
Number of crew: 13
Type of Cargo: Containers
Cargo Capacity: 14770.0
Crane: false
	*** Activities ***
Print the crew members on the Cargo Ship also 
There are only some events on the Cargo Ship 
Restocking fuel and cargoes for the Emma Maersk Cargo Ship 

	*** Career Information ***
Name: RMS Titanic
Owner: White Star Line
Operator: White Star Line
Port of Registry: Liverpool, UK
Route: Southampton to New York City
Builder: Harland and Wolff, Belfast
Status: Wreck
	*** General Characteristics ***
Class & Type: Olympic-class ocean liner
Tonnage: 46328.0 GT
Length: 882.8 ft
Beam: 92.0 ft
Draught: 34.6 ft
Depth: 64.5 ft
Propulsion: Two three-blade wing propellers and one four-blade centre propeller
Speed: 24.0 knots
Number of crew: 3327
Passenger Rooms: 840
Number of Employees: 892
Food: Varied
	*** Activities ***
Print the crew members on the Cruise Ship also 
There are a lot of events on the Cruise Ship 
Restocking food and other supplies for the RMS Titanic Cruise Ship 

	*** Career Information ***
Name: Nordica
Owner: Arctia Offshore
Operator: Arctia Offshore
Port of Registry: Helsinki, Finland
Route: Baltic Sea & offshore
Builder: Finnyards Ltd., Rauma, Finland
Status: In Service
	*** General Characteristics ***
Class & Type: Icebreaker/Platform supply vessel
Tonnage: 9392.0 GT
Length: 381.0 ft
Beam: 85.0 ft
Draught: 28.0 ft
Depth: 41.0 ft
Propulsion: Diesel-electric (AC/AC). Two Aquamaster US ARC 1 azimuth thrusters (2 × 7,500 kW). Three Brunvoll bow thrusters (3 × 1,150 kW)
Speed: 16.5 knots
Number of crew: 77
	*** Activities ***
Print the crew members on the Ship
Display events on the Ship 
Restocking the Ship 

 */