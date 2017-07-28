/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg13;

import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author try
 */
public class Ex08 {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            set.add(r.nextInt(10));
        }
        System.out.println("発生した乱数は"+set.size()+"種類です");
        for (Integer integer : set) {
            System.out.print(integer+",");
        }
    }
}
