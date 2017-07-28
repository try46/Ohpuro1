/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author try
 */
public class Ex03 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Ruby");
        System.out.println("---- STEP 1 ----");
        System.out.println("リストの大きさ: "+list.size());
        for (String next : list) {
            System.out.println(next);
        }
        System.out.println("---- STEP 2 ----");
        list.add(1,"Perl");
        list.remove(3);
        list.add(0, "GO");
        System.out.println("リストの大きさ: "+list.size());
        for (String next : list) {
            System.out.println(next);
        }
    }
}
