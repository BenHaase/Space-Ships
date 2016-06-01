import java.util.Scanner;
//class to run the simulation
public class runShips {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		try{
			int n; //hold array size
			System.out.println("Enter number of Spaceships: ");
			n = input.nextInt();
			SpaceShip[] ships = new SpaceShip[n]; //create array of spaceship ref vars
			fillUp(ships); //fill this array
			while(true){ 
				displayShips(ships); //show the array
				int c;
				String cs;
				System.out.println("Make Changes?(1: yes 2: no) ");
				c = input.nextInt();
				if(c==1){
					System.out.println("Select Ship: ");
					cs = input.next();
					//select ship and make changes
					for(int i=0; i<ships.length; i++) if((ships[i].getName()).equals(cs)){
						SpaceShip temp = ships[i];
						temp = changeShips(temp);
						if(temp != ships[i]) ships[i] = temp; //if changed assign
				}
			}
			}
		}
		catch(Exception e){main(args);}
	}
	
	static void fillUp(SpaceShip[] s){ //method to fill the array
		int c;
		for(int i=0; i<s.length; i++)
		{
			try{
				System.out.println("1: colony ship, 2: cargo ship, 3: space station, 0: exit: ");
				c = input.nextInt();
				if(c==1) s[i] = new ColonyShip();
				if(c==2) s[i] = new CargoShip();
				if(c==3) s[i] = new SpaceStation();	
				if(c==0) System.exit(0);
			}
			catch(Exception e){ 
				i--;
				continue;
			}
		}
	}

	static void displayShips(SpaceShip[] s){ //method to display the array
		for(int i=0; i<s.length; i++) if(s[i] instanceof SpaceStation) System.out.println(s[i].toString());
		for(int i=0; i<s.length; i++) if(s[i] instanceof ColonyShip) System.out.println(s[i].toString());
		for(int i=0; i<s.length; i++) if(s[i] instanceof CargoShip) System.out.println(s[i].toString());
	}
	
	public static SpaceShip changeShips(SpaceShip s){ //method to make changes to the ships
		try{
			int c;
			System.out.println("1: Change ship type, 2: Move ship ");
			c = input.nextInt();
			//create new ship for replacement
			if(c==1){
				System.out.println("1: colony ship, 2: cargo ship, 3: space station, 0: exit: ");
				c = input.nextInt();
				if(c==1) s = new ColonyShip();
				if(c==2) s = new CargoShip();
				if(c==3) s = new SpaceStation();
				if(c==0) System.exit(0);
				c = 0;
			}
			//change coordinates
			if(c==2){
				System.out.println("Enter x coordinate: ");
				double x = input.nextDouble();
				System.out.println("Enter y coordinate: ");
				double y = input.nextDouble();
				if(s instanceof ColonyShip) ((ColonyShip) s).moveShip(x,y);
				if(s instanceof CargoShip) ((CargoShip) s).moveShip(x, y);	
			}
		}
		catch(Exception e){
			System.out.println("error");
			changeShips(s);}
		return s;
	}
}
