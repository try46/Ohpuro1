/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en03;

/**
 *
 * @author try
 */
public class Kadai03 {

    public static void main(String[] args) {
        String[] strs = new String[4];
        strs[0] = "computer science";
        strs[1] = "Katakuramachi,Hachioji,Tokyo";
        strs[2] = "Before-tax price is 500 yen";
        strs[3] = "Computer Science";
        System.out.println(strs[0].lastIndexOf("c"));
        System.out.println(strs[1].substring(8, 13));
        String a = strs[2].substring(20, 23);
        System.out.println(Integer.parseInt(a) * 1.08);
        for (int j = 0; j < 4; j++) {
            if (strs[j].equalsIgnoreCase("computer science")) {
                System.out.println("CS の indexは " + j);

            }
        }
    }
}
