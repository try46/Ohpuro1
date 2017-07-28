/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author try
 */
public class MapSample {

    public static void main(String[] args) {
        //1 Key:String型,Value:String型のHashMapを作る
        Map<String, String> map = new HashMap<>();
        //2．keyとvalueを関連付けてMapへ追加する。
        //最初の引数がkey,次の引数が、keyに関連付けたvalue
        map.put("apple", "red");
        map.put("lemon", "yellow");
        map.put("banana", "yellow");
        map.put("grape", "violet");
        map.put("banana", "green");

        //3.keyを指定して、対応するvalueを取り出し、出力してみる
        String result = map.get("banana");
        System.out.println("bananaに対応する値は " + result);
        System.out.println(map.get("kiwi"));

        //intをvalueとしてもつMap
        Map<String, Integer> seiseki = new TreeMap<>();
        seiseki.put("C0116991", 2);
        seiseki.put("C0116992", 3);
        seiseki.put("C0116993", 1);
        System.out.println("------------------------");
        System.out.println("C0116991のGPAは" + seiseki.get("C0116991"));
        System.out.println("------------------------");
        
        //4.mapからすべての要素を取り出す
        //戻り値はSet型
        //Setの要素はMap.Entry<String,String>型に限定する。
        Set<Map.Entry<String, String>> entrys = map.entrySet();
        
        //5.拡張for文でentriesがらMap.Entryを1つ1つ取り出す
        //そのMap.Entryをkeyとvalueに分けて出力する
        for (Map.Entry<String, String> entry : entrys) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("KEY: " + key + ", VALUE: " + value);
        }
        
        System.out.println("-------------------------");
        
        //5.2mapからSetのを取得しkeysに代入する。
        //(mapの中に「同じキー」は存在しない--＞Set)
        Set<String> keys = map.keySet();
        
        for (String key : keys) {
            String value = map.get(key);
            System.out.println("KEY: " + key + ", VALUE: " + value);
        }
    }
}
