import java.util.*;

class Continent {
	Scanner in = new Scanner(System.in);
	String continent;
	
	Continent() {
		System.out.print("Continent : ");
		continent = in.nextLine();
	}
}

class Country extends Continent {
	Scanner in = new Scanner(System.in);
	String country;
	
	Country() {
		System.out.print("Country : ");
		country = in.nextLine();
	}
}

class State extends Country {
	Scanner in = new Scanner(System.in);
	String state;
	
	State() {
		System.out.print("State : ");
		state = in.nextLine();
	}
}

class Place extends State {
	Scanner in = new Scanner(System.in);
	String place;
	
	Place() {
		System.out.print("Place : ");
		place = in.nextLine();
	}
	
	public static void main(String[] args) {
		Place obj = new Place();
		
		System.out.println("\nContinent : " + obj.continent + "\nCountry : " + obj.country + "\nState : " + obj.state + "\nPlace : " + obj.place);
	}
}
