
import java.util.Random;
import java.util.Scanner;

public class code {

	public static void list () {
		System.out.println("===============");
		System.out.println("  Main Menu");
		System.out.println("===============");
		System.out.println("1. Ride Your Car");
		System.out.println("2. Repair Your Car");
		System.out.println("3. Fill Your car's Fuel");
		System.out.println("4. Exit");
		System.out.println("Choose : ");
	}
	
	public static void opening () {
		System.out.println("1. Pick Normal Car");
		System.out.println("2. Pick Nascar Car");
		System.out.println("Choose a New Car");
	}
	
	public static int ran_num(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max-min)+min;
	}
	
	public static void main(String[] args) {
		// Variable
		String Normalname = "Honda VG 550";
		int Normalfuel = 0;
		int Normalcondition = 100;
		int Normaldistance = 0;
		String Nascarname = "Nascar GT 900";
		int Nascarfuel = 0;
		int Nascarcondition = 100;
		int Nascardistance = 0;
		int Fuelinput;
		String turbo;
		int menu;
		int car;
		
	    // Scanner
		Scanner baca = new Scanner(System.in);
		Random rand = new Random(); 
		
		//Program
		opening();
		car = baca.nextInt();
		switch (car) {
		case 1 :
			System.out.println("Car Status ");
			System.out.println("Machine Name : " + Normalname);
			System.out.println("Distance : " + Normaldistance + " Km");
			System.out.println("Fuel :" + Normalfuel +" Liters" );
			System.out.println("Conditon : " + Normalcondition);
			list();
			menu = baca.nextInt();
			do {
				switch (menu) {
				case 1:	
					 if (Normalfuel < 30) {
					    	System.out.println("Your Car's Fuel not Enough");
					    	System.out.println();
					    }
					 else if (Normalfuel >= 30 ) {						 
						 if (Normalcondition == 0) {
							 System.out.println("Your Car's Conditions is Bad, Repair it first!");
							 System.out.println();	 
						 }
						 else if (Normalcondition != 0) 
					    	 {
							 Normalfuel -= 30;
							 Normalcondition -= 15;
							 Normaldistance += ran_num(5,7);
					    	 System.out.println("Success Ride Your Car!");
					    	 }
						}
					System.out.println();
					System.out.println("Car Status ");
					System.out.println("Machine Name : " + Normalname);
					System.out.println("Distance : " + Normaldistance + " Km");
					System.out.println("Fuel :" + Normalfuel +" Liters");
					System.out.println("Conditon : " + Normalcondition);
					list();
					menu = baca.nextInt();
				break;
				case 2:
					if (Normalcondition == 100) {
						System.out.println("Your Car's Condition just Perfect");
						System.out.println();
					}
					else if (Normalcondition !=100) {
						Normalcondition = 100;
						Normaldistance = 0;
						System.out.println("Success Service Your Car!");
					}
					System.out.println();
					System.out.println("Car Status ");
					System.out.println("Machine Name : " + Normalname);
					System.out.println("Distance : " + Normaldistance + " Km");
					System.out.println("Fuel :" + Normalfuel +" Liters");
					System.out.println("Conditon : " + Normalcondition);
					list();
					menu = baca.nextInt();
				break;
				case 3:
					if (Normalfuel == 100) {
						System.out.println("Your Car's Fuel is Full");
						System.out.println();
					}
					else if (Normalfuel < 100) {
						System.out.println("Filled your Fuel [min 1 liters] :");
						Fuelinput = baca.nextInt();
						Normalfuel += Fuelinput;
							if (Normalfuel < 100 && Normalfuel >1) {
								System.out.println("Your Car's Fuel now is "+Normalfuel+" liters");
								System.out.println();
							}
							else if (Normalfuel >100) {
								System.out.println("Your Car's Fuel filled 100 liters");
								System.out.println();
								Normalfuel = 100;
							}
					}
					System.out.println();
					System.out.println("Car Status ");
					System.out.println("Machine Name : " + Normalname);
					System.out.println("Distance : " + Normaldistance + " Km");
					System.out.println("Fuel :" + Normalfuel +" Liters");
					System.out.println("Conditon : " + Normalcondition);
					list();
					menu = baca.nextInt();
				break;
				}
			}while (menu!=4);
			System.out.println("Thank You for Coming ...");
		break;
		case 2 :
			System.out.println("Car Status ");
			System.out.println("Machine Name : " + Nascarname);
			System.out.println("Distance : " + Nascardistance + " Km");
			System.out.println("Fuel :" + Nascarfuel +" Liters" );
			System.out.println("Conditon : " + Nascarcondition);
			list();
			menu = baca.nextInt();
			do {
			switch (menu) {
				case 1:	
					if (Nascarfuel < 50) {
						System.out.println("Your Car's Fuel not Enough");
						System.out.println();
					}
					else if (Nascarfuel >= 50 ) {						 
						if (Nascarcondition == 0) {
							System.out.println("Your Car's Conditions is Bad, Repair it first!");
							System.out.println();	 
						}
						else if (Nascarcondition != 0) 
						{
							System.out.println("USe Turbo [y/n] ?");
							turbo = baca.nextLine();
							char tb = turbo.charAt(0);
							if (tb == 'n') {
								Nascarfuel -= 50;
								Nascarcondition -= 10;
								Nascardistance += ran_num(10,15);
								System.out.println("Success Ride Your Car!");
							}
							else if (tb == 'y') {
								Nascarfuel -= Nascarfuel;
								Nascarcondition -= Nascarcondition;
								Nascardistance += ran_num(30,50);
								System.out.println("Success Ride Your Car!");
							}
						}
					}
					System.out.println();
					System.out.println("Car Status ");
					System.out.println("Machine Name : " + Nascarname);
					System.out.println("Distance : " + Nascardistance + " Km");
					System.out.println("Fuel :" + Nascarfuel +" Liters");
					System.out.println("Conditon : " + Nascarcondition);
					list();
					menu = baca.nextInt();
					break;
				case 2:
					if (Nascarcondition == 100) {
						System.out.println("Your Car's Condition just Perfect");
						System.out.println();
					}
					else if (Nascarcondition !=100) {
						Nascarcondition = 100;
						Nascardistance = 0;
						System.out.println("Success Service Your Car!");
					}
					System.out.println();
					System.out.println("Car Status ");
					System.out.println("Machine Name : " + Nascarname);
					System.out.println("Distance : " + Nascardistance + " Km");
					System.out.println("Fuel :" + Nascarfuel +" Liters");
					System.out.println("Conditon : " + Nascarcondition);
					list();
					menu = baca.nextInt();
					break;
				case 3:
					if (Nascarfuel == 150) {
						System.out.println("Your Car's Fuel is Full");
						System.out.println();
					}
					else if (Nascarfuel < 150) {
						System.out.println("Filled your Fuel [min 1 liters] :");
						Fuelinput = baca.nextInt();
						Nascarfuel += Fuelinput;
						if (Nascarfuel < 150 && Nascarfuel >1) {
							System.out.println("Your Car's Fuel now is "+Nascarfuel+" liters");
							System.out.println();
						}
						else if (Nascarfuel >100) {
							System.out.println("Your Car's Fuel filled 100 liters");
							System.out.println();
							Nascarfuel = 100;
						}
					}
					System.out.println();
					System.out.println("Car Status ");
					System.out.println("Machine Name : " + Nascarname);
					System.out.println("Distance : " + Nascardistance + " Km");
					System.out.println("Fuel :" + Nascarfuel +" Liters");
					System.out.println("Conditon : " + Nascarcondition);
					list();
					menu = baca.nextInt();
					break;
				}
			}while (menu!=4);
			System.out.println("Thank You for Coming ...");
			break;
		}
		
	}

}
