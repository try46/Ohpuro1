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
public class Sample01 {

    public static void main(String[] args) {
        String istr = "1404-1, Katakura_machi";
        String ostr;
        //1.特定の文字や文字列の変更
        ostr = istr.replaceAll("a", "o");
        System.out.println(ostr);
        //2.複数の文字
        ostr = istr.replaceAll("[at]", "!");
        System.out.println(ostr);
        //3.以外
        //ostr=istr.replaceAll("[^at]", "#");
        ostr = istr.replaceAll("[A-Zb-su-z]", "?");
        System.out.println(ostr);
        //4.範囲
        ostr = istr.replaceAll("[a-m]", "-");
        System.out.println(ostr);
        //5.任意の文字
        ostr = istr.replaceAll("a.", "AB");
        System.out.println(ostr);
        //6.数字
        ostr = istr.replaceAll("\\D", "%");//数字以外を%に置換
        System.out.println("6"+ostr);
        //7単語構成「文字」→1文字
        ostr = istr.replaceAll("\\w", "@");
        System.out.println(ostr);
        //8.空白
        ostr = istr.replaceAll("[^ ]", "/");// \\Sと同じ
        //9.回数
        System.out.println(ostr);
        String istr2 = "zm zom zoom zooom zoooom zooooom";
        ostr = istr2.replaceAll("zo?m", "^o^");
        System.out.println(ostr);
        ostr = istr2.replaceAll("zo+m", "-_-");//
        System.out.println(ostr);
        String istr3 = "abcz, abcdz";
        ostr = istr3.replaceAll("a.+c", "*");//+は最長の部分を示すのでこの場合はabcz, abcがマッチする
        System.out.println(ostr);
        String istr4 = "neko neko neko neko";
        ostr = istr4.replaceAll("^neko", "inu");
        System.out.println(ostr);
        ostr = istr4.replaceAll("neko$", "kerberos");
        System.out.println(ostr);
    }
}
