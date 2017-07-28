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
public class Kadai04 {

    public static void main(String[] args) {
        /*
        Cubeクラスの要素数6の配列変数名cubesを宣言
         */
        Cube[] cubes = new Cube[6];

        for (int i = 0; i < 6; i++) {//iは0~6までiは1ずつ増える
            /*
            iを2で割った余りが1の時
            引数が一つあるインスタンスを作成
             */
            if (i % 2 == 1) {
                cubes[i] = new Cube(i);
            } else {//それ以外の時(余りが0)は引数無しのインスタンスを作成
                cubes[i] = new Cube();
            }
            /*
            以下2行は出力
             */
            System.out.print("C " + i);
            System.out.println(
                    "SIDE :" + cubes[i].getSide() + ", VOL" + cubes[i].getVolume());
        }
    }
}
