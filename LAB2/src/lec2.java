import java.util.Scanner;

public class lec2 {
	public static void main(String[] args) {
		int number1, number2;
		int i=0;
		int j=0;
		Scanner baca = new Scanner(System.in);
		System.out.println("Masukkan angka1");
		number1 = baca.nextInt();
		System.out.println("Masukkan angka2");
		number2 = baca.nextInt();
				
		
/*		for (int i = 0; i<number1;i++) {
			System.out.println("This is line " + i);
		}

		for (int i=0;i<number1; i++) {
			for (int j=0;j<number2;j++) 
				System.out.println(" "+i);
			System.out.println();
		}
*/
		while (i<number1){
			System.out.println("This is line " + i);
			i++;
		}
		while (i<number1) {
			while (j<number2) {
				System.out.println(" "+i);
				j++;
			}
			i++;
			System.out.println();
		}
	
	
	}
	
}
