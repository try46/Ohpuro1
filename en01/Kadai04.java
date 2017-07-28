/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en01;

/**
 *
 * @author try
 */
public class Kadai04 {

    public static void main(String[] args) {
        int[] r = new int[5];
        for (int i = 0; i < 5; i++) {
            r[i] = new java.util.Random().nextInt(101);
            if (r[i] <= 60) {
                System.out.println(r[i] + ",FAIL");
            } else {
                System.out.println(r[i] + ",PASS");
            }

        }
    }
}
