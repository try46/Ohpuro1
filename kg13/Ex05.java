/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author try
 */
public class Ex05 {

    public static void main(String[] args) {
        Date date = new Date();
        String output;
        DateFormat dft;
        dft = new SimpleDateFormat("今日はyyyy/MM/dd HH:mm:ss,1月1日からD日");
        output = dft.format(date);
        System.out.println(output);
    }
}
