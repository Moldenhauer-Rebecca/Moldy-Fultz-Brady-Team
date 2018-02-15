/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

/**
 *
 * @author crmol
 */
public class CalcDailyMilesTraveled {
    
    public static int calcDailyMilesTraveled(int oxenHealth, int teamHealth, int wagonWeight) {
        
        if (oxenHealth < 2 || oxenHealth > 6) {
            return -1;
        }
        if (teamHealth < 2 || teamHealth > 6) {  //teamHealth must be between 2-6
            return -2;
        }
        if (wagonWeight < 1 || wagonWeight > 3) {
            return -3;
        }
        
     int dailyMilesTraveled = (oxenHealth + teamHealth) / wagonWeight;
        
       
        return dailyMilesTraveled;
        
    }
    
}
