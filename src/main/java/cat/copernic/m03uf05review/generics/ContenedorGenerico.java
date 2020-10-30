/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.generics;

/**
 *
 * @author pep
 */
public class ContenedorGenerico<T> {

    private T t;

    public ContenedorGenerico(T t) {
        this.t = t;
    }

    /**
     * Get the value of t
     *
     * @return the value of t
     */
    public T getT() {
        return t;
    }

    /**
     * Set the value of t
     *
     * @param t new value of t
     */
    public void setT(T t) {
        this.t = t;
    }

}
