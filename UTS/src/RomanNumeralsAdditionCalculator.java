
import java.util.Scanner;

class Input_pertama {
	int hasil_satu;

	Input_pertama (){
		this.hasil_satu=0;
	}
	
	public static int daftar(char hruf) {
		if (hruf == 'I')
			return 1;
		if (hruf == 'V')
			return 5;
		if (hruf == 'X')
			return 10;
		if (hruf == 'L')
			return 50;
		if (hruf == 'C')
			return 100;
		if (hruf == 'D')
			return 500;
		if (hruf == 'M')
			return 1000;
		return -1;
	}
	
	public int Convert1(String Input_satu) {
		
		for (int i = 0; i <Input_satu.length(); i++) {
			int  hruf_awal = daftar(Input_satu.charAt(i));
			if (i + 1 < Input_satu.length()) {
				int hruf_dua = daftar(Input_satu.charAt(i+1));
				if (hruf_awal >= hruf_dua) {
					hasil_satu = hasil_satu + hruf_awal;
				}
				else {
					hasil_satu = hasil_satu + hruf_dua - hruf_awal;
					i++;
				}
			}
			else {
				hasil_satu = hasil_satu + hruf_awal;
			}
		}
		return hasil_satu;
	}
}

class Input_kedua {
	int hasil_dua;
	
	Input_kedua (){
		this.hasil_dua=0;
	}
	
	public static int daftar(char hruf) {
		if (hruf == 'I')
			return 1;
		if (hruf == 'V')
			return 5;
		if (hruf == 'X')
			return 10;
		if (hruf == 'L')
			return 50;
		if (hruf == 'C')
			return 100;
		if (hruf == 'D')
			return 500;
		if (hruf == 'M')
			return 1000;
		return -1;
	}
	
	public int Convert2(String Input_dua) {
		
		for (int i = 0; i <Input_dua.length(); i++) {
			int  hruf_awal = daftar(Input_dua.charAt(i));
			if (i + 1 < Input_dua.length()) {
				int hruf_dua = daftar(Input_dua.charAt(i+1));
				if (hruf_awal >= hruf_dua) {
					hasil_dua = hasil_dua + hruf_awal;
				}
				else {
					hasil_dua = hasil_dua + hruf_dua - hruf_awal;
					i++;
				}
			}
			else {
				hasil_dua = hasil_dua + hruf_awal;
			}
		}
		return hasil_dua;
	}
}

	
public class RomanNumeralsAdditionCalculator {
	
    private static String Convertroman(int hasil_akhir) {
        return String.valueOf(new char[hasil_akhir]).replace('\0', 'I')
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");
    }
    
    
	public static void main(String[] args) {
		
	//Variable
	String Input_satu, Input_dua;
	int hasil_akhir;
	
	//Deklarasi object
	Scanner baca = new Scanner(System.in);
	Input_pertama satu = new Input_pertama();
	Input_kedua dua = new Input_kedua();

	//Input
		System.out.println("Input :");
		System.out.print("1st Number :");
		Input_satu = baca.nextLine();
		System.out.print("2nd Number :");
		Input_dua = baca.nextLine();
	
	//Program
		int awal = satu.Convert1(Input_satu);
		int akhir = dua.Convert2(Input_dua);
		hasil_akhir = awal + akhir;
		String hasil = RomanNumeralsAdditionCalculator.Convertroman(hasil_akhir);
		
		
		
	//print
		System.out.println("Result");
		System.out.println(Input_satu+" + "+Input_dua +" = " +hasil);
		//System.out.println(satu.hasil_satu+" + "+dua.hasil_dua +" = "+hasil_akhir);
		System.out.println("Steps :");
		System.out.println("Input : "+Input_satu+" + "+Input_dua);
		
		
		
	}
	

}
