////////////////////////////////////////////////////////////////////
// FABIO MENEGHINI 2034332
// NICOLA LAZZARIN 2042376
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerToRomanTest {
	@Test
    public void testConvertZero() {
        String zero=IntegerToRoman.convert(0);
        String expectedZero="";
        assertEquals(expectedZero,zero);
    }
    @Test
    public void testConvertOne() {
        String one=IntegerToRoman.convert(1);
        String expectedOne="I";
        assertEquals(expectedOne,one);
    }

    @Test
    public void testConvertTwo() {
        String two=IntegerToRoman.convert(2);
        String expectedTwo="II";
        assertEquals(expectedTwo,two);
    }

    @Test
    public void testConvertThree() {
        String three=IntegerToRoman.convert(3);
        String expectedThree="III";
        assertEquals(expectedThree,three);
    }
    
    
    @Test
    public void testConvertNegativeOne() {
        String negativeOne=IntegerToRoman.convert(-1);
        String expectedNegativeOne="I";
        assertEquals(expectedNegativeOne,negativeOne);
    }

    @Test
    public void testConvertFive() {
        String five=IntegerToRoman.convert(5);
        String expectedFive="V";
        assertEquals(expectedFive,five);
    }

    @Test
    public void testConvertSix() {
        String six=IntegerToRoman.convert(6);
        String expectedSix="VI";
        assertEquals(expectedSix,six);
    }

}
