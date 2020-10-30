/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.exceptions;

/**
 *
 * @author pep
 */
public class SensorFailureException extends GeneralRobotFailureException {

    public SensorFailureException() {
    }

    public SensorFailureException(String msg) {
        super(msg);
    }

    public SensorFailureException(String message, Throwable cause) {
        super(message, cause);
    }

    public SensorFailureException(Throwable cause) {
        super(cause);
    }

    public SensorFailureException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
