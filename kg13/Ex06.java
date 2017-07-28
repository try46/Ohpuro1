/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author try
 */
public class Ex06 {

    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        DateFormat dft;
        String output;
        dft = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        output = dft.format(date);
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 10);
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println(dft.format(calendar.getTime()));
    }
}
