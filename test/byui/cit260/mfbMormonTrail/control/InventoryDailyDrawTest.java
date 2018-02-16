/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mike
 */
public class InventoryDailyDrawTest {
    
    public InventoryDailyDrawTest() {
    }

    /**
     * Test of calcInventoryDailyDraw method, of class InventoryDailyDraw.
     */
    @Test
    public void testInventoryDailyDraw() {
        System.out.println("inventoryDailyDraw");
        
        System.out.println("\tTest case 1");
        
        //define the input variables
        int numPeople = 0;
        double inventoryAmount = 0.0;
                
        double expResult = -1; 
       
        
        //call the method
        double result = InventoryDailyDraw.calcInventoryDailyDraw(numPeople, inventoryAmount);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
        
    }
    @Test 
    public void testCase1() {
        double result = InventoryDailyDraw.calcInventoryDailyDraw(4, 1200.0);
        assertEquals(1190.0, result, 0.001);
    }
    
    @Test 
    public void testCase2() {
        double result = InventoryDailyDraw.calcInventoryDailyDraw(0, 900.0);
        assertEquals(-1, result, 0.0);
    }
    
    @Test 
    public void testCase3() {
        double result = InventoryDailyDraw.calcInventoryDailyDraw(2, 0);
        assertEquals(-2, result, 0.0);
    }
    
    @Test 
    public void testCase4() {
        double result = InventoryDailyDraw.calcInventoryDailyDraw(8, 500.00);
        assertEquals(-1, result, 0.0);
    }
    
    @Test 
    public void testCase5() {
        double result = InventoryDailyDraw.calcInventoryDailyDraw(1, 12.5);
        assertEquals(10.0, result, 0.001);
    }
    
    @Test 
    public void testCase6() {
        double result = InventoryDailyDraw.calcInventoryDailyDraw(5, 2000.0);
        assertEquals(1987.5, result, 0.001);
    }
    
    
}
