/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg08;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author try
 */
public class Sample03 {

    public static void main(String[] args) {
        int num = 0 ;

        Date date = new Date();

        DateFormat dft = DateFormat.getDateInstance();
        System.out.println(dft.format(date));

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        // cal.add(Calendar.MONTH, num);
        //スライドにない使い方
        //cal.set(2018, 10, 4);
        //1000ミリ秒=1秒
        long now = cal.getTimeInMillis();
        System.out.println(now);
      // System.out.println(dft.format(cal.getTime()));
    //練習1
    //2017/6/5が2017/1/1から何日目かを出力する
    cal.set(2017, 1, 1);
    cal.get(Calendar.DAY_OF_YEAR);
       // System.out.println(cal);
    //練習2
   //2017/6/5から10年と四日前を出力する
   
    }
}
