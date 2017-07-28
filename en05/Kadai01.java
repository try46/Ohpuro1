/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en05;

/**
 *
 * @author try
 */
public class Kadai01 {

    public static void main(String[] args) {
        String istr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String ostr;
        System.out.println(istr);
        ostr = istr.replaceAll("[T,his]", "*");
        System.out.println(ostr);
        ostr = istr.replaceAll("[^T,his]", "*");
        System.out.println(ostr);
        ostr = istr.replaceAll("[K-Zk-z]+", "*");
        System.out.println(ostr);
    }
}
