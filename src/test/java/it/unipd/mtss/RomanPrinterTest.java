////////////////////////////////////////////////////////////////////
// FABIO MENEGHINI 2034332
// NICOLA LAZZARIN 2042376
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testAsciiArtOne() {
        String asciiArt=RomanPrinter.printAsciiArt("I");
        String expected=" _____ \n"
                      + "|_   _|\n"
                      + "  | |  \n"
                      + "  | |  \n"
                      + " _| |_ \n"
                      + "|_____|\n";
        assertEquals(expected, asciiArt);
    }

    @Test
    public void testAsciiArtTwo() {
        String asciiArt=RomanPrinter.printAsciiArt("II");
        String expected=" _____  _____ \n"
                      + "|_   _||_   _|\n"
                      + "  | |    | |  \n"
                      + "  | |    | |  \n"
                      + " _| |_  _| |_ \n"
                      + "|_____||_____|\n";
        assertEquals(expected, asciiArt);
    }

    @Test
    public void testAsciiArtThree() {
        String asciiArt=RomanPrinter.printAsciiArt("III");
        String expected=" _____  _____  _____ \n"
                      + "|_   _||_   _||_   _|\n"
                      + "  | |    | |    | |  \n"
                      + "  | |    | |    | |  \n"
                      + " _| |_  _| |_  _| |_ \n"
                      + "|_____||_____||_____|\n";
        assertEquals(expected, asciiArt);
    }
    
    @Test
    public void testAsciiArtFour() {
        String asciiArt=RomanPrinter.printAsciiArt("IV");
        String expected=" _____ __      __\n"
                      + "|_   _|\\ \\    / /\n"
                      + "  | |   \\ \\  / / \n"
                      + "  | |    \\ \\/ /  \n"
                      + " _| |_    \\  /   \n"
                      + "|_____|    \\/    \n";
        assertEquals(asciiArt, expected);
    }
 
    @Test
    public void testAsciiArtSix() {
        String asciiArt=RomanPrinter.printAsciiArt("VI");
        String expected="__      __ _____ \n"
                      + "\\ \\    / /|_   _|\n"
                      + " \\ \\  / /   | |  \n"
                      + "  \\ \\/ /    | |  \n"
                      + "   \\  /    _| |_ \n"
                      + "    \\/    |_____|\n";
        assertEquals(asciiArt, expected);
    }


    @Test
    public void testInvalidValue() {
        String asciiArt=RomanPrinter.printAsciiArt("A123B");
        String expected="";
        assertEquals(expected, asciiArt);
    }
 
    @Test
    public void testInvalidValue2() {
        String asciiArt=RomanPrinter.printAsciiArt("XIAB");
        String expected="";
        assertEquals(expected, asciiArt);
    }


    @Test
    public void testPrintOne() {
        String asciiArt=RomanPrinter.print(1);
        String expected=" _____ \n"
                      + "|_   _|\n"
                      + "  | |  \n"
                      + "  | |  \n"
                      + " _| |_ \n"
                      + "|_____|\n";
        assertEquals(expected, asciiArt);
    }

    @Test
    public void testPrintZero() {
        String asciiArt=RomanPrinter.print(0);
        String expected="";
        assertEquals(expected, asciiArt);
    }

    @Test
    public void testPrintEight() {
        String asciiArt=RomanPrinter.print(8);
        String expected="__      __ _____  _____  _____ \n"
                    + "\\ \\    / /|_   _||_   _||_   _|\n"
                    + " \\ \\  / /   | |    | |    | |  \n"
                    + "  \\ \\/ /    | |    | |    | |  \n"
                    +  "   \\  /    _| |_  _| |_  _| |_ \n"
                    +  "    \\/    |_____||_____||_____|\n";
        assertEquals(expected, asciiArt);
    }

    @Test
    public void testPrintTen() {
        String asciiArt=RomanPrinter.print(10);
        String expected="__   __\n"
                    + "\\ \\ / /\n"
                    +  " \\ V / \n"
                    +   "  > <  \n"
                    +  " / . \\ \n"
                    + "/_/ \\_\\\n";
        assertEquals(expected, asciiArt);
    }

    @Test
    public void testPrintNegativeTen() {
        String asciiArt=RomanPrinter.print(10);
        String expected="__   __\n"
                    + "\\ \\ / /\n"
                    +  " \\ V / \n"
                    +   "  > <  \n"
                    +  " / . \\ \n"
                    + "/_/ \\_\\\n";
        assertEquals(expected, asciiArt);
    }

    @Test
    public void testPrintSeventeen() {
        String asciiArt=RomanPrinter.print(17);
        String expected="__   ____      __ _____  _____ \n"
                    + "\\ \\ / /\\ \\    / /|_   _||_   _|\n"
                    +  " \\ V /  \\ \\  / /   | |    | |  \n"
                    +   "  > <    \\ \\/ /    | |    | |  \n"
                    +  " / . \\    \\  /    _| |_  _| |_ \n"
                    + "/_/ \\_\\    \\/    |_____||_____|\n";
        assertEquals(expected, asciiArt);
    }

    @Test
    public void testPrintTwenty() {
        String asciiArt=RomanPrinter.print(20);
        String expected="__   ____   __\n"
                + "\\ \\ / /\\ \\ / /\n"
                +  " \\ V /  \\ V / \n"
                +   "  > <    > <  \n"
                +  " / . \\  / . \\ \n"
                + "/_/ \\_\\/_/ \\_\\\n";
        assertEquals(expected, asciiArt);
    }

    @Test
    public void testPrintTwentyfour() {
        String asciiArt=RomanPrinter.print(24);
        String expected="__   ____   __ _____ __      __\n"
                + "\\ \\ / /\\ \\ / /|_   _|\\ \\    / /\n"
                +  " \\ V /  \\ V /   | |   \\ \\  / / \n"
                +   "  > <    > <    | |    \\ \\/ /  \n"
                +  " / . \\  / . \\  _| |_    \\  /   \n"
                + "/_/ \\_\\/_/ \\_\\|_____|    \\/    \n";
        assertEquals(expected, asciiArt);
    }

    @Test
    public void testPrintThirtythree() {
        String asciiArt=RomanPrinter.print(33);
        String expected="__   ____   ____   __ _____  _____  _____ \n"
                      + "\\ \\ / /\\ \\ / /\\ \\ / /|_   _||_   _||_   _|\n"
                      +  " \\ V /  \\ V /  \\ V /   | |    | |    | |  \n"
                      +   "  > <    > <    > <    | |    | |    | |  \n"
                      +  " / . \\  / . \\  / . \\  _| |_  _| |_  _| |_ \n"
                      + "/_/ \\_\\/_/ \\_\\/_/ \\_\\|_____||_____||_____|\n";
        assertEquals(expected, asciiArt);
    }

    @Test
    public void testPrintFifty() {
        String asciiArt=RomanPrinter.print(50);
        String expected=" _      \n"
                      + "| |     \n"
                      + "| |     \n"
                      + "| |     \n"
                      + "| |____ \n"
                      + "|______|\n";
        assertEquals(expected, asciiArt);
    }
    
    @Test
    public void testPrintEightythree() {
        String asciiArt=RomanPrinter.print(83);
        String expected=" _      __   ____   ____   __ _____  _____  _____ \n"
                      + "| |     \\ \\ / /\\ \\ / /\\ \\ / /|_   _||_   _||_   _|\n"
                      + "| |      \\ V /  \\ V /  \\ V /   | |    | |    | |  \n"
                      + "| |       > <    > <    > <    | |    | |    | |  \n"
                      + "| |____  / . \\  / . \\  / . \\  _| |_  _| |_  _| |_ \n"
                      + "|______|/_/ \\_\\/_/ \\_\\/_/ \\_\\|_____||_____||_____|\n";
        assertEquals(expected, asciiArt);
    }
    
    @Test
    public void testPrintOneHundred() {
        String asciiArt=RomanPrinter.print(100);
        String expected="  _____ \n"
                      + " / ____|\n"
                      + "| |     \n"
                      + "| |     \n"
                      + "| |____ \n"
                      + " \\_____|\n";
        assertEquals(expected, asciiArt);
    }

}
