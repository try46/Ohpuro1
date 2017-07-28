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
public class Ex05 {

    public static void main(String[] args) {
        String input = "There is strong shadow where there is much light.";
        String output = input.toLowerCase().replaceAll("\\.", "");
        //
     //System.out.println(output);
        String str[] = output.split(" ");
        
        Map<String, Integer> map = new TreeMap<>();
        for (String str1 : str) {
            map.put(str1, 1);
        }
        Set<Map.Entry<String, Integer>> entrys = map.entrySet();
        for (String str1 : str) {
            map.entrySet().forEach((entry) -> {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if (key == str1) {
                    map.containsValue(value);
                }
            });
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+":"+value);
            
        }
    }
}
