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
public class problem5Test {
    
    public problem5Test() {
    }

    @Test
    public void testGreaterThanN() {
        System.out.println("greaterThanN");
        int[] arrayToCheck = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int n = 8;
        int expResult = 7;
        int result = problem5.greaterThanN(arrayToCheck, n);
        assertEquals(expResult, result);
    }
    
}
