/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg04;

/**
 *
 * @author try
 */
public class Sample01 {

    public static void main(String[] args) {
        int n = 12345678;
        double d = -9876.54321;
        String str;
        //，を入れる(三桁ごとに)
        str = String.format("%,d", n);
        System.out.println(str);
        //全体を10桁にして足りない所に0を入れる。
        str = String.format("%,013d", n);
        System.out.println(str);
        //四捨五入
        str = String.format("%010.3f", d);
        System.out.println(str);

        //↓符号や，小数点も桁数に含まれる。
        str = String.format("%0,10.2f", d);
        System.out.println(str);
        //indexの例
        str = String.format("%1$+d と %2$f", n, d);
        System.out.println(str);

    }
}
