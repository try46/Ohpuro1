/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author try
 */
public class Sample02 {

    public static void main(String[] args) {
        Date date = new Date();
        String output;
        DateFormat dft;

        dft = DateFormat.getDateInstance();
        output = dft.format(date);
        System.out.println(output);

        dft = DateFormat.getDateTimeInstance();
        output = dft.format(date);
        System.out.println(output);

        dft = new SimpleDateFormat("yyyy年MM月dd日 E曜日 h:mm:ss ");
        output = dft.format(date);
        System.out.println(output);
        
        

    }

}
