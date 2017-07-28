/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author try
 */
public class Ex04 {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new TreeSet<>();
        set1.add("Python");
        set1.add("Ruby");
        set1.add("Java");
        set2.add("Java");
        set2.add("Ruby");
        set2.add("Rust");
        set3.addAll(set1);
        set3.addAll(set2);
        set1.retainAll(set2);

        for (String next : set1) {
            System.out.println(next);
        }
    }

}
