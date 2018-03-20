
package byui.cit260.mfbMormonTrail.control;

import Exceptions.CalcHuntingSuccessRateException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samue
 */
public class CalcHuntingSuccessRateTest {
    
    public CalcHuntingSuccessRateTest() {
    }

    /**
     * Test of calculateHuntingSuccessRate method, of class CalculateHuntingSuccessRate.
     */
    @Test
    public void testCalcHuntingSuccessRate() throws CalcHuntingSuccessRateException {
        System.out.println("calcHuntingSuccessRate");
        
        System.out.println("Test Case 1");
       //define input variables
        int teamSkillLevel = 3;
        int resourceAvailablity = 3;
        int expResult = 60;
      //call the method
        double result = CalcHuntingSuccessRate.calcHuntingSuccessRate(teamSkillLevel,resourceAvailablity);
       
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
       System.out.println("Test Case 2");
       //define input variables
        teamSkillLevel = -1;
        resourceAvailablity = 2;
        expResult = -1;
      //call the method
         result = CalcHuntingSuccessRate.calcHuntingSuccessRate(teamSkillLevel,resourceAvailablity);
       
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        
        System.out.println("Test Case 3");
       //define input variables
        teamSkillLevel = 2;
        resourceAvailablity = 4;
        expResult = -2;
      //call the method
         result = CalcHuntingSuccessRate.calcHuntingSuccessRate(teamSkillLevel,resourceAvailablity);
       
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        System.out.println("Test Case 4");
       //define input variables
        teamSkillLevel = 4;
        resourceAvailablity = 2;
        expResult = -1;
      //call the method
         result = CalcHuntingSuccessRate.calcHuntingSuccessRate(teamSkillLevel,resourceAvailablity);
       
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        System.out.println("Test Case 5");
       //define input variables
        teamSkillLevel = 1;
        resourceAvailablity = 1;
        expResult = 20;
      //call the method
         result = CalcHuntingSuccessRate.calcHuntingSuccessRate(teamSkillLevel,resourceAvailablity);
       
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        System.out.println("Test Case 6");
       //define input variables
        teamSkillLevel = 2;
        resourceAvailablity = 3;
        expResult = 50;
      //call the method
         result = CalcHuntingSuccessRate.calcHuntingSuccessRate(teamSkillLevel,resourceAvailablity);
       
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        
        System.out.println("Test Case 7");
       //define input variables
        teamSkillLevel = 3;
        resourceAvailablity = 1;
        expResult = 40;
      //call the method
         result = CalcHuntingSuccessRate.calcHuntingSuccessRate(teamSkillLevel,resourceAvailablity);
       
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        
      
    }

   
   }





