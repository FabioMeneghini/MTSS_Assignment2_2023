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
                else {
                    return "";
                }
            }
            ret+='\n';
        }
        return ret;
    }
}