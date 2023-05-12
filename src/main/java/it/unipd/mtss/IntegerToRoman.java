////////////////////////////////////////////////////////////////////
// [NOME1] [COGNOME1] [MATRICOLA1]
// [NOME2] [COGNOME2] [MATRICOLA2]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
	public static String convert(int number){
		// TODO
		//return null;
		
		String[] thousands = {"", "M", "MM", "MMM"};  
		String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};  
		String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
		String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
		return thousands[number / 1000] + hundreds[(number % 1000) / 100] + tens[(number % 100) / 10] + units[number % 10];  
	}
}
