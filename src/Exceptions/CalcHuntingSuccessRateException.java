/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Mike
 */
public class CalcHuntingSuccessRateException extends Exception {

    public CalcHuntingSuccessRateException() {
    }

    public CalcHuntingSuccessRateException(String message) {
        super(message);
    }

    public CalcHuntingSuccessRateException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalcHuntingSuccessRateException(Throwable cause) {
        super(cause);
    }

    public CalcHuntingSuccessRateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
