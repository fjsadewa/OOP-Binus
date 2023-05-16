import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	/* System.out.println("Wah Hari senin");
	System.out.println("Ada masalah barunih");
	
	tring kata1 ="saya", kata2="ingin", kata3="Cappadocia",kata4;
	kata4=kata1+kata2+kata3;
	System.out.println("keinginan terdalam saya"+kata4);
	
		int angka1, angka2, hasil; 
	    Scanner baca = new Scanner(System.in); 
	  System.out.println("Masukkan angka 1 = ");
	  angka1 = baca.nextInt(); 
	   System.out.println("Masukkan angka 2 = ");
	  angka2 = baca.nextInt(); 
	  hasil = angka1+angka2; 
	  System.out.println("Hasil = " + hasil);

	  String kata1, kata2, hasil;
      System.out.println("Masukkan kata 1 = ");
      Scanner baca = new Scanner (System.in);
      kata1 = baca.nextLine();
      System.out.println("Masukkan kata 2 = ");
      kata2 = baca.nextLine();
      hasil = kata1+" "+kata2;
      System.out.println("Hasil = "+ hasil);
*/
      Scanner input = new Scanner (System.in);
      System.out.print("Enter an integer for second : ");
	  int seconds = input.nextInt();
	  
	  int minutes = seconds / 60;
	  int remainingSeconds = second % 60;
	  System.out.printlnseconds + "second is "+ minutes +"minutes and" + remainingSeconds + "Seconds"();
	
	}

}
