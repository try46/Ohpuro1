/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author try
 */
public class Kadai04 {

    public static void main(String[] args) {
        Date date = new Date();
        String output;
        DateFormat dft;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        dft = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss,");
        long time1 = cal.getTimeInMillis();
        output = dft.format(date);
        System.out.println(output + time1);
        cal.clear();
        cal.set(2020, 6, 24, 20, 0, 0);
        long time2 = cal.getTimeInMillis();
        output = dft.format(cal.getTime());
        System.out.println(output + time2);
        long time3 = time2 - time1;
        long second = time3 / 1000;
        long minute = second / 60;
        long hour = minute / 60;
        long day = hour / 24;
        long year = day / 365;
        System.out.println( "東京オリンピックまであと" + day + "日と" + (hour - day * 24) + "時間" + (minute - hour * 60) + "分" + (second - minute * 60) + "秒");

    }

}
