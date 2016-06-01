import java.util.Scanner;
//spacestation subclass
public class SpaceStation extends SpaceShip{
	//attributes
	private int passengers;
	private int cargo;
	//constructor
	SpaceStation() {
		super();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Passengers: ");
		setPassengers(input.nextInt());
		System.out.println("Enter Cargo Capacity: ");
		setCargo(input.nextInt());
	}
	//get&set
	private int getPassengers() {
		return passengers;
	}
	private void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	private int getCargo() {
		return cargo;
	}
	private void setCargo(int capacity) {
		this.cargo = capacity;
	}
	//string representation
	@Override public String toString(){
		StringBuilder s = new StringBuilder();
		String nl = System.getProperty("line.separator");
		s.append("Name: " + this.getName() + nl);
		s.append("Location: " + this.getxCoord() + "," + this.getyCoord() + nl);
		s.append("Passengers: " + this.getPassengers() + nl);
		s.append("Cargo Capacity: " + this.getCargo() + nl);
		return s.toString();
	}
}
