/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg03;

/**
 *
 * @author try
 */
public class Sample01 {

    public static void main(String[] args) {
        String istr;
        istr = "Tokyo University Of Technology";

        String ostr;//出力を受け取る変数
        ostr = istr.concat(", School of Computer Sience");
        System.out.println(ostr);
        System.out.println(istr);

        char i = istr.charAt(6);
        System.out.println(i);
        int j = istr.indexOf("U");
        System.out.println(j);

        ostr = istr.substring(5, 8);
        System.out.println(ostr);

        //文字列の比較(2つの文字列が同じかどうか判断する)
        //文字列の値を比較するときは==を使わない様に
        String a = "Tokyo";
        String b = "Toky";
        b = b + "o";
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        if (a.equals(b)) {
            System.out.println("The same");
        } else {
            System.out.println("different");
        }
    }
}
