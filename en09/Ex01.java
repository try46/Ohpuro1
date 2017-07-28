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
public class Ex01 {
    public static void main(String[] args) {
        List data=new ArrayList();
        String s1="School";
        String s2="Computer";
        
        data.add(s1);
        data.add(s2);
        System.out.println("===BEFORE===");
        System.out.println("SIze: "+data.size());
        for (int i = 0; i < data.size(); i++) {
            String str=(String)data.get(i);
            System.out.println(str);
        }
        String s3="of";
        data.add(1,s3);
        System.out.println("===AFTER===");
        System.out.println("Size: "+data.size());
        for (int i = 0; i < data.size(); i++) {
            String stri=(String)data.get(i);
            System.out.println(stri);
        }
        
    }
}
