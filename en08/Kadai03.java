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
public class Kadai03 {

    public static void main(String[] args) {
        Date date = new Date();
        String output;
        DateFormat dft;
        dft = new SimpleDateFormat("今日はyyyy年M月d日です");
        output = dft.format(date);
        System.out.println(output);
        Calendar cal = Calendar.getInstance();
        dft = new SimpleDateFormat("yyyy年M月d日");
        cal.add(Calendar.MONTH, 2);
        cal.add(Calendar.DAY_OF_MONTH, 27);
        output=dft.format(cal.getTime());
        System.out.println("今日から2ヶ月と27日後は" + output + "です");

    }
}
