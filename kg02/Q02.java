/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg02;

/**
 *
 * @author try
 */
public class Q02 {
    public static void main(String[] args) {
        Dot d=new Dot();
        d.pos=8;
        if(d.isGreaterThan(8)){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }
}
