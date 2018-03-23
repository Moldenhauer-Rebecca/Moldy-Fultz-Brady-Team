
package byui.cit260.mfbMormonTrail.control;

import Exceptions.CalcCrossRiverSuccessException;
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
     * @throws Exceptions.CalcCrossRiverSuccessException
     */
    @Test
    public void testCalcCrossRiverSuccess() throws CalcCrossRiverSuccessException {
        System.out.println("calcCrossRiverSuccess");
        
        System.out.println("Case1");
        
        int currentSpeed = 2;
        int riverWidth = 2;
        int wagonWeight = 2;
        int riverDepth = 4;
        
        int expResult = 20;
        
        int result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
        
        System.out.println("Case2");
        currentSpeed = 3;
        riverWidth = 3;
        wagonWeight = 3;
        riverDepth = 3;
        
        expResult = 60;
        
        result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
        
        System.out.println("Case3");
        currentSpeed = 4;
        riverWidth = 3;
        wagonWeight = 2;
        riverDepth = 3;
        
        expResult = 60;
        
        result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
        
        System.out.println("Case4");
        currentSpeed = 3;
        riverWidth = 0;
        wagonWeight = 1;
        riverDepth = 1;
        
        expResult = -1;
        
        result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
        
        System.out.println("Case5");
        currentSpeed = 2;
        riverWidth = 2;
        wagonWeight = 0;
        riverDepth = 4;
        
        expResult = -1;
        
        result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
        
        System.out.println("Case6");
        currentSpeed = 2;
        riverWidth = 2;
        wagonWeight = 2;
        riverDepth = 6;
        
        expResult = -1;
        
        result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
        
        System.out.println("Case7");
        currentSpeed = 2;
        riverWidth = 2;
        wagonWeight = 1;
        riverDepth = 3;
        
        expResult = 20; 
                
        result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
        
        System.out.println("Case8");
        currentSpeed = 4;
        riverWidth = 4;
        wagonWeight = 3;
        riverDepth = 1;
        
        expResult = 100;
        
        result = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        assertEquals(expResult, result);
       
    }
    
   
    
}
