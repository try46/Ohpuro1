/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author try
 */
public class sample01 {

    public static void main(String[] args) {
        List data = new ArrayList();

        String s1 = "Katakuramachi";
        String s2 = "Hachioji";
        String s3 = "Tokyo";
        //int s4=100;//int型の100を追加した

        data.add(s1);
        data.add(s2);
        data.add(s3);
        /*
        for (int i = 0; i < data.size(); i++) {
            String str=(String)data.get(i);//getで得られる要素の型を指定
            System.out.println(str);
        }
         */
        for (Iterator it = data.iterator(); it.hasNext();) {
            String str = (String) it.next();
            System.out.println(str);

        }

    }
}
