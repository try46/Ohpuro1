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
public class Kadai03 {
    public static void main(String[] args) {
        String istr="error404, Mar 13 00:21:20 2017, 254651203 bytes";
        String ossr;
        System.out.println(istr);
        ossr=istr.replaceAll("\\d{9}", "*");
        System.out.println(ossr);
        ossr=istr.replaceAll("\\d{2,4}", "*");
        System.out.println(ossr);
        ossr=istr.replaceAll("\\d{4,}", "*");
        System.out.println(ossr);
    }
}
