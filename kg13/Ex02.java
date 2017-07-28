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
public class Ex02 {

    public static void main(String[] args) {
        String str = "Tokyo University of Technology";
        String[] output = str.split(" ");
        System.out.println(str.charAt(15));
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(6, 9));
        System.out.println(str.indexOf("o", 10));
        System.out.println(output[2]);

    }
}
