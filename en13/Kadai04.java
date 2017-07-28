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
public class Kadai04 {
    public static void main(String[] args) {
        int a=2048;
        double b=8.3144598;
        System.out.println(String.format("%,d", a));
        System.out.println(String.format("%8d", a));
        System.out.println(String.format("%,08d", a));
        System.out.println(String.format("%.4f", b));
        System.out.println(String.format("%0,10.2f", b));
    }
    
}
