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
public class CalcDailyMilesTraveledException extends Exception {

    public CalcDailyMilesTraveledException() {
    }

    public CalcDailyMilesTraveledException(String message) {
        super(message);
    }

    public CalcDailyMilesTraveledException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalcDailyMilesTraveledException(Throwable cause) {
        super(cause);
    }

    public CalcDailyMilesTraveledException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
