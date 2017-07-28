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
public class Triangle {

    private final double a;
    private final double b;
    private final double c;
    private double s;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle() {
        if (a < b + c && b < c + a && c < a + b) {
            return true;
        } else {
            return false;
        }
    }
    public double getArea(){
        s=(a+b+c)/2;
        return Math.sqrt(s*((s-a)*(s-b)*(s-c)));
        
        
    }
}
