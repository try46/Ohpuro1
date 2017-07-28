/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author try
 */
public class Ex07 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String s1 = "Hino";
        String s2 = "Toyoda";
        String s3 = "Hachioji";
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println("Hino,Toyoda,Hachiojiのリストを作成します");
        for (String string : list) {
            System.out.print(string + ",");

        }
        System.out.println("先頭にTachikawaを挿入します");
        String s4 = "Tachikawa";
        list.add(1, s4);
        for (String string : list) {
            System.out.print(string + ",");
        }
        System.out.println();
        System.out.println("Hino,Toyodaを削除します");
        list.remove(s1);
        list.remove(s2);
        for (String string : list) {
            System.out.print(string + ",");

        }
    }
}
