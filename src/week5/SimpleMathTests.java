package week5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class SimpleMathTests {
    @Test
    public void testFactorialCommon(){
        HashMap<Integer,Integer> testCases=new HashMap<>();

        testCases.put(1,1);
        testCases.put(2,2);
        testCases.put(3,6);
        testCases.put(4,24);
        testCases.put(5,120);
        testCases.put(6,720);
        testCases.put(7,5040);
        testCases.put(8,40320);
        testCases.put(9,362880);

        for (int input : testCases.keySet()){
            int expectedOutput=testCases.get(input);
            int actual=SimpleMath.factorial(input);
            String words="factorial("+input+")";
            assertEquals(words,expectedOutput,actual);
        }
    }

    @Test
    public void testFactorialEdge(){
        HashMap<Integer,Integer> testCases=new HashMap<>();

        testCases.put(0,1);
        testCases.put(-1,-1);
        testCases.put(-2,-1);
        testCases.put(-12,-1);
        testCases.put(-200,-1);
        testCases.put(-100000,-1);
        testCases.put(Integer.MIN_VALUE,-1);

        for (int input : testCases.keySet()){
            int expectedOutput=testCases.get(input);
            int actual=SimpleMath.factorial(input);
            String words="factorial("+input+")";
            assertEquals(words,expectedOutput,actual);
        }
    }
    @Test
    public void testMultiply(){
        ArrayList<MultiplyTestCase> testCases = new ArrayList<>(
                Arrays.asList(
                        new MultiplyTestCase(1,1,1),
                        new MultiplyTestCase(10,5,50),
                        new MultiplyTestCase(-7,-5,35),
                        new MultiplyTestCase(1,-9,-9),
                        new MultiplyTestCase(-11,4,-44)
                )
        );

        for (MultiplyTestCase testCase : testCases){
            int in1=testCase.getInputOne();
            int in2=testCase.getInputTwo();
            int expected=testCase.getExpectedOutput();
            int actual=SimpleMath.multiplyInt(in1,in2);
            String words="multiply("+in1+","+in2+")";
            assertEquals(words,expected,actual);
        }
    }
}
