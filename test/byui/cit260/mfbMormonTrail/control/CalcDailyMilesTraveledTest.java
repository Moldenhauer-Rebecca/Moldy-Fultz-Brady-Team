
package byui.cit260.mfbMormonTrail.control;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author crmol
 */
public class CalcDailyMilesTraveledTest {
    
    public CalcDailyMilesTraveledTest() {
    }
   

    /**
     * Test of calcDailyMilesTraveled method, of class CalcDailyMilesTraveled.
     */
    @Test
    public void testCalcDailyMilesTraveled() {
        System.out.println("calcDailyMilesTraveled");
        
        //----Test case 1
        System.out.println("\tTest case 1");
        
        //define the input variables
        int oxenHealth = 0;
        int teamHealth = 0;
        int wagonWeight = 0;
        
        double expResult = -1; 
       
        
        //call the method
        int result = CalcDailyMilesTraveled.calcDailyMilesTraveled(oxenHealth, teamHealth, wagonWeight);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
        
   
    }
    @Test 
    public void testCase1() {
        int result = CalcDailyMilesTraveled.calcDailyMilesTraveled(6, 6, 1);
        assertEquals(12, result, 0.001);
    }
    
    @Test 
    public void testCase2() {
        int result = CalcDailyMilesTraveled.calcDailyMilesTraveled(-1, 4, 3);
        assertEquals(-1, result, 0.0);
    }
    
    @Test 
    public void testCase3() {
        int result = CalcDailyMilesTraveled.calcDailyMilesTraveled(2, 7, 1);
        assertEquals(-2, result, 0.0);
    }
    
    @Test 
    public void testCase4() {
        int result = CalcDailyMilesTraveled.calcDailyMilesTraveled(2, 2, -1);
        assertEquals(-3, result, 0.0);
    }
    
    @Test 
    public void testCase5() {
        int result = CalcDailyMilesTraveled.calcDailyMilesTraveled(2, 2, 3);
        assertEquals(1, result, 0.001);
    }
    
    @Test 
    public void testCase6() {
        int result = CalcDailyMilesTraveled.calcDailyMilesTraveled(6, 6, 2);
        assertEquals(6, result, 0.001);
    }
     
     
    
}
