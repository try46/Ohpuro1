/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en04;

/**
 *
 * @author try
 */
public class Kadai03 {

    public static void main(String[] args) {
        String str = "Tokyo University of Technology";
        String result;

        System.out.println(str);
        result = str.replaceAll("T", "t");
        System.out.println(result);

        result = str.replaceAll("\\s+", "");
        System.out.println(result);

        result = str.replaceAll("[io]", "+");
        System.out.println(result);

        result = str.replaceAll("[^io]", "-");
        System.out.println(result);
    }
}
