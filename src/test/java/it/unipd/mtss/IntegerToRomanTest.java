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
    
    @Test
    public void testConvertEight() {
        String eight=IntegerToRoman.convert(8);
        String expectedEight="VIII";
        assertEquals(expectedEight,eight);
    }

    @Test
    public void testConvertTen() {
        String ten=IntegerToRoman.convert(10);
        String expectedTen="X";
        assertEquals(expectedTen,ten);
    }
    @Test
    public void testConvertNegativeTen() {
        String negativeTen=IntegerToRoman.convert(-10);
        String expectedNegativeTen="X";
        assertEquals(expectedNegativeTen,negativeTen);
    }
    @Test
    public void testConvertSevenTeen() {
        String sevenTeen=IntegerToRoman.convert(17);
        String expectedSevenTeen="XVII";
        assertEquals(expectedSevenTeen,sevenTeen);
    }

    @Test
    public void testConvertTwenty() {
        String twenty=IntegerToRoman.convert(20);
        String expectedTwenty="XX";
        assertEquals(expectedTwenty,twenty);
    }

}
