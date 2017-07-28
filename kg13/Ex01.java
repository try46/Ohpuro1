/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg13;

/**
 *
 * @author try
 */
public class Ex01 {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(2, 5);
        Triangle t2 = new Triangle(3, 7);
        String s2="03-6424-2111";
        System.out.println(s2.replaceAll("1$", "@"));
        String s1="(Katakura)";
        System.out.println(s1.replaceAll("[tr].", "#"));
        System.out.println("t1の面積は : " + t1.getArea());
        System.out.println("t2の面積は : " + t2.getArea());
        t1.enlarge(2);
        t2.enlarge(3);
        System.out.println("t1の底辺と高さを2倍にします");
        System.out.println("t2の底辺と高さを3倍にします");
        System.out.println("t1の面積は : " + t1.getArea());
        System.out.println("t2の面積は : " + t2.getArea());

    }
}
