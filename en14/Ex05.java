/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en14;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author try
 */
public class Ex05 {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("MILK", 1);
        map.put("TOMATO", 3);
        map.put("YOGURT", 4);
        System.out.println("---- STEP 1 ----");
        Set<Map.Entry<String, Integer>> entrys = map.entrySet();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "," + value);

        }

        System.out.println("---- STEP 2 ----");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue() - 1;
            map.put(key, value);
            System.out.println(key + "," + map.get(key));

        }
    }
}
