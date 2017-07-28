/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author try
 */
public class Ex04 {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("C0116773", "B");
        map.put("C0116777", "C");
        map.put("C0116771", "S");
        map.put("C0115881", "B");
        map.put("C0115889", "A");
        Set<Map.Entry<String, String>> entrys = map.entrySet();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "." + value);

        }
    }
}
