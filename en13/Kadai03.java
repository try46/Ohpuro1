/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en13;

/**
 *
 * @author try
 */
public class Kadai03 {
    public static void main(String[] args) {
        String input="School of Computer Science";
        String output;
        //int out;
        System.out.println(input.length());
        System.out.println(input.substring(12, 15));
        System.out.println(input.lastIndexOf("e", 24));
        System.out.println(input.contains("put"));
        String[]aa =input.split("e");
        System.out.println("要素数は"+aa.length);
        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i]+",");
        }
        
    
                
                
               
                
        
    }
}
