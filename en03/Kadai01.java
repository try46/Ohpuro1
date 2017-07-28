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
public class Kadai01 {
    public static void main(String[] args) {
        Computer c1=new Computer();
        Computer c2=new Computer("Linux");
        Computer c3=new Computer("Windows10",16);
        System.out.println(c1.getOS()+","+c1.getRam()+","+c1.getDisk());
        System.out.println(c2.getOS()+","+c2.getRam()+","+c2.getDisk());
        System.out.println(c3.getOS()+","+c3.getRam()+","+c3.getDisk());
    }
}
