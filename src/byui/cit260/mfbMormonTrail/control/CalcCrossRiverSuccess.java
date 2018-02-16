
package byui.cit260.mfbMormonTrail.control;


/**
 *
 * @author crmol
 */
public class CalcCrossRiverSuccess {
    
    public static boolean calcCrossRiverSuccess(int currentSpeed, int riverWidth, int wagonWeight, int riverDepth) {
        
        if (currentSpeed < 2 || currentSpeed > 4) {
            return false;
        }
        
        if (riverWidth < 2 || riverWidth > 4) {
            return false;
        }
        
        if (wagonWeight < 2 || wagonWeight > 4) {
            return false;
        }
        
        if (riverDepth <=0 || riverDepth >=6) {
            return false;
        }
        int successRate = ((currentSpeed + riverWidth + wagonWeight) - riverDepth) * 10;
            
        return successRate >= 50;   
       
    }
    
}
