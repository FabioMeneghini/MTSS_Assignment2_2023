////////////////////////////////////////////////////////////////////
// [NOME1] [COGNOME1] [MATRICOLA1]
// [NOME2] [COGNOME2] [MATRICOLA2]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
	
	public static String print(int num){
		return printAsciiArt(IntegerToRoman.convert(num));
	}

	/*private*/ public static String printAsciiArt(String romanNumber){
		String[] I= {" _____ ", "|_   _|", "  | |  ", "  | |  ", " _| |_ ", "|_____|"};
		
		/*String ret="";
		for(int i=0; i<6; i++) {
			if(romanNumber.charAt(i)=='I') {
				for(int j=0; i<romanNumber.length(); j++) ret+=I[i];
			}
		}*/
		if(romanNumber.equals("I")) return " _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|";
		else if(romanNumber.equals("II")) return " _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n _____ \\n|_   _|\\n  | |  \\n  | |  \\n _| |_ \\n|_____|";
		else/* if(romanNumber.equals("III")) */return " _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n _____ \\n|_   _|\\n  | |  \\n  | |  \\n _| |_ \\n|_____|\n _____ \\n|_   _|\\n  | |  \\n  | |  \\n _| |_ \\n|_____|";
		
		//return ret;
	}
}