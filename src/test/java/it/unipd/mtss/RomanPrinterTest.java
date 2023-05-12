////////////////////////////////////////////////////////////////////
// [NOME1] [COGNOME1] [MATRICOLA1]
// [NOME2] [COGNOME2] [MATRICOLA2]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanPrinterTest {

	@Test
	public void testAsciiArtOne() {
		String asciiArt=RomanPrinter.printAsciiArt("I");
		String expected=" _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|";
		assertEquals(asciiArt, expected);
	}
	
	@Test
	public void testAsciiArtTwo() {
		String asciiArt=RomanPrinter.printAsciiArt("II");
		String expected=" _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n\n _____ \\n|_   _|\\n  | |  \\n  | |  \\n _| |_ \\n|_____|";
		assertEquals(asciiArt, expected);
	}
	
	@Test
	public void testAsciiArtThree() {
		String asciiArt=RomanPrinter.printAsciiArt("III");
		String expected=" _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n\n _____ \\n|_   _|\\n  | |  \\n  | |  \\n _| |_ \\n|_____|\n\n _____ \\n|_   _|\\n  | |  \\n  | |  \\n _| |_ \\n|_____|";
		assertEquals(asciiArt, expected);
	}

}
