/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg09;

/**
 *
 * @author try
 */
public class ArraySample01 {

    public static void main(String[] args) {
        int[] a = {0, 10, 20, 30, 40,};
        int[]b=new int[a.length+1];
        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];
        }
        b[b.length-1]=50;
        a=b;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
