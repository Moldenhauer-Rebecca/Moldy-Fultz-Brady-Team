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
public class InventoryDailyDrawException extends Exception {

    public InventoryDailyDrawException() {
    }

    public InventoryDailyDrawException(String message) {
        super(message);
    }

    public InventoryDailyDrawException(String message, Throwable cause) {
        super(message, cause);
    }

    public InventoryDailyDrawException(Throwable cause) {
        super(cause);
    }

    public InventoryDailyDrawException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
