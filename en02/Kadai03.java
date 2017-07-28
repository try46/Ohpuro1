/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en02;

/**
 *
 * @author try
 */
public class Kadai03 {

    
    public static void main(String[] args) {
        //Cube型の引数が一つのインスタンスを作成
        Cube c1 = new Cube(4);
        /*
        以下2行出力
        */
        System.out.print("C1, ");
        System.out.println("SIDE: " + c1.getSide() + ", VOL:" + c1.getVolume());
        //Cube型の引数無しのインスタンスを作成
        Cube c2 = new Cube();
        /*
        以下2行出力
        */
        System.out.print("C2, ");
        System.out.println("SIDE: " + c2.getSide() + ", VOL" + c2.getVolume());
    }
}
