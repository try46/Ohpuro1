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
public class Ex1 {
    public static void main(String[] args) {
        String istr="School of Computer Science.";
        String ostr;
        ostr=istr.replaceAll("oo", "-");
        System.out.println(ostr);
        ostr=istr.replaceAll("[o\\s]", "*");
        System.out.println(ostr);
        ostr=istr.replaceAll("[\\.]", "?");//エスケープは\でもok
        
        System.out.println(ostr);
    }
}
