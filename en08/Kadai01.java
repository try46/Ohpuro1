/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en08;

import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author try
 */
public class Kadai01 {

    public static void main(String[] args) {
        Date date = new Date();
        String output;
        DateFormat dft;

        System.out.println(date);
        dft = DateFormat.getDateInstance();
        output = dft.format(date);
        System.out.println(output);
        dft = DateFormat.getDateTimeInstance();
        output = dft.format(date);
        System.out.println(output);
        dft = DateFormat.getTimeInstance();
        output = dft.format(date);
        System.out.println(output);

    }
}
