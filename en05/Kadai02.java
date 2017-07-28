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
public class Kadai02 {

    public static void main(String[] args) {
        String istr = "TEL: 042-637-2111, TEL: 03-6424-2111";
        String ostr;
        System.out.println(istr);
        ostr = istr.replaceAll("\\d+", "x");
        System.out.println(ostr);
        ostr = istr.replaceAll("^TEL", "tel");
        System.out.println(ostr);
        ostr = istr.replaceAll("\\d{4}$", "*");
        System.out.println(ostr);
    }
}
