import java.util.Random;
import java.util.Scanner;

public class code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int input;
			int gas=100;
			int exit =1;
			Scanner scanner = new Scanner(System.in);
			Scanner baca = new Scanner(System.in);
			do{
				System.out.println("Created by Filipus Junio Sadewa");
				System.out.println("Your gasoline's car : "+ gas + " liters");
				System.out.println("=============================");
				System.out.println("1. Start Driving");
				System.out.println("2. Rest");
				System.out.println("3. Exit");
				System.out.println("Choose : ");
				input = baca.nextInt();
				
				switch (input) 
				{
					case (1) : 
					{
						Random rand = new Random(); 
					    int random_number; 
					    random_number = rand.nextInt(100); 
					    System.out.println("Your Speed : " + random_number + "km/hour");
					    if (gas == 0) {
					    	System.out.println("Your gasoline is not enough to run the car");
					    }
					    else if (gas != 0 ) 
					    {
					    	 if (random_number >=50) 
					    	 {
					    		if (gas >=20 ) 
					    		{
					    			gas= gas - 40;
					    			System.out.println("You have spent 40 liters gasoline ");
					    		}
					    		else if (gas <20) {
					    		System.out.println("Your gasoline is not enough to run the car");
					    		}
					    	 }
					    	 else if (random_number <50) 
					    	 {
					    		 gas = gas - 20;
					    		 System.out.println("You have spent 20 liters gasoline");
					    	 }
					    	 else if (random_number  <=0) 
					    	 {
					    		 System.out.println("Your car is not moving!");
					    	 }
					    	 
						}
					    System.out.println("Press Enter to back to main menu...\n");
			    	    String readString = scanner.nextLine();
			    	    if(readString.equals(""))
			    	    {
		                    exit = 1;
		                }
					    break;
					}
					case (2) : 
					{
						if (gas != 100 ) {
					    	 gas = gas + 20;
					    	 System.out.println("Succesfully Recharge 20 Liters Gasoline");
						}
						else if (gas == 100) {
					    	System.out.println("Your gasoline is full");
					    }
						System.out.println("Press Enter to back to main menu...\n");
			    	    String readString = scanner.nextLine();
			    	    if(readString.equals(""))
			    	    {
		                    exit = 1;
		                }
			    	    break;
					}
					case (3) : 
					{
						System.out.println("Selamat tinggal");
						exit=0;
						break;
					}
					default : 
					{
						System.out.println("Pilihan hanya 1-3 saja ");
						System.out.println("Press Enter to back to main menu...\n");
			    	    String readString = scanner.nextLine();
			    	    if(readString.equals(""))
			    	    {
		                    exit = 1;
		                }
						break;
					}
				}
			
			}while (exit == 1);
		
	}

} 
