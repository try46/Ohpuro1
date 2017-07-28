package kg10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author try
 */
public class SetSample {
    public static void main(String[] args) {
        //1.Set型のHashSetを作成する
        Set<String> set=new LinkedHashSet<>();
        
        //2.setに文字列をいくつか追加
        set.add("grape");
        set.add("orange");
        set.add("apple");
        set.add("orange");//2つめ
        set.add("kiwi");
        
        
        
        
        for (String string : set) {
            System.out.println(string);
        }
    }
}
