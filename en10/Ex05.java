/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author try
 */
public class Ex05 {

    public static void main(String[] args) {
        // List<String> list=new ArrayList<>();
        String input = "A friend of all is a friend to none";
        String str[] = input.split(" ", 0);
        Set set = new TreeSet();
        System.out.print("INPUT: ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
            str[i] = str[i].toLowerCase();
            set.add(str[i]);
        }
        System.out.println();
        System.out.println("WORDS :" + set.size());
        for (Iterator iterator = set.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.print(next + ",");
        }
    }
}
