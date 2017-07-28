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
public class ListSample01 {

    public static void main(String[] args) {
        List date = new ArrayList();

        String str = "First String";

        Person psn = new Person("Taro", 20);

        date.add(str);//0番目
        date.add(psn);//1番目

        String a = (String) date.get(0);
        System.out.println("0番目の要素:" + a);

        Person p = (Person) date.get(1);
        System.out.println("1番目の要素:" + p);// <--PersonのtoString()が実行される

    }

}
