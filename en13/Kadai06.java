/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author try
 */
public class Kadai06 {
    public static void main(String[] args) {
         Date date = new Date();
        String output;
        DateFormat dft;
        Calendar cal = Calendar.getInstance();
        cal.set(2017, 0, 1);
        cal.add(Calendar.DAY_OF_MONTH, -22);
        cal.add(Calendar.MONTH, -5);
        dft = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(dft.format(cal.getTime()));
        
    }
}
