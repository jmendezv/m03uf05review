/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review;

import cat.copernic.m03uf05review.annotations.Tag;
import java.lang.reflect.AnnotatedElement;

/**
 *
 * @author pep
 */
@Tag(value = "Main class")
public class M03Uf05review {
    
    public static void main(String[] args) {
        System.out.println("Hi");
        M03Uf05review instance = new M03Uf05review();
        Tag tag = (Tag) instance.getClass().getAnnotations()[0];
        System.out.println(tag.value());
    }
}
