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
public class Ex3 {
    public static void main(String[] args) {
        String istr="    Hello!!    Hello!!";
        String ostr;
        
        ostr=istr.replaceAll("^\\s{4}", "");
        System.out.println(ostr);
        ostr=istr.replaceAll("Hello!!$", "World...");
        System.out.println(ostr);
        ostr=istr.replaceAll("^\\s{4}Hello!!", "hoge!!");
        System.out.println(ostr);
    }
   
}
