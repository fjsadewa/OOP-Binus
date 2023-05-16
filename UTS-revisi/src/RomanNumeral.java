
import java.util.*;


public class RomanNumeral {
	
	public static String checksub_satu (String Input_satu) {
		String replace ="";
		if (Input_satu.contains("IV")) {
			replace = Input_satu.replace("IV", "IIII");
			return replace;
		}
		else if(Input_satu.contains("IX")){
			replace = Input_satu.replace("IX", "VIIII");
			return replace;
		}
		else if(Input_satu.contains("XL")){
			replace = Input_satu.replace("XL", "XXXX");
			return replace;
		}
		else if(Input_satu.contains("XC")){
			replace = Input_satu.replace("XC", "LXXXX");
			return replace;
		}
		else if(Input_satu.contains("CD")){
			replace = Input_satu.replace("CD", "CCCC");
			return replace;
		}
		else if(Input_satu.contains("CM")){
			replace = Input_satu.replace("CM", "DCCCC");
			return replace;
		}
		else return Input_satu;
	
	}
	
	public static String checksub_dua (String Input_dua) {
		String replace ="";
		if (Input_dua.contains("IV")) {
			replace = Input_dua.replace("IV", "IIII");
			return replace;
		}
		else if(Input_dua.contains("IX")){
			replace = Input_dua.replace("IX", "VIIII");
			return replace;
		}
		else if(Input_dua.contains("XL")){
			replace = Input_dua.replace("XL", "XXXX");
			return replace;
		}
		else if(Input_dua.contains("XC")){
			replace = Input_dua.replace("XC", "LXXXX");
			return replace;
		}
		else if(Input_dua.contains("CD")){
			replace = Input_dua.replace("CD", "CCCC");
			return replace;
		}
		else if(Input_dua.contains("CM")){
			replace = Input_dua.replace("CM", "DCCCC");
			return replace;
		}
		else return Input_dua;
	
	}
	
	public static String checkadd(String Hasil_input) {
		String replace ="";
			if (Hasil_input.contains("IIII")) {
				replace = Hasil_input.replace("IIII", "IV");
				return replace;
			}
			else if (Hasil_input.contains("IIIII")) {
				replace = Hasil_input.replace("IIIII", "V");
				return replace;
			}
			else if (Hasil_input.contains("VV")) {
				replace = Hasil_input.replace("VV", "X");
				return replace;
			}
			else if(Hasil_input.contains("VIIII")){
				replace = Hasil_input.replace("VIIII", "IX");
				return replace;
			}
			else if(Hasil_input.contains("XXXX")){
				replace = Hasil_input.replace("XXXX", "XL");
				return replace;
			}
			else if(Hasil_input.contains("XXXXX")){
				replace = Hasil_input.replace("XXXXX", "L");
				return replace;
				}
			else if (Hasil_input.contains("LL")) {
				replace = Hasil_input.replace("LL", "C");
				return replace;
			}
			else if (Hasil_input.contains("CCCCC")) {
				replace = Hasil_input.replace("CCCCC", "D");
				return replace;
				}
			else if(Hasil_input.contains("LXXXX")){
				replace = Hasil_input.replace("LXXXX", "XC");
				return replace;
			}
			else if(Hasil_input.contains("CCCC")){
				replace = Hasil_input.replace("CCCC", "CD");
				return replace;
			}
			else if(Hasil_input.contains("DD")){
				replace = Hasil_input.replace("DD", "M");
				return replace;
				}
			else if(Hasil_input.contains("DCCCC")){
				replace = Hasil_input.replace("CM", "DCCCC");
				return replace;
			}
		return Hasil_input;
	}
	
	public static void main(String[] args) {
		Scanner baca = new Scanner(System.in);
		ArrayList<String> substractive = new ArrayList<String>(Arrays.asList("IV","IX","XL","XC","CD","CM"));
		ArrayList<String> additive = new ArrayList<String>(Arrays.asList("IIII","VIIII","XXXX","LXXXX","CCCC","DCCCC"));
		//System.out.println(substractive);
		
		String Input_satu, Input_dua,Hasil_input;
		
		System.out.println("Welcome to Roman Numerals Addition Calculator");
		System.out.println("Input :");
		System.out.print("1st Number :");
		Input_satu = baca.nextLine();
		System.out.print("2nd Number :");
		Input_dua = baca.nextLine();
		
		//substractive to additive
		String hasilsubsatu = RomanNumeral.checksub_satu(Input_satu);
		String hasilsubdua = RomanNumeral.checksub_dua(Input_dua);
		System.out.println("Steps : ");
		System.out.print("Input  : ");
		System.out.println(Input_satu+" + "+Input_dua);
		System.out.println("\nConvert  any subtractive notation to additive notation to get :");
		System.out.println(hasilsubsatu+" + "+hasilsubdua);
				
		//gabungan
		Hasil_input = hasilsubsatu+hasilsubdua;
		System.out.println("\nCombine the two numerals into one to get:");
		System.out.println(Hasil_input);
		
		//sorting
		System.out.println("\nSort the symbols highest to lowest to get\n");
		
		//simplyfy
		String simple1 = RomanNumeral.checkadd(Hasil_input);
		System.out.println("\nSimplify by replacing symbols, from right to left:");
		System.out.println("First check");
		System.out.println(simple1);
		String simple2 = RomanNumeral.checkadd(simple1);
		System.out.println("Second check");
		System.out.println(simple2);
		
		//additive to substractive
		String answer = RomanNumeral.checkadd(simple2);
		System.out.println("\nConvert any additive notation back to subtractive notation to get:");
		System.out.println("Result : ");
		System.out.println(answer);
       
	}

}
