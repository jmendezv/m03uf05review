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
public class SoftwareFailureException extends GeneralRobotFailureException {

    public SoftwareFailureException() {
    }

    public SoftwareFailureException(String msg) {
        super(msg);
    }

    public SoftwareFailureException(String message, Throwable cause) {
        super(message, cause);
    }

    public SoftwareFailureException(Throwable cause) {
        super(cause);
    }

    public SoftwareFailureException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
