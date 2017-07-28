/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author try
 */
public class Ex03 {

    public static void main(String[] args) {
        List data = new ArrayList();
        // Random random = new Random();
        int r;
        //int count = 0;
        int num = 0;
        for (int i = 0; i < 10; i++) {
            r = new Random().nextInt(10);
            data.add(r);

        }
        for (Iterator daIt = data.iterator(); daIt.hasNext();) {

            int s = (int) daIt.next();
            System.out.print(s + " ,");
            if (s == 7) {
                num += 1;
            }

        }
        System.out.print("\n");
        System.out.println("7は" + num + "個です");
    }
}
