package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    System.out.println(RecursionMath.recursiveDivision(36, 3));
        assertEquals(12,  RecursionMath.recursiveDivision(36, 3));
        System.out.println(RecursionMath.recursiveDivision(36, 18));
        assertEquals(2,  RecursionMath.recursiveDivision(36, 18));
        System.out.println(RecursionMath.recursiveDivision(56,1));
        assertEquals(56,  RecursionMath.recursiveDivision(56, 1));
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
    	


    	assertEquals(36,  RecursionMath.recursivePower(6,2));
    	
    	
    
    	assertEquals(65536,  RecursionMath.recursivePower(2,16));
    	
    	
    	assertEquals(125,  RecursionMath.recursivePower(5, 3));
    }
}
