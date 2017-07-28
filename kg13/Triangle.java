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
public class Triangle {

    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (double) base * height / 2;
    }

    public void enlarge(int n) {
        base = base * n;
        height = height * n;
    }
}
