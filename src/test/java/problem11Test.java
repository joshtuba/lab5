/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author raspb
 */
public class problem11Test {
    
    public problem11Test() {
    }

    @Test
    public void testGetLowest() {
        System.out.println("getLowest");
        int[] justAnArray = {3, 4, 5, 6, 5, 7, 1};
        int expResult = 1;
        int result = problem11.getLowest(justAnArray);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHighest() {
        System.out.println("getHighest");
        int[] justAnArray = {1, 1, 3, 5, 4, 3, 10};
        int expResult = 10;
        int result = problem11.getHighest(justAnArray);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        int[] justAnArray = {1, 2, 3, 4, 5, 4, 3, 2};
        float expResult = 3.0F;
        float result = problem11.getAverage(justAnArray);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        int[] justAnArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expResult = 55;
        int result = problem11.getTotal(justAnArray);
        assertEquals(expResult, result);
    }
    
}
