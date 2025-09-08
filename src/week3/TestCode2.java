package week3;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestCode2 {
    @Test
    public void testAddPositives(){
        assertEquals(3,TestCode.add(1,2));
        assertEquals(3579,TestCode.add(1234,2345));
        assertEquals(14,TestCode.add(11,3));
        assertEquals(10,TestCode.add(5,5));
    }
    @Test
    public void testAddNegatives(){
        assertEquals(-9,TestCode.add(-11,2));
        assertEquals(9,TestCode.add(-11,20));
        assertEquals(0,TestCode.add(-6,6));
        assertEquals(-10,TestCode.add(5,-15));
        assertEquals(38,TestCode.add(50,-12));
        assertEquals(0,TestCode.add(7,-7));
        assertEquals(-6,TestCode.add(-3,-3));
        assertEquals(-9,TestCode.add(-3,-6));
        assertEquals(-10,TestCode.add(-8,-2));
    }
    @Test
    public void testAddZeros(){
        assertEquals(19,TestCode.add(0,19));
        assertEquals(17,TestCode.add(17,0));
        assertEquals(0,TestCode.add(0,0));
        assertEquals(-5,TestCode.add(-5,0));
        assertEquals(-12,TestCode.add(0,-12));
    }
}
