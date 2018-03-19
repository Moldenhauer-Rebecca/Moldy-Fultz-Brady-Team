/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Rebecca and Chelsie
 */
public class CalcCrossRiverSuccessException extends Exception {

    public CalcCrossRiverSuccessException() {
    }

    public CalcCrossRiverSuccessException(String message) {
        super(message);
    }

    public CalcCrossRiverSuccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalcCrossRiverSuccessException(Throwable cause) {
        super(cause);
    }

    public CalcCrossRiverSuccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
