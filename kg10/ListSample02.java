/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author try
 */
public class ListSample02 {

    public static void main(String[] args) {
        List<Person> data = new ArrayList();

        String str = "First String";

        Person psn = new Person("Taro", 20);

        //date.add(str);//0番目
        //date.add("TOUKYO");
        //date.add("KYOUTO");
        //date.add(psn);//1番目
        data.add(new Person("taro", 23));
        data.add(new Person("jiro", 19));
        data.add(new Person("saburo", 16));
        
        for (Person p : data) {
            System.out.println(p);
        }

        /* for (Iterator<String> i = date.iterator(); i.hasNext();) {
            String next = i.next();
            System.out.println(next);
            
        }*/
        //String a = (String) date.get(0);
        //System.out.println("0番目の要素:" + a);
        //Person p = (Person) date.get(1);
        // System.out.println("1番目の要素:" + p);// <--PersonのtoString()が実行される
    }
}
