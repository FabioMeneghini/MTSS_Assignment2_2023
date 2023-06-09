////////////////////////////////////////////////////////////////////
// FABIO MENEGHINI 2034332
// NICOLA LAZZARIN 2042376
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    /*private*/ public static String printAsciiArt(String romanNumber) {
       if(romanNumber.equals("")) {
            return "";
         }
    
        String[] I= {" _____ ",
                     "|_   _|",
                     "  | |  ",
                     "  | |  ",
                     " _| |_ ",
                     "|_____|"};
        String[] V= {"__      __",
                   "\\ \\    / /",
                   " \\ \\  / / ",
                   "  \\ \\/ /  ",
                   "   \\  /   ",
                   "    \\/    "};
        String[] X= {"__   __",
                   "\\ \\ / /",
                    " \\ V / ",
                     "  > <  ",
                    " / . \\ ",
                   "/_/ \\_\\"};
        String[] L= {" _      ",
                     "| |     ",
                     "| |     ",
                     "| |     ",
                     "| |____ ",
                     "|______|"};
        String[] C= {"  _____ ",
                     " / ____|",
                     "| |     ",
                     "| |     ",
                     "| |____ ",
                     " \\_____|"};
        String[] D= {" _____  ",
                     "|  __ \\ ",
                     "| |  | |",
                     "| |  | |",
                     "| |__| |",
                     "|_____/ "};
        String[] M= {" __  __ ",
                     "|  \\/  |",
                     "| \\  / |",
                     "| |\\/| |",
                     "| |  | |",
                     "|_|  |_|"};

            String ret="";
            for(int i=0; i<6; ++i) {
                for(int j=0; j<romanNumber.length(); ++j) {
                if(romanNumber.charAt(j)=='I') {
                    ret+=I[i];
                }
                else if(romanNumber.charAt(j)=='V') {
                    ret+=V[i];
                }
                else if(romanNumber.charAt(j)=='X') {
                    ret+=X[i];
                }
                else if(romanNumber.charAt(j)=='L') {
                    ret+=L[i];
                }
                else if(romanNumber.charAt(j)=='C') {
                    ret+=C[i];
                }
                else if(romanNumber.charAt(j)=='D') {
                    ret+=D[i];
                }
                else if(romanNumber.charAt(j)=='M') {
                    ret+=M[i];
                }
                else {
                    return "";
                }
            }
            ret+='\n';
        }
        return ret;
    }
}