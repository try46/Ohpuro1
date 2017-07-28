/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg05;

/**
 *
 * @author try
 */
public class Ex2 {

    public static void main(String[] args) {
        String istr = "[30/Apr/2014:21:37:38 +0900] GET /favicon.ico HTTP/1.1";
        String ostr;
        //数字を消す
        ostr = istr.replaceAll("\\d", "");//""に置き換える→削除
        System.out.println(ostr);
        ostr = istr.replaceAll("[\\w/]", "?");//単語構成文字と/
        System.out.println(ostr);
        ostr = istr.replaceAll(" .", "--");//空白+1文字が--に変わっている
        System.out.println(ostr);
    }
}
