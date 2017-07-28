/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en11;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author try
 */
public class Ex01 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("C0116773", "B");
        map.put("C0116777", "C");
        map.put("C0116771", "S");
        map.put("C0115881", "B");
        map.put("C0115889", "A");

        String result1 = map.get("C0115889");
        String result2 = map.get("C0116777");

        System.out.println("C0115889: " + result1);
        System.out.println("C0116777: " + result2);
    }
}
