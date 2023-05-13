////////////////////////////////////////////////////////////////////
// FABIO MENEGHINI 2034332
// NICOLA LAZZARIN 2042376
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerToRomanTest {
    @Test
    public void testConvertOne() {
        String one=IntegerToRoman.convert(1);
        String expectedOne="I";
        assertEquals(one,expectedOne);
    }

    @Test
    public void testConvertTwo() {
        String two=IntegerToRoman.convert(2);
        String expectedTwo="II";
        assertEquals(two,expectedTwo);
    }

    @Test
    public void testConvertThree() {
        String three=IntegerToRoman.convert(3);
        String expectedThree="III";
        assertEquals(three,expectedThree);
    }

}
