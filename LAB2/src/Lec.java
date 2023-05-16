import java.util.Scanner;
import java.util.InputMismatchException;

public class Lec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       Scanner baca = new Scanner(System.in);
	       
	       
	       Random rand = new Random(); 
	       int random_number; 
	       random_number = rand.nextInt(50); 
	       System.out.println(random_number);

	       
/*	       int angka;
	       System.out.println("Masukkan angka"); 
	       angka = baca.nextInt(); 
*/
/*		int number1 ,number2; 
	       int i,j; 
	       try {
	            System.out.println("Please enter a number ");
	            number1 = baca.nextInt(); 
	            System.out.println("Please enter a number ");
	             number2 = baca.nextInt();  
	       }catch (InputMismatchException ex){
	           System.out.println("Salah Tipe Data ");
	       }

 	       
 
	       for (i=0; i<number1; i++){
	           System.out.println("This is line "+i);
	           if (i==5)
	                continue; 
	       }

	       for (i=0; i<number1; i++){
	           for (j=0; j<number1; j++)
	               System.out.print(" "+i); 
	           System.out.println();
	          
	        }
	        
	        for (i=0; i<number1; i++){
	           for (j=0; j<number2; j++)
	               System.out.print(" "+i); 
	           System.out.println();
	          
	        }

	        for (i=0; i<number1; i++){
	            for (j=0; j<number2; j++){
	                System.out.print(" "+i); 
	              System.out.println();
	            }      
	           
	         }
*/
/*       
	       switch (angka) 
	       {
	       		case (1) :
	       		{
	       			System.out.println("100% WFO");
	       			System.out.println("Test antigen random sebulan sekali");
	       			break;
	       		}
	       		case (2) :
	       		{
	       			System.out.println("75% WFO");
	       			System.out.println("Test antigen random setiap dua minggu");
	       			break;
	       		}
	       		case (3) :
	       		{
	       			System.out.println("50% WFO");
	       			System.out.println("Test antigen random setiap dua minggu");
	       			break;
	       		}
	       		case (4) :
	       		{
	       			System.out.println("100% WFH");
	       			break;
	       		}
	       }
*/	       
	       /*   
	       //dengan if 
	       if (angka%2 ==0){
	           System.out.println(angka + "Bilangan Genap ");
	       }
	       else {
	           System.out.println(angka + "Bilangan Ganjil  ");
	       }
	       
	      
	       //dengan switch 
	       switch (angka%2) {
	           case (0) : {
	                         System.out.println(angka + "Bilangan Genap ");
	                         break; 
	                      } 
	           case (1) : {
	                         System.out.println(angka + "Bilangan Ganjil ");
	                         break; 
	                      } 
	           default : {
	                        System.out.println("Salah Input");
	                        break; 
	                      }
	       }
	       
	       String hasil; 
	       hasil = (angka%2 ==0? " Genap" : " Ganjil");
	       System.out.println(angka + hasil);
	       */
	       
	}

}
