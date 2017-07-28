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
public class Ex04 {

    public static void main(String[] args) {
        int[] a = {50, 40, 30, 20, 10, 0};
        for (int i = 0; i < 8; i++) {

            try {
                int val = 100 / a[i];
                System.out.println("val = " + val);
            } catch (ArithmeticException e) {
                System.out.println("divided by zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException");
            }
        }
    }
}
