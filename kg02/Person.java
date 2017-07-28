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
public class Person {

    private String name;
    private double height;
    private double weight;

    public Person(String nm) {
        this.name = nm;
    }

    public String getName() {
        return name;
    }

    public void setParams(double h, double w) {
        this.height = h;
        this.weight = w;
    }

    public double getBMI() {
        return (weight) / (height*height);
    }
}
