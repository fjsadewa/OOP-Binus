	// Program to convert Roman
	// Numerals to Numbers
	import java.util.*;
	
public class calculator {
	    public static void main(String[] args) {
	      //  for (int n = 1; n <= 4999; n++) {
	            String roman = calculator.toRoman(19);
	           // int number = calculator.toNumber(roman);

	          //  System.out.println(number + " = " + roman);
	            System.out.println(roman);
	        //}
	    }

	    private static String toRoman(int number) {
	        return String.valueOf(new char[number]).replace('\0', 'I')
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
/*
	    private static Integer toNumber(String roman) {
	        return roman.replace("CM", "DCD")
	                .replace("M", "DD")
	                .replace("CD", "CCCC")
	                .replace("D", "CCCCC")
	                .replace("XC", "LXL")
	                .replace("C", "LL")
	                .replace("XL", "XXXX")
	                .replace("L", "XXXXX")
	                .replace("IX", "VIV")
	                .replace("X", "VV")
	                .replace("IV", "IIII")
	                .replace("V", "IIIII").length();
	    }
	*/
	}

