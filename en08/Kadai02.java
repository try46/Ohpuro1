/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author try
 */
public class Kadai02 {

    public static void main(String[] args) {
        Date date = new Date();
        String output;
        DateFormat dft;
        dft = new SimpleDateFormat("yyyy/MM/dd(E) a h:mm:ss.SSS z");
        output = dft.format(date);
        System.out.println(output);
        dft = new SimpleDateFormat("2017/1/1から数えて D日目");
        output = dft.format(date);
        System.out.println(output);
    }
}
