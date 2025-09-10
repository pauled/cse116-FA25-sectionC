package week3;

import org.junit.Test;
import week1.PlusMinus;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestPlusMinus {
    @Test
    public void testLetter(){
        HashMap<Integer,String> test=new HashMap<>();
        test.put(107,"A");
        test.put(100,"A");
        test.put(103,"A");
        test.put(102,"A");
        test.put(99,"A");
        test.put(98,"A");
        test.put(97,"A");
        test.put(95,"A");
        test.put(93,"A");
        test.put(92,"A");
        test.put(90,"A");
        test.put(89,"B");
        test.put(88,"B");
        test.put(87,"B");
        test.put(85,"B");
        test.put(83,"B");
        test.put(82,"B");
        test.put(80,"B");
        test.put(79,"C");
        test.put(78,"C");
        test.put(77,"C");
        test.put(75,"C");
        test.put(73,"C");
        test.put(72,"C");
        test.put(70,"C");
        test.put(69,"D");
        test.put(68,"D");
        test.put(67,"D");
        test.put(65,"D");
        test.put(63,"D");
        test.put(62,"D");
        test.put(60,"D");
        test.put(59,"F");
        test.put(58,"F");
        test.put(57,"F");
        test.put(55,"F");
        test.put(53,"F");
        test.put(52,"F");
        test.put(50,"F");
        test.put(49,"F");
        test.put(38,"F");
        test.put(27,"F");
        test.put(15,"F");
        test.put(3,"F");
        test.put(12,"F");
        test.put(20,"F");
        for (Integer testCase : test.keySet()){
            int score=testCase;
            String actual=PlusMinus.letter(score);
            String expected=test.get(testCase);
            assertEquals("letter("+score+")",expected, actual);
        }
        //assertEquals("letter(99)","A ", PlusMinus.letter(99));
    }

    @Test
    public void testPM(){
        HashMap<Integer,String> test=new HashMap<>();
        test.put(107,"+");
        test.put(100,"+");
        test.put(103,"+");
        test.put(102,"+");
        test.put(99,"+");
        test.put(98,"+");
        test.put(97,"+");
        test.put(95,"");
        test.put(93,"");
        test.put(92,"-");
        test.put(90,"-");
        test.put(89,"+");
        test.put(88,"+");
        test.put(87,"+");
        test.put(85,"");
        test.put(83,"");
        test.put(82,"-");
        test.put(80,"-");
        test.put(79,"+");
        test.put(78,"+");
        test.put(77,"+");
        test.put(75,"");
        test.put(73,"");
        test.put(72,"-");
        test.put(70,"-");
        test.put(69,"+");
        test.put(68,"+");
        test.put(67,"+");
        test.put(65,"");
        test.put(63,"");
        test.put(62,"-");
        test.put(60,"-");
        test.put(59,"");
        test.put(58,"");
        test.put(57,"");
        test.put(55,"");
        test.put(53,"");
        test.put(52,"");
        test.put(50,"");
        test.put(49,"");
        test.put(38,"");
        test.put(27,"");
        test.put(15,"");
        test.put(3,"");
        test.put(12,"");
        test.put(20,"");
        for (Integer testCase : test.keySet()){
            int score=testCase;
            String actual=PlusMinus.pm(score);
            String expected=test.get(testCase);
            assertEquals("letter("+score+")",expected, actual);
        }
        //assertEquals("letter(99)","A ", PlusMinus.letter(99));
    }
    @Test
    public void testDoubles(){
        double bad=0;
        int size=10;
        for (int x=0;x<size;x++){
            bad+=.1;
        }
        assertEquals(.1*size,bad,.001);
        //assertTrue((.1*size)+"=="+bad,.1*size==bad);
    }
}
