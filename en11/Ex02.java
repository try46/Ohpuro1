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
public class Ex02 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Cheeseburger", 130);
        map.put("Teriyai", 320);
        map.put("B.L.T", 350);
        map.put("Humburger", 100);
        map.put("Bigburger", 380);
        map.put("French fries", 270);

        System.out.println("B.L.T.: " + map.get("B.L.T"));
        System.out.println("French fries: " + map.get("French fries"));

    }
}
