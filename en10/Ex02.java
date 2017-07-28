/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author try
 */
public class Ex02 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //String  ="tirqo";
        set.add("Tokyo");
        set.add("Kanagawa");
        set.add("Saitama");
        set.add("Tokyo");
        set.add("Saitama");

        for (Iterator<String> it = set.iterator(); it.hasNext();) {
            String next = it.next();
            System.out.println(next);
        }
    }
}
