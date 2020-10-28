/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.lambdas;

/**
 *
 * @author pep
 */
public class StringFunctionMain {
    public static void main(String[] args) {
        StringFunction identitat = s -> s;
        StringFunction aMajusucles = s -> s.toUpperCase();
        printFormatedText("En un lugar de la Mancha", identitat);
        printFormatedText("En un lugar de la Mancha", aMajusucles);
        printFormatedText("En un lugar de la Mancha", (String s)-> s.substring(0, 3) + "...");
    }
    
    public static void printFormatedText(String str, StringFunction sf) {
        System.out.println(sf.op(str));
    }
    
}
