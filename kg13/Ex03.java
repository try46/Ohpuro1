/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg13;

/**
 *
 * @author try
 */
public class Ex03 {

    public static void main(String[] args) {
        String input = "2017/07/10 15:47:51 c0116999ab Ex03.java ok.";
        String output;
        output = input.replaceAll("\\d", "+");
        System.out.println(output);
        output = input.replaceAll("[^\\d]", "@");
        System.out.println(output);
        output = input.replaceAll("[a-zA-Z]+", "#");
        System.out.println(output);
        output = input.replaceAll("[^\\w]", "=");
        System.out.println(output);
        output = input.replaceAll("\\.$", "?");
        System.out.println(output);
    }
}
