/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg02;

/**
 *
 * @author try
 */
public class Q01 {

    public static void main(String[] args) {

        Dot d1, d2;
        d1 = new Dot();
        d1.pos = 10;
        d2 = new Dot();
        d2.pos = 5;
        System.out.println("d1: " + d1.pos);
        System.out.println("d2; " + d2.pos);
        d1.forward();
        d1.forward();
        d2.forward();
        System.out.println("----------");
        System.out.println("d1: " + d1.pos);
        System.out.println("d2: " + d2.pos);
    }

}
