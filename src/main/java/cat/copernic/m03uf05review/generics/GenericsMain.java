/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.generics;

/**
 *
 * @author pep
 *
 * https://docs.oracle.com/javase/tutorial/extra/generics/index.html
 *
 */
public class GenericsMain {

    public static void main(String[] args) {
//        Contenedor c1 = new Contenedor("Blablblblabla");
//        Contenedor c2 = new Contenedor(1);
//
//        // int contenido = (int) c1.getContenido();
//        int contenido = (int) c2.getContenido();
//        System.out.println(contenido);

        ContenedorGenerico<String> c1 = new ContenedorGenerico<>("Blablablalba");
        String contenido = c1.getT();
    }

    
}
