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
        assertEquals(asciiArt, expected);
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
        assertEquals(asciiArt, expected);
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
        assertEquals(asciiArt, expected);
    }

}
