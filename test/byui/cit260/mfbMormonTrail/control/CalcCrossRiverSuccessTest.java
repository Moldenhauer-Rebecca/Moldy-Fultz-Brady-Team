
package byui.cit260.mfbMormonTrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author crmol
 */
public class CalcCrossRiverSuccessTest {
    
    public CalcCrossRiverSuccessTest() {
    }

    /**
     * Test of calcCrossRiverSuccess method, of class CalcCrossRiverSuccess.
     */
    @Test
    public void testCalcCrossRiverSuccess() {
        System.out.println("calcCrossRiverSuccess");
        
        System.out.println("Case1");
        
        int currentSpeed = 2;
        int riverWidth = 2;
        int wagonWeight = 2;
        int riverDepth = 4;
        
        boolean expResult = false;
        
        boolean result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
        
        System.out.println("Case2");
        currentSpeed = 3;
        riverWidth = 3;
        wagonWeight = 3;
        riverDepth = 3;
        
        expResult = true;
        
        result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
        
        System.out.println("Case3");
        currentSpeed = 5;
        riverWidth = 3;
        wagonWeight = 2;
        riverDepth = 3;
        
        expResult = false;
        
        result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
        
        System.out.println("Case4");
        currentSpeed = 3;
        riverWidth = 0;
        wagonWeight = 1;
        riverDepth = 1;
        
        expResult = false;
        
        result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
        
        System.out.println("Case5");
        currentSpeed = 2;
        riverWidth = 2;
        wagonWeight = 0;
        riverDepth = 4;
        
        expResult = false;
        
        result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
        
        System.out.println("Case6");
        currentSpeed = 2;
        riverWidth = 2;
        wagonWeight = 2;
        riverDepth = 6;
        
        expResult = false;
        
        result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
        
        System.out.println("Case7");
        currentSpeed = 2;
        riverWidth = 2;
        wagonWeight = 1;
        riverDepth = 3;
        
        expResult = false; 
                
        result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
        
        System.out.println("Case8");
        currentSpeed = 4;
        riverWidth = 4;
        wagonWeight = 3;
        riverDepth = 1;
        
        expResult = true;
        
        result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
       
    }
    
   
    
}
