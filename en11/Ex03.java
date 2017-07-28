/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en11;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author try
 */
public class Ex03 {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        map.put("Cheeseburger", 130);
        map.put("Teriyai", 320);
        map.put("B.L.T", 350);
        map.put("Humburger", 100);
        map.put("Bigburger", 380);
        map.put("French fries", 270);

        Set<String> keys = map.keySet();

        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key + "," + value);
        }
    }
}
