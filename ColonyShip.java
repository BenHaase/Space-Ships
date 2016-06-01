import java.util.Scanner;
//colonyship subclass
public class ColonyShip extends SpaceShip implements CanMove{
	//attributes
	private int passengers;
	//constructor
	ColonyShip() {
		super();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Passengers: ");
		setPassengers(input.nextInt());
	}
	//get&set
	public int getPassengers() {
		return passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	//string representation
	@Override public String toString(){
		StringBuilder s = new StringBuilder();
		String nl = System.getProperty("line.separator");
		s.append("Name: " + this.getName() + nl);
		s.append("Location: " + this.getxCoord() + "," + this.getyCoord() + nl);
		s.append("Passengers: " + this.getPassengers() + nl);
		return s.toString();
	}
	//interface
	public void moveShip(double a, double b) {
		this.setxCoord(a);
		this.setyCoord(b);
	}
}
