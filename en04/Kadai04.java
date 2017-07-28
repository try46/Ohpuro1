/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en04;

/**
 *
 * @author try
 */
public class Kadai04 {

    public static void main(String[] args) {
        String str = "ADDR: 1404-1, Katakuramachi, Hachioji, Tokyo 192-0982, Japan";
        String result;

        System.out.println(str);
        result = str.replaceAll("chi", "*");
        System.out.println(result);
        result = str.replaceAll("[0-9]", "*");
        System.out.println(result);
        result = str.replaceAll("[a-zA-Z_0-9]", "x");
        System.out.println(result);
        result = str.replaceAll("[A-Z]+", "!");
        System.out.println(result);
        result = str.replaceAll("\\d\\d\\d\\d", "?");//これ以外にも\\d{4}でも同じ結果が出る
        System.out.println(result);
    }

}
