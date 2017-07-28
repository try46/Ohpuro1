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
public class Kadai01 {

    public static void main(String[] args) {
        //Triangleクラスの変数名trのインスタンスを作成
        Triangle tr = new Triangle();
        tr.base = 7;//底辺に7を設定
        tr.height = 5;//高さに5を代入する
        System.out.println("AREA: " + tr.getArea());//出力
    }

}
