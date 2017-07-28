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
public class Sample02 {

    public static void main(String[] args) {
        String istr = "1404-1, Katakuramachi.";
        String str = "computer science 2017";
        String str1 = "この文字列は123で45678";
        String str2 = "\"public static void main";

        String ostr;
        ostr = istr.replaceAll("ata", "!");
        System.out.println(istr);//重要なところはistrは変更されない
        System.out.println(ostr);
        ostr = istr.replaceAll(" ", "*");
        System.out.println(ostr);

        ostr = istr.replaceAll("[^aui]", "@");
        System.out.println("元の文字列  " + istr);
        System.out.println(ostr);

        ostr = istr.replaceAll("[3-9]", "*");
        System.out.println(ostr);
        //.は特別な意味を持つ
        //ピリオドを置き換えたいときは\\でエスケープする。
        ostr = istr.replaceAll("\\.", "?");
        System.out.println(ostr);

        //aとその次の文字
        ostr = istr.replaceAll("a.", "_");
        System.out.println(ostr);

        //回数指定
        ostr = istr.replaceAll("[a-z]+", "*");
        System.out.println(ostr);

        //練習問題2
        ostr = str.replaceAll("e", "#");
        System.out.println(ostr);

        ostr = str.replaceAll("[a-n0-4]", "*");
        System.out.println(ostr);

        ostr = str.replaceAll("c", "");
        System.out.println(ostr);

        ostr = str.replaceAll("\\w+", "?");
        System.out.println(ostr);

        //練習問題3
        ostr = str1.replaceAll("[0-9]", "A");
        System.out.println(ostr);
        ostr = str2.replaceAll("\\s+", "-");
        System.out.println(ostr);
    }
}
