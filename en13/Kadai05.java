/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en13;

/**
 *
 * @author try
 */
public class Kadai05 {
    public static void main(String[] args) {
        String input="http;//www.teu.ac.jp/gakubu.cs/006333.html";
        
        String output;
        
        output=input.replaceAll("\\d", "*");
        System.out.println(output);
        output=input.replaceAll("\\.", "*");
        System.out.println(output);
        output=input.replaceAll("^h", "*");
        System.out.println(output);
        output=input.replaceAll("\\w+", "*");
        System.out.println(output);
    }
}
