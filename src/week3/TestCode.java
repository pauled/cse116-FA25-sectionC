package week3;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestCode {
    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(0,5));
        System.out.println(add(-5,8));
    }

    @Test
    public void testAdd(){
        assertEquals(3,add(1,2));
        assertEquals(5,add(0,5));
        assertEquals(3,add(-5,8));
    }
}
