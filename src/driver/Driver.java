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
			newShip[i].printCrew();
			newShip[i].printEvents();
			newShip[i].restock();
		}
	}
}