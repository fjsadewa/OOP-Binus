import java.util.Scanner;

public class code {
	
	public static void list () {
		System.out.println("\nFibonacci Number Calculation");
		System.out.println("========================");
		System.out.println("1. Fibonacci ");
		System.out.println("2. Fibonacci with step ");
		System.out.println("3. Exit ");
		System.out.println("Choose");
	}

	
	public static int fibonacci (int input) {
		 if (input <= 1)
	            return input;
		 return fibonacci(input - 1)
		            + fibonacci(input - 2);
	}
	
	public static int fibonacci2 (int input) {
		 if (input <= 1)
	            return input;
		 System.out.printf(" fibonacci <%d> = fibonacci <%d> + fibonacci<%d>\n",input,input-1,input-2);
	     S 
		 return fibonacci(input - 1)
		            + fibonacci(input - 2);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner baca = new Scanner (System.in);
		int input;
		int pilih;
		
		do {
			list ();
			pilih = baca.nextInt();
			while (pilih <1 || pilih >3) {
				System.out.println("The number you entered is wrong\n");
				list ();
				pilih = baca.nextInt();
			}
			switch (pilih) {
			case 1: 
				do {
					System.out.println("Input the Number [1-20] :");
					input = baca.nextInt();
					if (input == 1) {
						System.out.println("The result of fibonacci");
						System.out.println(" fibonacci <"+input+"> = 1");
					}
					else {
						fibonacci(input);
						System.out.println(" fibonacci <"+input+"> = "+fibonacci(input));
					}
				}while(input<1 || input>20);
			break;
			case 2: 
				do {
					System.out.println("Input the Number [1-20] :");
					input = baca.nextInt();
					if (input == 1) {
						System.out.println("The result of fibonacci");
						System.out.println(" fibonacci <"+input+"> = 1");
					}
					else {
						fibonacci2(input);
						
				        System.out.println("\n fibonacci <" + input +"> = "+ fibonacci(input));
				        System.out.print("The Series of fibonacci "+input+" = ");
				        for (int i = 0; i < input; i++) {
				        	  
				            System.out.print(fibonacci(i) + " ");
				        }
				        
				        System.out.print(fibonacci(input));
					}
				}while(input<1 || input>20);
			break;
			}
			
		}while(pilih!=3);
		
	}

}
