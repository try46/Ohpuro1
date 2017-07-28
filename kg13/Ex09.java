/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg13;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author try
 */
public class Ex09 {
    public static void main(String[] args) {
        TreeMap<String,Integer> tmap=new TreeMap<>();
        tmap.put("Python", 23);
        tmap.put("Ruby", 30);
        tmap.put("C++", 400);
        tmap.put("Java",220);
        Set <Map.Entry<String,Integer>> set=tmap.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
            
        }
    }

