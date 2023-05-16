//FILIPUS JUNIO SADEWA - 2440100121

import java.util.Scanner;

public class Code 
{

	public static void main(String[] args) 
	{
		int input_cus, menu, tagihan, harga1, harga2, order, bayar, sisa;
		int cekinput=0;
		do {
			System.out.println("Selamat datang di toko kita bersama");
			System.out.println("Anda yang beli, kami yang minum\n");
			
			Scanner fitur = new Scanner(System.in);
			System.out.println("Kamu mau ngapain nih ? :");
			System.out.println("1. Order Boba");
			System.out.println("2. Pays");
			System.out.println("3. Exit");
			
			System.out.println("Masukkan pilihanmu : ");
			input_cus = fitur.nextInt();
				
				if (input_cus == 1) 
				{
					System.out.println("Menu :");
					System.out.println("1. Fire Chocolate Boba ( Rp. 75000,-)");
					System.out.println("2. Water Green Tea Boba ( Rp. 55000,-)");
					menu = fitur.nextInt();
						if (menu == 1) 
						{
							System.out.println("Mau order berapa ? ");
							order = fitur.nextInt();
							
							harga1 =75000; 
							tagihan = harga1*order;
							
							System.out.println("Totalnya segini ya kak :" + tagihan );
							System.out.println("Berapa uang mu ? ");
							bayar = fitur.nextInt();
							
							sisa = bayar-tagihan;
							
							System.out.println("Nih Kembalian mu :" + sisa );
							System.out.println("Terima Kasih sudah datang <3");
							
						 // belum bisa kembali ke menu
						}
						else if (menu == 2) 
						{
							System.out.println("Mau order berapa ? ");
							order = fitur.nextInt();
							
							harga2 =55000; 
							tagihan = harga2 *order;
							
							System.out.println("Totalnya segini ya kak :" + tagihan );
							System.out.println("Berapa uang mu ? ");
							bayar = fitur.nextInt();
							
							sisa = bayar-tagihan;
							
							System.out.println("Nih Kembalian mu :" + sisa );
							// kembali belum bisa ke menu
						}
						
				else if (input_cus == 2) {
					System.out.println("You are not buying anything");
					System.out.println("Go back to main menu");
					}
				else if (input_cus == 3){
					System.exit(0);
					cekinput = 1;
					}
				}
		}
		while (cekinput==0);
	}
}
