import java.util.Scanner;

public class code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner baca = new Scanner (System.in);
				int N, H;
				int jarak;
				N=baca.nextInt();
				H=baca.nextInt();
				
					for (int i = 1; i<=H;i++) 
					{
						for (int p=0; p<N;p++) 
						{
							for (jarak=1; jarak <=H-i; ++jarak) 
							{
								System.out.print(" ");
							}
							for (int j= 1;j<=i*2-1;j++) 
							{
								System.out.print("*");
							}
							for (jarak=1; jarak <=H-i; ++jarak) 
							{
								System.out.print(" ");
							}
						}
						System.out.println();
					}
					
						
							for (jarak=1; jarak <=H-2; ++jarak) 
							{
								for (int p=0; p<N-1;p++) 
								{
									for (int b = 1; b<=H-1;b++) 
									{
										System.out.print(" ");
									}
									System.out.print("*");
									for (int b = 1; b<=H-1;b++) 
									{
										System.out.print(" ");
									}
									for (int b = 1; b<=H-1;b++) 
									{
										System.out.print(" ");
									}
									System.out.println("*");
								}
							}
	}
}
