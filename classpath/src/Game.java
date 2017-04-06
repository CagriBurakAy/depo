import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	static ArrayList<Seabird> zoo;
	static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		zoo = new ArrayList<Seabird>();
		initZoo();
		
		int choiceChar = 1;
		while(choiceChar > 0)
		{
			choiceChar = displayCharMenu();
			Seabird bird = charMenu(choiceChar);
			
			int choiceAction = 1;
			while(choiceAction > 0)
			{
				choiceAction = displayActionMenu();
				actionMenu(choiceAction, bird);
			}
		}


	}

	public static void initZoo() {
		zoo.add(new BlackCormorant("Black", "HOOT", true));
		zoo.add(new Seagull("White", "CAW", true));
		zoo.add(new Penguin("Black&White", "TWEET", false));
	}

	public static int displayCharMenu() {
		System.out.println("\n\n");
		System.out.println("**********CHOOSE CHARACTER**********");
		System.out.println("1. Black Cormorant");
		System.out.println("2. Seagull");
		System.out.println("3. Penguin");
		System.out.println("0. Exit");
		System.out.print("Choice: ");
		return scan.nextInt();
	}
	
	public static int displayActionMenu() {
		System.out.println("\n\n");
		System.out.println("**********CHOOSE ACTION**********");
		System.out.println("1. Take Off");
		System.out.println("2. Fly");
		System.out.println("3. Land");
		System.out.println("4. Dive");
		System.out.println("5. Swim");
		System.out.println("6. Surface");
		System.out.println("7. Sing");
		System.out.println("8. Wave");
		System.out.println("0. Back to Char Menu");
		System.out.print("Choice: ");
		return scan.nextInt();
	}
	
	public static Seabird charMenu(int type) {
		if(type < 0 || type > 3)
			return null;
		if(type == 0)
			System.exit(0);
		
		Seabird bird = zoo.get(type - 1);
		return bird;
	}
	
	public static void actionMenu(int action, Seabird bird){
		switch(action)
		{
			case 1:
				bird.takeOff();
			break;
			
			case 2:
				System.out.print("Enter length(m): ");
				bird.fly(scan.nextInt());
				break;
				
			case 3:
				bird.land();
				break;
				
			case 4:
				bird.dive();
				break;
				
			case 5:
				System.out.print("Enter length(m): ");
				bird.swim(scan.nextInt());
				break;
				
			case 6:
				bird.surface();
				break;
				
			case 7:
				bird.sing();
				break;
				
			case 8:
				bird.wave();
				break;
				
			case 0:
				return;
				
			default:
				System.out.print("Wrong input try again! ");
				break;
				
		}
		
	}

}
