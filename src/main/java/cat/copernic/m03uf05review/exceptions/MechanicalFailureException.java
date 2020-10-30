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
public class MechanicalFailureException extends GeneralRobotFailureException {

    public MechanicalFailureException() {
    }

    public MechanicalFailureException(String msg) {
        super(msg);
    }

    public MechanicalFailureException(String message, Throwable cause) {
        super(message, cause);
    }

    public MechanicalFailureException(Throwable cause) {
        super(cause);
    }

    public MechanicalFailureException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
