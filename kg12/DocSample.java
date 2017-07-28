/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg12;

/**
 *
 * @author try
 */
public class DocSample {

    public static void main(String[] args) {
        Person p = new Person("tut", 1.70, 65);
       // double bmi = p.getBMI();
        ;
        System.out.println(p + ", BMI: " + p.getBMI());
        p.diet(12);
        System.out.println(p + ", BMI: " + p.getBMI());
    }
}
