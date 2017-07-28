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
public class Kadai01 {

    public static void main(String[] args) {
        int a = 4053;
        String str;

        str = String.format("%d", a);
        System.out.println("10進数:" + str);
        str = String.format("%o", a);
        System.out.println("8進数:" + str);
        str = String.format("%04x", a);
        System.out.println("16進数:" + str);
        str = String.format("%,d", a);
        System.out.println(str);
        str = String.format("%,10d", a);
        System.out.println(str);
        str = String.format("%+08d", a);
        System.out.println(str);

    }
}
