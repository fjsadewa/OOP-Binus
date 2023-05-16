import java.util.Random;
import java.util.Scanner;

public class code {

	public static int ran_num(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max-min)+min;
	}
	
	public static void list () {
		System.out.println("Guess Multiplication Random Matrix\n");
		System.out.println("1. level 1");
		System.out.println("2. level 2");
		System.out.println("3. level 3");
		System.out.println("4. Exit");
		System.out.println("Choose = ");
	}
	
	public static void anscheck (int input, int angka1,int angka2) {
		int hasil;
		hasil = angka1 * angka2;
		 if (input == hasil) {
			 System.out.println("You are briliant!");
		 }
		 else {
				 System.out.println("You are wrong!");
		 }
		
	}
	
	public static void main(String[] args) {
		
		int input;
		Scanner baca = new Scanner(System.in);
		Random rand = new Random();
		int random_number1 = rand.nextInt(4);
		int random_number2 = rand.nextInt(4); 
		int random_number3 = rand.nextInt(4); 
		int random_number4 = rand.nextInt(4); 
		int angka1,angka2;
		final int Maxrow = 5;
		final int Maxcollum = 5;
		int exit;
		
		int [] [] matrix = new int [Maxrow][Maxcollum];
		
		list();
		exit = baca.nextInt();
		do {
		switch (exit) {
		case 1:	
			// input
			for (int i = 0; i<Maxrow;i++) {
				for (int j = 0; j<Maxcollum;j++) {
					matrix[i][j]= ran_num(0,10);		
				}
			}
			
			//print
			for(int row=0; row<Maxrow; row++)
			{
				for(int column=0; column<Maxcollum; column++)
				{
					System.out.print("["+ row +"]["+column+"]");
					System.out.printf(" %2d ",matrix[row][column]);
				}
				System.out.println();
			}
			
			angka1 = matrix[random_number1][random_number2];
			angka2 = matrix[random_number3][random_number4];
			
			
			System.out.println("\nWhat is the result of angka ["+random_number1+"]["+random_number2+"] times angka ["+random_number3+"]["+random_number4+"] ?");
			input = baca.nextInt();
			anscheck(input,angka1,angka2);
			list();
			System.out.println("Continue ?");
			exit = baca.nextInt();
		break;
		case 2:
			
			// input
			for (int i = 0; i<Maxrow;i++) {
				for (int j = 0; j<Maxcollum;j++) {
					matrix[i][j]= ran_num(10,100);		
				}
			}
			
			//print
			for(int row=0; row<Maxrow; row++)
			{
				for(int column=0; column<Maxcollum; column++)
				{
					System.out.print("["+ row +"]["+column+"]");
					System.out.printf(" %2d ",matrix[row][column]);
				}
				System.out.println();
			}
			
			angka1 = matrix[random_number1][random_number2];
			angka2 = matrix[random_number3][random_number4];
			
			
			System.out.println("\nWhat is the result of angka ["+random_number1+"]["+random_number2+"] times angka ["+random_number3+"]["+random_number4+"] ?");
			input = baca.nextInt();
			anscheck(input,angka1,angka2);
			list();
			exit = baca.nextInt();
		break;
		case 3:
			
			// input
			for (int i = 0; i<Maxrow;i++) {
				for (int j = 0; j<Maxcollum;j++) {
					matrix[i][j]= ran_num(100,1000);		
				}
			}
			
			//print
			for(int row=0; row<Maxrow; row++)
			{
				for(int column=0; column<Maxcollum; column++)
				{
					System.out.print("["+ row +"]["+column+"]");
					System.out.printf(" %2d ",matrix[row][column]);
				}
				System.out.println();
			}
			
			angka1 = matrix[random_number1][random_number2];
			angka2 = matrix[random_number3][random_number4];
			
			
			System.out.println("\nWhat is the result of angka ["+random_number1+"]["+random_number2+"] times angka ["+random_number3+"]["+random_number4+"] ?");
			input = baca.nextInt();
			anscheck(input,angka1,angka2);
			list();
			exit = baca.nextInt();
		break;
		}
		
			
		}while (exit!=4);
			
		
	}

}
