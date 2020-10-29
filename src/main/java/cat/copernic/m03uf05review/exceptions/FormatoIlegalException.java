/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.exceptions;

/**
 *
 * @author pep
 * 
 * https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html
 * 
 */
public class FormatoIlegalException extends Exception {

    /**
     * Creates a new instance of <code>FormatoIlegalException</code> without
     * detail message.
     */
    public FormatoIlegalException() {
    }

    /**
     * Constructs an instance of <code>FormatoIlegalException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public FormatoIlegalException(String msg) {
        super(msg);
    }
}
