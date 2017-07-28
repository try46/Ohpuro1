/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en01;

/**
 *
 * @author try
 */
public class Kadai05 {

    public static void main(String[] args) {
        int a;//int型の変数aを宣言
        int[] r = new int[6];//int型の配列6個作ります
        for (int i = 0; i < 100; i++) {//100回繰り返す
            a = new java.util.Random().nextInt(6);//5までの乱数をaに突っ込む
            r[a]++;//配列の各要素が出力された際に増やす
        }
        for (int j = 0; j < 6; j++) {
            System.out.println(j + ":" + r[j] + "times");//出力

        }
    }
}
