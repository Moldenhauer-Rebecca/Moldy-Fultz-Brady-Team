package byui.cit260.mfbMormonTrail.control;

import Exceptions.CalcCrossRiverSuccessException;

/**
 *
 * @author Rebecca
 */
public class CalcCrossRiverSuccess {

    public static int calcCrossRiverSuccess(int currentSpeed, int riverWidth, int wagonWeight, int riverDepth) throws CalcCrossRiverSuccessException {

        if (currentSpeed < 2 || currentSpeed > 4) {
            throw new CalcCrossRiverSuccessException("Current speed value must be between 2 and 4.");
        }

        if (riverWidth < 2 || riverWidth > 4) {
            throw new CalcCrossRiverSuccessException("River width value must be between 2 and 4.");
        }

        if (wagonWeight < 2 || wagonWeight > 4) {
            throw new CalcCrossRiverSuccessException("Wagon weight value must be between 2 and 4.");
        }

        if (riverDepth <= 0 || riverDepth >= 6) {
            throw new CalcCrossRiverSuccessException("River depth value must be between 1 and 5.");
        }
        int successRate = ((currentSpeed + riverWidth + wagonWeight) - riverDepth) * 10;

        return successRate;

    }

}
