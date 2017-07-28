/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg10;

/**
 *
 * @author try
 */
public class Person {
    private String name;//人の名前
    private int age;//人の年齢
    
    //コンストラクタ
    public Person(String name,int age){
     this.name=name;
     this.age=age;
    }
    //System.out.printlnやJTextAreaのappend()で出力する際に
    //自動的に呼び出されるメソッド
    //toString()メソッド
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
    
}
