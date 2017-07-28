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
public class Kadai02 {

    public static void main(String[] args) {
        double b = -271828.1828459;
        String str;

        str = String.format("%f", b);
        System.out.println(str);
        str = String.format("%.3f", b);
        System.out.println(str);
        str = String.format("%10.1f", b);
        System.out.println(str);
        str = String.format("%0,15.4f", b);
        System.out.println(str);
        str = String.format("%13.3e", b);
        System.out.println(str);
    }

}
