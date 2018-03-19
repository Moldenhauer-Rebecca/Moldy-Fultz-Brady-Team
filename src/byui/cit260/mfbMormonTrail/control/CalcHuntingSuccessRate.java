package byui.cit260.mfbMormonTrail.control;

import Exceptions.CalcHuntingSuccessRateException;

/**
 *
 * @author samue
 */
public class CalcHuntingSuccessRate {

    public static double calcHuntingSuccessRate(int teamSkillLevel, int resourceAvailablity) throws CalcHuntingSuccessRateException {

        if (teamSkillLevel < 1 || teamSkillLevel > 3) {
            throw new CalcHuntingSuccessRateException("team skill level must be between 1 and 3");

        }

        if (resourceAvailablity < 1 || resourceAvailablity > 3) {
            throw new CalcHuntingSuccessRateException("resource availability must be between 1 and 3");
        }

        int huntingSuccessRate = (teamSkillLevel + resourceAvailablity) * 10;

        return huntingSuccessRate;

    }
}
