/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.annotations;

import java.lang.annotation.Repeatable;

/**
 *
 * @author pep
 * 
 * https://docs.oracle.com/javase/tutorial/java/annotations/
 * 
 */
@Repeatable(Schedules.class)
public @interface Schedule {
    int dayOfMonth() default 1;
    String monthOfYear() default "January";
    int hour() default 12;
}
