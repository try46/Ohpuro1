/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en14;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author try
 */
public class Ex04 {
    public static void main(String[] args) {
        Random r=new Random();
        Set<Integer> set=new TreeSet<>();
        
        System.out.println("乱数を20回出力します");
        for (int i = 0; i < 20; i++) {
            i=r.nextInt(20);
            System.out.print(i+",");
            set.add(i);
        }
        System.out.println("");
        System.out.println("乱数の種類: "+set.size());
        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            System.out.print(next+",");
            
        }
    }
}
