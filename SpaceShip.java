import java.util.Scanner;
public abstract class SpaceShip { //base abstract class
	//attributes
	private String name;
	private int buildDate;
	private double xCoord;
	private double yCoord;
	//constructor
	protected SpaceShip(){
		Scanner input = new Scanner(System.in);
		setxCoord(Math.random()*-100+100);
		setyCoord(Math.random()*-100+100);
		System.out.println("Enter ship name: ");
		setName(input.next());
		System.out.println("Enter Build Date: ");
		setBuildDate(input.nextInt());
	}
	//get&set methods
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getBuildDate() {
		return buildDate;
	}
	private void setBuildDate(int buildDate) {
		this.buildDate = buildDate;
	}
	public double getxCoord() {
		return xCoord;
	}
	public void setxCoord(double xCoord) {
		this.xCoord = xCoord;
	}
	public double getyCoord() {
		return yCoord;
	}
	public void setyCoord(double yCoord) {
		this.yCoord = yCoord;
	}
	//string representation
	@Override public String toString(){
		StringBuilder s = new StringBuilder();
		String nl = System.getProperty("line.separator");
		s.append("Name: " + this.getName() + nl);
		s.append("Build Date: " + this.getBuildDate() + nl);
		return s.toString();
	}
}
