/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

import Exceptions.CalcDailyMilesTraveledException;

/**
 *
 * @author crmol
 */
public class CalcDailyMilesTraveled {

    public static int calcDailyMilesTraveled(int oxenHealth, int teamHealth, int wagonWeight) throws CalcDailyMilesTraveledException {

        if (oxenHealth < 2 || oxenHealth > 6) {
            throw new CalcDailyMilesTraveledException("Oxen health must be between 2 and 6.");
        }
        if (teamHealth < 2 || teamHealth > 6) {  //teamHealth must be between 2-6
            throw new CalcDailyMilesTraveledException("Team health must be between 2 and 6.");
        }
        if (wagonWeight < 1 || wagonWeight > 3) {
            throw new CalcDailyMilesTraveledException("Wagon weight must be between 1 and 3.");
        }

        int dailyMilesTraveled = (oxenHealth + teamHealth) / wagonWeight;

        return dailyMilesTraveled;

    }

}
