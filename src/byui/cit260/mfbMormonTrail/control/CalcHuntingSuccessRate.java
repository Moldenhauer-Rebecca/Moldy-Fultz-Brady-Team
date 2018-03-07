

package byui.cit260.mfbMormonTrail.control;

/**
 *
 * @author samue
 */
public class CalcHuntingSuccessRate {

    
    
    public static double calcHuntingSuccessRate(int teamSkillLevel, int resourceAvailablity) {
        
        if (teamSkillLevel < 1 || teamSkillLevel > 3) {
            return -1;
        }
    
        if (resourceAvailablity < 1 || resourceAvailablity > 3) { 
            return -2;
        }
        
        int huntingSuccessRate = (teamSkillLevel + resourceAvailablity)*10;
    
        
        return huntingSuccessRate;
        
        
        
    }
 }
    

    
