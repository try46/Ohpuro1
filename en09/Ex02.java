/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en09;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author try
 */
public class Ex02 {

    public static void main(String[] args) {
        List data = new ArrayList();
        String s1 = "Tokyo";
        String s2 = "Kanagawa";
        String s3 = "Saitama";
        //String s4 = "Gunma";
        Boolean isKanagawa = false;
        Boolean isChiba = false;

        data.add(s1);
        data.add(s2);
        data.add(s3);
        System.out.println("=== Items ===");
        for (int i = 0; i < data.size(); i++) {
            String str = (String) data.get(i);
            System.out.println(str);
            if (data.get(i) == "Kanagawa") {
                isKanagawa = true;
                data.remove(i);
                data.add(i, "Gunma");
            } else if (data.get(i) == "Chiba") {
                isChiba = true;
            }
        }

        System.out.println("===Checking Kanagawa===");
        if (isKanagawa = true) {
            System.out.println("Found");
        }
        System.out.println("===Checking Chiba===");
        if (isChiba = true) {
            System.out.println("Not Found");
        }
        System.out.println("====Replacing an item ===");
        for (int i = 0; i < data.size(); i++) {
        String string=(String)data.get(i);
            System.out.println(string);
        }
        
    }
}
