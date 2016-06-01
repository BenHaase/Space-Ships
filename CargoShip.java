import java.util.Scanner;
//cargoship subclass
public class CargoShip extends SpaceShip implements CanMove{
	private int cargo;
	//constructor
	CargoShip() {
			super();
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Cargo Capacity: ");
			setCargo(input.nextInt());
	}
	//get&set
	private int getCargo() {
		return cargo;
	}
	private void setCargo(int cargo) {
		this.cargo = cargo;
	}
	//string representation
	@Override public String toString(){
		StringBuilder s = new StringBuilder();
		String nl = System.getProperty("line.separator");
		s.append("Name: " + this.getName() + nl);
		s.append("Location: " + this.getxCoord() + "," + this.getyCoord() + nl);
		s.append("Cargo Capacity: " + this.getCargo() + nl);
		return s.toString();
	}
	//interface method
	public void moveShip(double a, double b) {
		this.setxCoord(a);
		this.setyCoord(b);
	}
}
