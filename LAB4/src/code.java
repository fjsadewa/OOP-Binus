import java.util.Scanner;


public class code {

	public static void hitung(String input1) {
		
 	int vowel=0, consonant=0;
	 	for(int i=0; i<input1.length();i++){
			char vl = input1.charAt(i);
	 		if(vl == 'a'|| vl == 'e'|| vl == 'i' ||vl == 'o' ||vl == 'u'){
			vowel++;
			}
			else if (vl !=' ') {
			consonant++;	
			}	
	 	}

		System.out.println("Vowel Count : "+vowel);
		System.out.println("Consonant Count : "+consonant);
	}
	
	public static void cetak(String input1,int input2) {
		// buat nyetak 
		int i=0;
		
		char index = input1.charAt(i);		
//		while(index<input2) {
			System.out.println(index);
			i++;
			System.out.println(index);
//		}

		for (i=0;i<input1.length();) {
			System.out.print(input1.charAt(i)+ " ");
			i++;
			}
		System.out.println("");
	}
	
	public static void main(String[] args) {

		Scanner baca = new Scanner (System.in);
		
		String input1 = new String(); 
		int input2;
 		
		System.out.println("Welcome to text Game 4.0");
		System.out.println("========================");
		do {
			System.out.println("Input your [data 5-30 characters] :");
			input1 = baca.nextLine();
		}while(input1.length()<5 || input1.length()>30);
		
		
		System.out.println("Please assign text formating");
		do{
			System.out.println("Input Configuration [2-18] :");
			input2 = baca.nextInt();
		}while (input2 < 2 || input2 > 18);
		
		cetak(input1,input2);
		System.out.println("Word Summary :");
		System.out.println("======================== \n");
		hitung(input1);
		System.out.println("------------------------ \n");

		
	}

}
